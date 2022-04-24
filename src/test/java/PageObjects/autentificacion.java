package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class autentificacion extends util {
    @FindBy(id = "email_create") protected WebElement txtemail;
    @FindBy(id = "SubmitCreate") protected WebElement btncrear;

    public autentificacion() {
        PageFactory.initElements(driver,this);
    }
    public void IngresarCorreo(String texto){
        wait.until(ExpectedConditions.visibilityOf(txtemail));
        txtemail.sendKeys(texto);
    }
    public void clicCrearCuenta(){
        btncrear.click();
    }
}
