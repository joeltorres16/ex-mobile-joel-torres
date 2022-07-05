Feature Log Swag Labs

  @test1
  Scenario: Logeo a SwagLabs y prueba de existencia de productos
    Given que me encuentro en el Login de SwagLabs
    When ingreso usuario "standard_user" y password "secret_sauce"
    Then encuentro la palabra "PRODUCTS" y valido la existencia de al menos un item


    Scenario: Captura del mensaje de error al ingresar con usuario invalido
      Given que me encuentro en el Login de SwagLabs
      When ingreso usuario "stand" y password "secret_sauce"
      Then valido el mensaje de error "username and password do not match any user in this service"