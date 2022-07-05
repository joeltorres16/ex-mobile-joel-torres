Feature Log Swag Labs

  @test1
  Scenario: Logeo a SwagLabs y prueba de existencia de productos
    Given que me encuentro en el Login de SwagLabs
    When ingreso usuario "standard_user" y password "secret_sauce" validos
    Then encuentro la palabra "PRODUCTS" y valido la existencia de al menos un item