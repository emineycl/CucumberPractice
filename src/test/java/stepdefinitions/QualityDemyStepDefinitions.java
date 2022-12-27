package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.QualityDemyPage;
import utilites.ConfigReader;
import utilites.Driver;
import utilites.ReusableMethods;

public class QualityDemyStepDefinitions {
    QualityDemyPage demyPage=new QualityDemyPage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("Kullanici quality demy sayfasina gider")
    public void kullanici_quality_demy_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        ReusableMethods.bekle(2);
        demyPage.acceptCookies.click();
    }
    @When("Email ve password bilgilerini girerek giris yapar")
    public void email_ve_password_bilgilerini_girerek_giris_yapar() {
    demyPage.loginLink.click();
    demyPage.emailBox.sendKeys(ConfigReader.getProperty("myGecerliEmailInsBora"));
    demyPage.passwordBox.sendKeys(ConfigReader.getProperty("myGecerliPasswordInsBora"));
    demyPage.loginButton.click();
    }
    @Then("Basarili bir sekilde giris yaptigini test eder")
    public void basarili_bir_sekilde_giris_yaptigini_test_eder() {
        Assert.assertTrue(demyPage.demyPicture.isDisplayed());
    }
    @And("Sayfayi kapatir")
    public void sayfayi_kapatir() {
    Driver.closeDriver();
    }

    @Then("Click cookies pop-up message")
    public void click_cookies_pop_up_message() {
     demyPage.acceptCookiesLev.click();
    }

    @Then("Test if Facebook, Twitter, LinkedIn icons are visable")
    public void test_if_facebook_twitter_linked_ın_icons_are_visable() {
     actions.sendKeys(Keys.END).perform();
     Assert.assertTrue(demyPage.facebookIcon.isDisplayed());
     Assert.assertTrue(demyPage.twitterIcon.isDisplayed());
     Assert.assertTrue(demyPage.linkedinIcon.isDisplayed());

    }

    @Given("Test if Facebook, Twitter, LinkedIn icons are clickable")
    public void test_if_facebook_twitter_linked_ın_icons_are_clickable() {
     Assert.assertTrue(demyPage.facebookIcon.isEnabled());
     Assert.assertTrue(demyPage.twitterIcon.isEnabled());
     Assert.assertTrue(demyPage.linkedinIcon.isEnabled());
    }

    @Then("Click Facebook icon")
    public void click_facebook_icon() {
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(2);
        demyPage.facebookIcon.click();
    }
    @Then("Test if Quality Demy's Facebook page is visible")
    public void test_if_quality_demy_s_facebook_page_is_visible() {
       String expectedUrl="https://www.facebook.com/";
       String actualUrl=Driver.getDriver().getCurrentUrl();
       Assert.assertEquals(expectedUrl,actualUrl);
       Driver.getDriver().navigate().back();

    }
    @Then("Click Twitter icon")
    public void click_twitter_icon() {
        actions.sendKeys(Keys.END).perform();
        demyPage.twitterIcon.click();
    }
    @Then("Test if Quality Demy's Twitter page is visible")
    public void test_if_quality_demy_s_twitter_page_is_visible() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Twitter"));
        Driver.getDriver().navigate().back();
    }
    @Then("Click LinkedIn icon")
    public void click_linked_ın_icon() {
        actions.sendKeys(Keys.END).perform();
        demyPage.linkedinIcon.click();
    }
    @Then("Test if Quality Demy's LinkedIn page is visible")
    public void test_if_quality_demy_s_linked_ın_page_is_visible() {
        String expectedUrl="https://www.linkedin.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

}
