package Com.Test.ErhanErmis.pages;

import Com.Test.ErhanErmis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class personalAccount extends base{

    public personalAccount (){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//a[@title=\"Information\"]")
    public WebElement personalInfo;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement name;

       @FindBy(xpath = "//input[@id='old_passwd']")
    public WebElement password;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElement saveButton;

    @FindBy(xpath = "//p[contains(text(),'has been successfully up')]")
    public WebElement confirmText;



}
