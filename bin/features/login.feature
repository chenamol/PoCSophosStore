Feature: Login para la aplicación SophosStore
  Como usuario del portal SophosStore
  Quiero iniciar sesión como usuario en la pagina shoposstore
  y que permita hacer sus compras online.

  @Login_user_exitoso
  Scenario: Login usuario exitoso
    Given que el usuario se encuentra en la pagina principal
    When el ingresa la informacion de la cuenta
      | username | password  |
      | chenamol | prueba123 |
    Then el se registra exitosamente visualizando su imagen de perfil

  @Login_password_incorrecto
  Scenario Outline: Login password incorrecto
    Given que el usuario se encuentra en la pagina principal
    When el ingresa la informacion de la cuenta
      | username   | password   |
      | <username> | <password> |
    Then el usuario visualiza la palabra Ingresar

    Examples: 
      | username    | password |
      | chenamol    | prueba12 |
      | invaliduser |    12345 |
