@tag
Feature: Realizar compra en la pagina SophosStore
  Como usuario del portal SophosStore Quiero 
  realizar una compra de productos para cubrir el flujo 
  completo de la aplicación

  @Realizar_Compra
  Scenario: Realizar Compra
    Given que el usuario se encuentra en la pagina principal
    When el ingresa la informacion de la cuenta
      | username | password  |
      | chenamol | prueba123 |
    And el usuario agrega los productos a comprar
      | categoria | producto                              |
      | Celulares | Airpods                               |
      | Audio     | Celular HUAWEI Psmart 2019 DS 4G Rojo |
    And el usuario elimina uno de los productos del carrito
      | producto                              |
      | Celular HUAWEI Psmart 2019 DS 4G Rojo |
    And el usuario diligencia la informacion de envio
      | nombre | pApellido | sApellido | compania | email          | telefono | pais     | ciudad   | estado    | codigoPostal | direccion       |
      | Cesar  | Henao     | Molina    | qVision  | chena@corp.com | 31375544 | Colombia | Medellin | Antioquia |    050035111 | cll 36 # 20 -13 |
    Then el usuario verifica la informacion de envio
    And el usuario selecciona metodo de pago a travez de pse con datos
      | banco              | tipoPersona | nombreTitular | tipoDocumento | documento  | email          | telefono |
      | Banco de Occidente | Natural     | Cesar Henao   | CC            | 1076632222 | chena@corp.com | 31375544 |
    And el finaliza con la compra con exito visualizando el mensaje Felicidades! Su orden ha sido procesada

  #@Realizar_Compra_Por_todas_las_categorias
  #Scenario: Realizar Compra desde todas las categorias.
    #Given que el usuario se encuentra en la pagina principal
    #When el ingresa la informacion de la cuenta
      #| username | password  |
      #| chenamol | prueba123 |
    #And el usuario agrega los productos a comprar desde la seccion Todas las categorias
      #| producto                              |
      #| Airpods                               |
      #| Celular HUAWEI Psmart 2019 DS 4G Rojo |
    #And el usuario elimina uno de los productos del carrito
      #| producto                              |
      #| Celular HUAWEI Psmart 2019 DS 4G Rojo |
    #And el usuario diligencia la informacion de envio
      #| nombre | pApellido | sApellido | compania | email          | telefono | pais     | ciudad   | estado    | codigoPostal | direccion       |
      #| Cesar  | Henao     | Molina    | qVision  | chena@corp.com | 31375544 | Colombia | Medellin | Antioquia |    050035111 | cll 36 # 20 -13 |
    #Then el usuario verifica la informacion de envio
    #And el usuario selecciona metodo de pago a travez de pse con dtos
      #| banco              | tipoPersona | nombreTitular | tipoDocumento | documento  | email          | telefono |
      #| Banco de Occidente | Natural     | Cesar Henao   | CC            | 1076632222 | chena@corp.com | 31375544 |
    #Then el finaliza con la compra con exito visualizando el mensaje Felicidades! Su orden ha sido procesada
