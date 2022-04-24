package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class menuPage extends util {
    @FindBy(xpath= "//a[contains(text(),'Sign in')]") protected WebElement lnksignin;

    public menuPage() {
        PageFactory.initElements(driver,this);

    }
    public void clickSignIn(){
        wait.until(ExpectedConditions.elementToBeClickable(lnksignin));
        lnksignin.click();
    }
}
