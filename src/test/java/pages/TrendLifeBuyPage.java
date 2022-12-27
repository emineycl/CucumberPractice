package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class TrendLifeBuyPage {
    public TrendLifeBuyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[text()='Login'])[1]")
    public WebElement loginLink;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@id='sign_in_btn']")
    public WebElement signInButton;

    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement dashboardLink;

    @FindBy(xpath = "(//a[@href=\"https://trendlifebuy.com/profile\"])[1]")
    public WebElement myAccountLink;

     @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center '])[2]")
     public WebElement suppTicket;

     @FindBy(xpath = "//input[@name='first_name']")
     public WebElement firstnameBoxMyAccount;

     @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center'])[1]")
    public WebElement purchaseHistoryLink;

     @FindBy(xpath = "//span[text()='These credentials do not match our records.']")
    public WebElement systemMessage;
}
