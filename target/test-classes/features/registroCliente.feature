Feature: funcionalidad de creacion de cuenta de cliente
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

