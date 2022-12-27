package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TrendLifeBuyPage;
import utilites.ConfigReader;
import utilites.Driver;
import utilites.ReusableMethods;

public class TrendLifeBuyStepDefinitions    {

    TrendLifeBuyPage life=new TrendLifeBuyPage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("Open browser go to url {string}")
    public void open_browser_go_to_url(String url) {
          Driver.getDriver().get(ConfigReader.getProperty(url)); // Bu dinamik olan
      //  Driver.getDriver().get(ConfigReader.getProperty("myUrl2"));
    }
    @Then("User clicks on the login link, enters {string} and {string} and logs in.")
    public void user_clicks_on_the_login_link_enters_and_and_logs_in(String mail, String password) {
        life.loginLink.click();
       life.emailBox.sendKeys(ConfigReader.getProperty(mail));
      // life.emailBox.sendKeys(mail);
       life.passwordBox.sendKeys(ConfigReader.getProperty(password));
     //   life.passwordBox.sendKeys(password);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        life.signInButton.click();
    }
    @Then("User clicks on dashboard link")
    public void user_clicks_on_dashboard_link() {
       life.dashboardLink.click();
    }
    @Then("User clicks My Account section on dashbord page")
    public void user_clicks_my_account_section_on_dashbord_page() {
      actions.sendKeys(Keys.PAGE_DOWN).perform();
      ReusableMethods.bekle(2);
      life.myAccountLink.click();

    }
    @Then("User verifies that the page is accessible")
    public void user_verifies_that_the_page_is_accessible() {
     String expected="https://trendlifebuy.com/profile";
     String actual=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expected,actual);
     //   Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/profile"));
    }
    @Then("Closes the page")
    public void closes_the_page() {
        Driver.closeDriver();
    }

    @Then("Verifies that the Basic Info tab contains First Name, Last Name,Email Address, Phone Number, Date of Birth, Description,Text Box")
    public void verifiesThatTheBasicInfoTabContainsFirstNameLastNameEmailAddressPhoneNumberDateOfBirthDescriptionTextBox() {
        Assert.assertTrue(life.firstnameBoxMyAccount.isDisplayed());


    }
    @Then("User clicks Purchase History section on dashbord page")
    public void user_clicks_purchase_history_section_on_dashbord_page() {
     actions.sendKeys(Keys.PAGE_DOWN).perform();
     actions.sendKeys(Keys.ARROW_DOWN).perform();
     actions.sendKeys(Keys.ARROW_DOWN).perform();
     actions.sendKeys(Keys.ARROW_DOWN).perform();
        life.purchaseHistoryLink.click();

    }
    @Then("User verifies that Purchase History page is accessible")
    public void user_verifies_that_purchase_history_page_is_accessible() {
        String expected="https://trendlifebuy.com/my-purchase-histories";
        String actual=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expected,actual);

    }

    @Then("User verifies that \\(These credentials do not match our records.) message appears in the corner")
    public void userVerifiesThatTheseCredentialsDoNotMatchOurRecordsMessageAppearsInTheCorner() {
       Assert.assertTrue(life.systemMessage.isDisplayed());
    }
/*
    @Then("Verifies that the users Logout link is displayed on the home page.")
    public void verifies_that_the_users_logout_link_is_displayed_on_the_home_page() {
        Assert.assertTrue(life.logout.isDisplayed());
    }

    @Then("It is displayed on the account that the user is logged out of.")
    public void it_is_displayed_on_the_account_that_the_user_is_logged_out_of() {
        life.logout.click();
        Assert.assertTrue(life.loginLink.isDisplayed());
    }

    @Then("The visibility of the Sign Out link in the Dashboard Sidebar is verified.")
    public void the_visibility_of_the_sign_out_link_in_the_dashboard_sidebar_is_verified() {
        life.dashboardLink.click();
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.dashbordlogout.isDisplayed());
    }
    @Then("User clicks Dashboard Side Bar")
    public void user_clicks_dashboard_side_bar() {
        life.dashboardLink.click();
    }
    @Then("User clicks  Logout link in the Dashboard Side Bar")
    public void user_clicks_logout_link_in_the_dashboard_side_bar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        life.dashbordlogout.click();
    }
    @Then("It displayed verified that the account is logged out.")
    public void it_displayed_verified_that_the_account_is_logged_out() {
        Assert.assertTrue(life.loginLink.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("User clicks on the admin login link, enters {string} and {string} and logs in.")
    public void user_clicks_on_the_admin_login_link_enters_and_and_logs_in(String mail, String password)  {
        life.adminLoginEmail.sendKeys(ConfigReader.getProperty(mail));
        life.adminLoginPassword.sendKeys(ConfigReader.getProperty(password));
        ReusableMethods.bekle(2);
        life.signInButton.click();
    }
    @Then("Click on the Notifications icon")
    public void click_on_the_notifications_icon() {
    ReusableMethods.bekle(5);
    life.notificationsIcon.click();
    ReusableMethods.bekle(2);
    }
    @Then("Verify the visibility of Notifications in the pop-up window.")
    public void verify_the_visibility_of_notifications_in_the_pop_up_window() {
    Assert.assertTrue(life.NotificationsIconPopUp.isDisplayed());
    }
*/
}
