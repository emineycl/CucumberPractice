package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationExercisePage;
import utilites.ConfigReader;
import utilites.Driver;

public class AutomationExerciseStepDefinitions {

    AutomationExercisePage page=new AutomationExercisePage();

    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @Then("Kullanici Signup butonuna tiklar")
    public void kullanici_signup_butonuna_tiklar() {
      page.signUpLink.click();
    }
    @Then("Kullanici mail bolumune {string} gonderir")
    public void kullanici_mail_bolumune_gonderir(String istenenMail) {
     page.emailBox.sendKeys(ConfigReader.getProperty(istenenMail));
    }
    @Then("Kullanici password bolumune {string} gonderir")
    public void kullanici_password_bolumune_gonderir(String istenenPassword) {
     page.passwordBox.sendKeys(ConfigReader.getProperty(istenenPassword));
    }
    @Then("Kullanici login Butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
     page.loginButonu.click();
    }
    @Then("Kullanici Automation sayfasina giris yaptigini test eder")
    public void kullanici_automation_sayfasina_giris_yaptigini_test_eder() {
        Assert.assertTrue(page.logoutButonu.isDisplayed());
    }

    @Then("Kullanici sayfaya giris yapilamadigini test eder")
    public void kullanici_sayfaya_giris_yapilamadigini_test_eder() {
       Assert.assertTrue(page.loginButonu.isDisplayed());
    }


}
