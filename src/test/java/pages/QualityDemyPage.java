package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class QualityDemyPage {

    public QualityDemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginLink;

    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement emailBox;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement acceptCookies;

    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement passwordBox;

    @FindBy (linkText = "Course manager")
    public WebElement courseManagerLink;

    @FindBy(xpath = "//img[@src=\"https://qualitydemy.com/uploads/system/393645bf994114c23be28028a47a77a0.png\"]")
    public WebElement demyPicture;

    @FindBy (xpath = "//a[text () = 'Instructor']")
    public WebElement instructor;

    @FindBy(xpath = "//span[text()='Course manager']")
    public WebElement courseManagerButton;

    @FindBy (xpath = "//a[@class='btn btn-outline-primary btn-rounded alignToTitle']")
    public WebElement add_newcourse;

    @FindBy(xpath = "//span[text()='Requirements']")
    public WebElement requirementsButton;

    @FindBy(xpath = "//button[@onclick='appendRequirement()']")
    public WebElement requirementsGreenPlusButton;

    @FindBy(xpath = "(//button[@onclick='removeRequirement(this)'])[2]")
    public WebElement requirementsRedMinusButton;

    @FindBy(xpath = "//span[text()='Outcomes']")
    public WebElement outComesButton;

    @FindBy(xpath = "//button[@onclick='appendOutcome()']")
    public WebElement outComesGreenPlusButton;

    @FindBy(xpath = "(//i[@class='fa fa-minus'])[3]")
    public WebElement outComesRedMinusButton;

    // Signup section locates
    @FindBy(xpath = "//a[@class='btn btn-sign-up']")
     public WebElement signupLink;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement firstnameBox;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement lastnameBox;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement signupEmailBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement signupPasswordBox;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signupButton;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement hataMesaji;
    // Home Page > Login Link

    // Home Page > Facebook Icon
    @FindBy(xpath = "//i[@class='fab fa-facebook-f']")
    public WebElement facebookIcon;
    // Home Page > Twitter Icon
    @FindBy(xpath = "//i[@class='fab fa-twitter']")
    public WebElement twitterIcon;
    // Home Page > LinkedIn Icon
    @FindBy(xpath = "//i[@class='fab fa-linkedin']")
    public WebElement linkedinIcon;
    // Home Page > Login Link > Forgot Password Link
    @FindBy(xpath = "//a[@class='text-muted text-12px fw-500 float-end']")
    public WebElement forgotPasswordLink;
    // Home Page > Login Link > Login Page > Login Button > Welcome Message
    @FindBy(xpath = "(//script[@type='text/javascript'])[3]")
    public WebElement welcomeMessage;
    // Home Page > Sign Up Button > First Name Box
    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstNameBox;
    // Home Page > Sign Up Button > Last Name Box
    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement lastNameBox;
    // Home Page > Sign Up Button > E-mail Box (at Sign Up Page)
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailBoxSignUpPage;
    // Home Page > Sign Up Button > Password Box (at Sign Up Page)
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBoxSignUpPage;
    // Home Page > Sign Up Button > Login Button > Verification Code Page
    @FindBy(xpath = "//input[@id='verification_code']")
    public WebElement verificationCodeBox;
    // Home Page > Sign Up Button > Login Button > Verification Code Page
    @FindBy(xpath = "(//script[@type='text/javascript'])[3]")
    public WebElement verificationCodeWrongMessage;
    // Home Page > Sign Up Button > Login Button > Verification Code Page > Continue Button
    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement continueButton;
    // Home Page > Login Button > Forgot Password Page > Forgot Password Email Box
    @FindBy(xpath = "//input[@id='forgot-password-email']")
    public WebElement forgotPasswordEmailBox;
    // Home Page > Login Button > Forgot Password Page > Send Request Button
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement sendRequestButton;
    // Home Page > Login Button > Forgot Password Page > Login Link (Under Send Request Button)
    @FindBy(xpath = "(//a[@href='https://qualitydemy.com/login'])[2]")
    public WebElement forgotPasswordLoginLink;
    // Home Page > Login Link > Login Page > Login Button (Login Page)
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement loginButtonLoginPage;
    // Home Page > Login Link > Login Page > Login Button (Login Page)
    @FindBy(xpath = "(//script[@type='text/javascript'])[2]")
    public WebElement invalidLoginCridentialsPopup;
    // Home Page > Login Link > Login Page > Login Button (Login Page) > Test User Drop Down Menu
    @FindBy(xpath = "//img[@class='img-fluid']")
    public WebElement testUserDropDownMenu;
    // Home Page > Login Link > Login Page > Login Button (Login Page) > Test User Drop Down Menu > Log Out Button
    @FindBy(xpath = "//i[@class='fas fa-sign-out-alt']")
    public WebElement logOutButton;
    // Home Page > Sign Up Button > Login Button > Verification Code Page > Login Link
    @FindBy(xpath = "//a[@class='text-15px fw-700']")
    public WebElement verificationPageLoginLink;
    // Home Page > Login Button > Forgot Password Page > Forgot Password > Send Request Button (user e-mail)
    @FindBy(xpath = "(//script[@type='text/javascript'])[2]")
    public WebElement forgotPasswordCheckYourInboxForTheRequestPopup;
    // Home Page > Login Button > Forgot Password Page > Forgot Password > Send Request Button (unregistered e-mail)
    @FindBy(xpath = "(//script[@type='text/javascript'])[2]")
    public WebElement forgotPasswordUserNotFoundPopup;
    // https://tempmail.dev/tr > Mail Address
    @FindBy(xpath = "//div[@id='current-mail']")
    public WebElement tempMailEmailAddress;
    // https://tempmail.dev/tr > Message Preview
    @FindBy(xpath = "//div[@class='mail-details']")
    public WebElement tempMailMessageFirstClick;
    // https://tempmail.dev/tr > Verification Code in Mail
    @FindBy(xpath = "//u")
    public WebElement tempMailVerificationCode;
    // https://tempmail.dev/tr > Verification Text in Mail
    @FindBy(xpath = "//a[@title='QualityDemy']")
    public WebElement tempMailVerificationText;
    // Home Page > Login Link > Login Button
    @FindBy(xpath = "//a[@href='https://qualitydemy.com/login']")
    public WebElement loginButtonLev;
    // Home Page > Cookies Pop-Up
    @FindBy(xpath = "//a[@onclick='cookieAccept();']")
    public WebElement acceptCookiesLev;

}
