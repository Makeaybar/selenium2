Feature: funcionalidad de creacion de cuenta de cliente
  @regresion
  Scenario: Creacion de cuenta exitosa
    Given que la web esta disponible
    And ingresar a la opcion de creacion de cuenta
    When ingresarun un correo "abc987@mail.com"
    And selecionar el genero "señor"
    And ingresar nombre "michael"
    And ingresar apellido "aybar"
    And valiadr el correo "abc987@mail.com"
    And ingresar clave "12345678"
    And ingresar fecha de nacimiento "5/4/1990"
    And "si" permitir envio de newsletter
    And "no" permitir receive
    And escribir empresa "mi empresa"
  And escribir primera direccion "mi casa 694"
  And escribir segunda direcion " mi segunda casa 694"
  And escribir ciudad "lima"
  And seleccionar estado "Arizona"
  And escribir codigo postal "00000"
  And seleccionar pais "United States"
  And escribir info "resgistro de mi cuenta"
  And escribir telefono "5559953"
    And escribir celular "961305380"
    And escribir alias "mi cuenta"
    And guardar registro
@tabla
  Scenario Outline: : Creacion de cuenta exitosa con varios registros
    Given que la web esta disponible
    And ingresar a la opcion de creacion de cuenta
    When ingresarun un correo "<correo>"
    And selecionar el genero "<genero>"
    And ingresar nombre "<nombre>"
    And ingresar apellido "<apellido>"
    And valiadr el correo "<correo>"
    And ingresar clave "<clave>"
    And ingresar fecha de nacimiento "<fecha_nacimiento>"
    And "<newsletter>" permitir envio de newsletter
    And "<receive>" permitir receive
    And escribir empresa "<empresa>"
    And escribir primera direccion "<direccion>"
    And escribir segunda direcion "<direccion2>"
    And escribir ciudad "<ciudad>"
    And seleccionar estado "<estado>"
    And escribir codigo postal "<codigo_postal>"
    And seleccionar pais "<pais>"
    And escribir info "<info>"
    And escribir telefono "<telefono>"
    And escribir celular "<celular>"
    And escribir alias "<alias>"
    And guardar registro

    Examples:
    |correo|genero|nombre|apellido|clave|fecha_nacimiento|newsletter|receive|empresa|direccion|direccion2|ciudad|estado|codigo_postal|pais|info|telefono|celular|alias|
    |cba123@mail.com|señor|juan|diaz|123456789|12/11/2000|no        |si    |compañia1|empresa 345|empresa 234|lima|Arizona|10000     |United States|cualquier cosa|4556546|987654321|direccion|
    |cba1235@mail.com|señora|juana|diaz|123456789|12/11/2000|no        |si    |compañia2|empresa 345|empresa 234|lima|Arizona|10000     |United States|cualquier cosa|4556546|987654321|direccion|
    |cba124@mail.com|señora|juan|diaz|123456789|12/11/2000|no        |si    |compañia3|empresa 345|empresa 234|lima|Arizona|10000     |United States|cualquier cosa|4556546|987654321|direccion|
    |cba4123@mail.com|señor|juan|diaz|123456789|12/11/2000|no        |si    |compañia4|empresa 345|empresa 234|lima|Arizona|10000     |United States|cualquier cosa|4556546|987654321|direccion|
    |cba1234@mail.com|señoar|juana|diaz|123456789|12/11/2000|no        |si    |compañia|empresa 345|empresa 234|lima|Arizona|10000     |United States|cualquier cosa|4556546|987654321|direccion|
    |cba1423@mail.com|señor|juan|diaz|123456789|12/11/2000|no        |si    |compañia|empresa 345|empresa 234|lima|Arizona|10000     |United States|cualquier cosa|4556546|987654321|direccion|
