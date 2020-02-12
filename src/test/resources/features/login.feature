Feature: Login para la aplicaci�n SophosStore
  Como usuario del portal SophosStore
  Quiero iniciar sesi�n como usuario en la pagina shoposstore
  y que permita hacer sus compras online.

  @Login_user_exitoso
  Scenario: Login usuario exitoso
    Given que el usuario se encuentra en la pagina principal
    When el ingresa la informacion de la cuenta
      | username | password  |
      | chenamol | prueba123 |
    Then el se registra exitosamente visualizando su nombre Perrin

  @Login_password_incorrecto
  Scenario: Login password incorrecto
    Given que el usuario se encuentra en la pagina principal
    When el ingresa la informacion de la cuenta
      | username | password |
      | chenamol | prueba12 |
    Then el usuario visualiza la palabra Ingresar
