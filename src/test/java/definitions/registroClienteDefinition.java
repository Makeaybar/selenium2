package definitions;

import PageObjects.autentificacion;
import PageObjects.crearCuentaPage;
import PageObjects.menuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.io.IOException;

import static support.util.evidencias;

public class registroClienteDefinition {

    menuPage menu;
    autentificacion auth;
    crearCuentaPage cuenta;

    public registroClienteDefinition() {
        menu = new menuPage();
        auth = new autentificacion();
        cuenta = new crearCuentaPage();
    }

    @Given("que la web esta disponible")
    public void queLaWebEstaDisponible() throws IOException {
        Hooks.driver.get("http://automationpractice.com/index.php");
        evidencias();

    }

    @And("ingresar a la opcion de creacion de cuenta")
    public void ingresarALaOpcionDeCreacionDeCuenta() {
        menu.clickSignIn();
    }

    @When("ingresarun un correo {string}")
    public void ingresarunUnCorreo(String correo) throws IOException {
        auth.IngresarCorreo(correo);
        evidencias();
        auth.clicCrearCuenta();
    }

    @And("selecionar el genero {string}")
    public void selecionarElGenero(String genero) {
        cuenta.seleccionarGenero(genero);
    }

    @And("ingresar nombre {string}")
    public void ingresarNombre(String nombre) {
        cuenta.escribirNombre(nombre);
    }

    @And("ingresar apellido {string}")
    public void ingresarApellido(String apellido) {
        cuenta.escribirApellido(apellido);
    }

    @And("valiadr el correo {string}")
    public void valiadrElCorreo(String correo) {
        cuenta.validarCorreo(correo);
    }

    @And("ingresar clave {string}")
    public void ingresarClave(String clave) {
        cuenta.escribirClave(clave);
    }

    @And("ingresar fecha de nacimiento {string}")
    public void ingresarFechaDeNacimiento(String valor) throws IOException {
        String[] fecha=valor.split("/");
        cuenta.seleccionarDia(fecha[0]);
        cuenta.seleccionarMes(fecha[1]);
        cuenta.seleccionarAnio(fecha[2]);
        evidencias();
    }

    @And("{string} permitir envio de newsletter")
    public void permitirEnvioDeNewsletter(String opcion) {
        cuenta.permitirNewsletter(opcion);
    }


    @And("{string} permitir receive")
    public void permitirReceive(String opcion) {
        cuenta.permitirReceive(opcion);
    }

    @And("escribir empresa {string}")
    public void escribirEmpresa(String empresa) {
        cuenta.escribirEmpresa(empresa);
    }

    @And("escribir primera direccion {string}")
    public void escribirPrimeraDireccion(String direccion) {
        cuenta.escribirDireccion(direccion);

    }

    @And("escribir segunda direcion {string}")
    public void escribirSegundaDirecion(String direccion) {
        cuenta.escribirDireccion2(direccion);
    }

    @And("escribir ciudad {string}")
    public void escribirCiudad(String ciudad) {
        cuenta.escribirCiudad(ciudad);

    }

    @And("seleccionar estado {string}")
    public void seleccionarEstado(String estado) {
        cuenta.seleccionarEstado(estado);


    }

    @And("escribir codigo postal {string}")
    public void escribirCodigoPostal(String codigo) {
        cuenta.escribirPostal(codigo);

    }

    @And("seleccionar pais {string}")
    public void seleccionarPais(String pais) {
        cuenta.seleccionarPais(pais);
    }

    @And("escribir info {string}")
    public void escribirInfo(String info) {
        cuenta.escribirInformacion(info);

    }

    @And("escribir telefono {string}")
    public void escribirTelefono(String telefono) {
        cuenta.escribirTelefono(telefono);

    }

    @And("escribir celular {string}")
    public void escribirCelular(String celular) {
        cuenta.escribirCelular(celular);
    }

    @And("escribir alias {string}")
    public void escribirAlias(String alias) throws IOException {
        cuenta.escribirAlias(alias);
        evidencias();
    }

    @And("guardar registro")
    public void guardarRegistro() {
        cuenta.clickRegistrar();
    }
}
