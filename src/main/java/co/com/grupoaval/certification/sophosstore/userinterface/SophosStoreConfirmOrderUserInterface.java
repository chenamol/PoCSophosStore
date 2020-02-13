package co.com.grupoaval.certification.sophosstore.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SophosStoreConfirmOrderUserInterface {

	public static final Target TXT_NOMBRE = Target.the("Campo que muestra el nombre ingresado anteriormente")
			.locatedBy("//div/p[contains(.,'{0}')]");

	public static final Target TXT_EMAIL = Target.the("Campo que muestra el correo ingresado anteriormente")
			.locatedBy("//div/p[contains(.,'{0}')]");

	public static final Target TXT_TELEFONO = Target.the("Campo que muestra el tel�fono ingresado anteriormente")
			.locatedBy("//div/p[contains(.,'{0}')]");

	public static final Target TXT_PAIS = Target.the("Campo que muestra el pais ingresado anteriormente")
			.locatedBy("//div/p[contains(.,'{0}')]");

	public static final Target TXT_CIUDAD = Target.the("Campo que muestra la ciudad ingresado anteriormente")
			.locatedBy("//div/p[contains(.,'{0}')]");

	public static final Target TXT_ESTADO = Target.the("Campo que muestra el estado ingresado anteriormente")
			.locatedBy("//div/p[contains(.,'{0}')]");

	public static final Target TXT_CODIGOPOSTAL = Target.the("Campo que muestra el c�digo postal ingresado anteriormente")
			.locatedBy("//div/p[contains(.,'{0}')]");

	public static final Target TXT_DIRECCION = Target.the("Campo que muestra la direcci�n postal ingresado anteriormente")
			.locatedBy("//div/p[contains(.,'{0}')]");

	public static final Target BTN_CONFIRMARPEDIDO = Target.the("Bot�n para confirmar el pedido")
			.locatedBy("//div/button[contains(.,'Confirmar Pedido')]");

}
