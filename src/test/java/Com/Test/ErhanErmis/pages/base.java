package Com.Test.ErhanErmis.pages;

import Com.Test.ErhanErmis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class base {
public base(){
    PageFactory.initElements(Driver.get(),this);
}
    @FindBy(xpath = "(//a[text()='T-shirts'])[2]")
    public WebElement tShirt;
}


