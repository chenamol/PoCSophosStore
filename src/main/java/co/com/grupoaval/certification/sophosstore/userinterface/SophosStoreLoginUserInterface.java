package co.com.grupoaval.certification.sophosstore.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SophosStoreLoginUserInterface {

	public static final Target BTN_CUENTA = Target.the("Bot�n para abrir la opcion de ingresar ")
			.locatedBy("//app-top-menu/div/a[contains(.,'Cuenta')]");

	public static final Target BTN_INGRESAR = Target.the("Bot�n para visualizar la ventana de inicio de sesi�n")
			.locatedBy("//div/span/a[contains(.,'Ingresar')]");

	public static final Target INPUT_USERNAME = Target.the("Ingresa nombre de usuario")
			.locatedBy("//*[@id=\"mat-input-0\"]");

	public static final Target INPUT_PASSWORD = Target.the("Ingresa password de la cuenta")
			.locatedBy("//*[@id=\"mat-input-1\"]");

	public static final Target BTN_LOGIN = Target.the("Bot�n para ingresar a la p�gina")
			.locatedBy("//button[@class=\"mat-elevation-z6 mat-fab mat-primary\"]");

}
