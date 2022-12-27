package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class AutomationExercisePage {
   public AutomationExercisePage(){
      PageFactory.initElements(Driver.getDriver(),this);
   }

   @FindBy (xpath = "//a[@href='/login']")
   public WebElement signUpLink;

   @FindBy(xpath = "(//button[@type='submit'])[1]")
   public WebElement loginButonu;

   @FindBy(xpath = "(//input[@type='email'])[1]")
   public WebElement emailBox;

   @FindBy(xpath = "(//input[@type='password'])[1]")
   public WebElement passwordBox;

   @FindBy(xpath = "(//a[@href='/logout'])[1]")
   public WebElement logoutButonu;
}
