package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.util;

public class crearCuentaPage extends util {
    @FindBy(id = "id_gender1") protected WebElement rdbar ;
    @FindBy(id = "id_gender2") protected WebElement rdbmrs;
    @FindBy(id = "customer_firstname") protected WebElement txtnombre;
    @FindBy(id = "customer_lastname") protected WebElement txtApellido;
    @FindBy(id = "email") protected WebElement txtcorreo ;
    @FindBy(id = "passwd") protected WebElement txtContrasenia;
    @FindBy(id = "days") protected WebElement sltDia;
    @FindBy(id = "months") protected WebElement sltMes;
    @FindBy(id = "years") protected WebElement sltAnio;
    @FindBy(id = "//input[@id='newsletter']") protected WebElement cbSign;
    @FindBy(id = "optin") protected WebElement cbReceive;
    @FindBy(id = "//input[@id='firstname']") protected WebElement txtNombreAdrress ;
    @FindBy(id = "//input[@id='lastname']") protected WebElement txtApellidoAdrress;
    @FindBy(id = "company") protected WebElement txtCompania;
    @FindBy(id = "address1") protected WebElement txtAdrres;
    @FindBy(id = "address2") protected WebElement txtAdrres2;
    @FindBy(id = "city") protected WebElement txtCity;
    @FindBy(id = "id_state") protected WebElement sltState;
    @FindBy(id = "postcode") protected WebElement txtPostalCode;
    @FindBy(id = "id_country") protected WebElement sltCountry;
    @FindBy(id = "other") protected WebElement txtInformacion;
    @FindBy(id = "phone") protected WebElement txtTelefono;
    @FindBy(id = "phone_mobile") protected WebElement txtCelular;
    @FindBy(id = "alias") protected WebElement txtAdrressAlias;
    @FindBy(id = "Register") protected WebElement btnRegister;

    public crearCuentaPage(String genero) {
        wait.until(ExpectedConditions.visibilityOf(rdbar));
        if (genero.toLowerCase().equals("señor")){
            rdbar.click();
        }else if(genero.toLowerCase().equals("señora")){
            rdbmrs.click();
        }else{
            System.out.print("valor enviado es invalido,seleccionar señor o señora");
        }
    }
    public void escribirNombre(String nombre){txtnombre.sendKeys(nombre);
    }
    public void escribirApellido(String apellido){txtApellido.sendKeys(apellido);

    }
    public void validarCorreo(String correo){
        String valor =txtcorreo.getAttribute("value");
        Assert.assertEquals(correo, valor);

    }

    public void escribirClave(String clave){txtContrasenia.sendKeys(clave);
    }
    public void seleccionarDia(String dia){ new Select(sltDia).selectByValue(dia);
    }
    public void seleccionarMes(String mes){new Select(sltMes).selectByValue(mes);
    }
    public void seleccionarAnio(String anio){ new Select(sltAnio).selectByValue(anio);
    }
    public void permitirNewsletter(String estado){
        if (estado.toLowerCase().equals("si")){
            cbSign.click();
            Assert.assertTrue(cbSign.isSelected());
        }else if(estado.toLowerCase().equals("no")){
            Assert.assertFalse(cbSign.isSelected());
        }
    }
    public void permitirReceive(String estado) {
        if (estado.toLowerCase().equals("si")) {
            cbReceive.click();
            Assert.assertTrue(cbReceive.isSelected());
        } else if (estado.toLowerCase().equals("no")) {
            Assert.assertFalse(cbReceive.isSelected());
        }
    }
    public void escribirDireccionNombre(String dnombre){txtNombreAdrress.sendKeys(dnombre);
    }
    public void escribirDireccionApellido(String dapellido){txtApellidoAdrress.sendKeys(dapellido);

    }
    public void escribirEmpresa(String empresa){ txtCompania.sendKeys(empresa);

    }

    public void escribirDireccion(String direccion){txtAdrres.sendKeys(direccion);
    }
    public void escribirDireccion2(String direccion){ txtAdrres2.sendKeys(direccion);
    }
    public void escribirCiudad(String ciudad){txtCity.sendKeys(ciudad);
    }
    public void seleccionarEstado(String estado){ new Select(sltState).selectByVisibleText(estado);
    }
    public void escribirPostal(String postal){txtPostalCode.sendKeys(postal);
    }
    public void seleccionarPais(String pais){ new Select(sltCountry).selectByVisibleText(pais);
    }
    public void escribirInformacion(String info){txtInformacion.sendKeys(info);
    }
    public void escribirTelefono(String telefono){txtTelefono.sendKeys(telefono);
    }
    public void escribirCelular(String celular){txtCelular.sendKeys(celular);

    }
    public void escribirAlias(String alias){txtAdrressAlias.sendKeys(alias);
    }

    public void clickRegistrar(){btnRegister.click();
    }







}
