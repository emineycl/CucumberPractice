package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

  @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement amazonAramaKutusu;

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    public WebElement amazonAramaSonucuTest;

    @FindBy(xpath = "//select[@aria-describedby='searchDropdownDescription']")
    public WebElement dropDownMenu;

    //------------------------------------------------------------------------------//

    @FindBy(xpath = "(//span[@class='nav-icon nav-arrow'])[1]")
    public WebElement languageSection;

    @FindBy(xpath = "(//a[@class='icp-flyout-change'])[1]")
    public WebElement changeButtonChangeLanguage;

    @FindBy(xpath = "//span[@data-csa-c-func-deps='aui-da-a-dropdown-button']")
    public WebElement selectCurrencyDrop;

    @FindBy(xpath = "//input[@class='a-button-input']")
    public WebElement saveChangesButton;

    @FindBy (xpath = "//span[text()='USD - U.S. Dollar']")
    public WebElement usdButton;

    @FindBy(xpath = "//span[text()=' - Turkish Lira']")
     public WebElement tryBirimi;

    @FindBy(xpath = "(//span[text()='PLN'])[1]")
    public WebElement paraBirimiTest;
}
