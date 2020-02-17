@tag
Feature: Verificar Detalle de producto
    Como usuario del portal SophosStore Quiero
    verificar el detalle de producto de los articulos disponibles
    para verificar que la informaci�n mostrada sea la correcta

  @tag1
  Scenario Outline: Verificar Detalle de producto
    Given que el usuario se encuentra en la pagina principal
    When el ingresa la informacion de la cuenta
      | username   | password   |
      | <username> | <password> |
    And el usuario agrega el producto a validar
      | categoria   | producto   |
      | <categoria> | <producto> |
    Then el usuario verifica que muestre el nombre del producto <producto>
    And el usuario verifica que se muestre imagen de producto
    And el usuario verifica que apareza la descripcion del producto <descripcion>

    Examples: 
      | username | password | categoria | producto | descripcion                                                                                                             |
      | chenamol | prueba12 | Celulares | Airpods  | Se conectan fácilmente y te siguen el ritmo todo el día. Vienen con Cancelación Activa de Ruido y ajuste personalizado. |
