package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QualityDemyPage;
import utilites.ConfigReader;


public class QualityDemySignupStepDefinitions {
     QualityDemyPage qualityDemyPage=new QualityDemyPage();

    @Then("Kullanici demy sayfasinda Signup linkine tiklar")
    public void kullanici_demy_sayfasinda_signup_linkine_tiklar() {
      qualityDemyPage.acceptCookies.click();
      qualityDemyPage.signupLink.click();
    }
    @Then("Kullanici Firstname box a {string} gonderir")
    public void kullanici_firstname_box_a_gonderir(String isim) {
        qualityDemyPage.firstnameBox.sendKeys(ConfigReader.getProperty(isim));
    }
    @Then("Kullanici Lastname box a {string} gonderir")
    public void kullanici_lastname_box_a_gonderir(String soyisim) {
         qualityDemyPage.lastnameBox.sendKeys(ConfigReader.getProperty(soyisim));

    }
    @Then("Kullanici Email box a {string} gonderir")
    public void kullanici_email_box_a_gonderir(String mail) {
       qualityDemyPage.signupEmailBox.sendKeys(ConfigReader.getProperty(mail));
    }
    @Then("Kullanici Password box a {string} gonderir")
    public void kullanici_password_box_a_gonderir(String sifre) {
     qualityDemyPage.signupPasswordBox.sendKeys(ConfigReader.getProperty(sifre));
    }
    @Then("Kullanici demy sayfasinda Signup Butonuna tiklar")
    public void kullanici_demy_sayfasinda_signup_butonuna_tiklar() {
    qualityDemyPage.signupButton.click();
    }
    @Then("Kullanici uye hesabi olusturmaadigini test eder")
    public void kullanici_uye_hesabi_olusturmaadigini_test_eder() {
     Assert.assertTrue(qualityDemyPage.signupButton.isDisplayed());
        System.out.println(qualityDemyPage.hataMesaji.getText());
    }

}
