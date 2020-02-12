@tag
Feature: Realizar compra en la pagina SophosStore
  Como usuario del portal SophosStore Quiero 
  realizar una compra de productos para cubrir el flujo 
  completo de la aplicaci�n

  @Realizar_Compra
  Scenario: Realizar Compra
    Given que el usuario se encuentra en la pagina principal
    When el ingresa la informacion de la cuenta
      | username | password  |
      | chenamol | prueba123 |
    And el usuario agrega los productos a comprar
      | categoria  | producto                              |
      | Celulares  | Airpods                               |
      | Audio      | Celular HUAWEI Psmart 2019 DS 4G Rojo |
      #| Accesorios | Popsocket                             |
    And el usuario elimina uno de los productos del carrito
      | categoria | producto                              |
      | AUDIO     | Celular HUAWEI Psmart 2019 DS 4G Rojo |
    Then el finaliza con la compra con exito visualizando el mensaje Felicidades! Su orden ha sido procesada