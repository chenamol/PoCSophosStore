package co.com.grupoaval.certification.sophosstore.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SophosStoreLoginUserInterface {

	public static final Target INPUT_USERNAME = Target.the("Ingresa nombre de usuario")
			.locatedBy("//*[@id=\"mat-input-0\"]");

	public static final Target INPUT_PASSWORD = Target.the("Ingresa password de la cuenta")
			.locatedBy("//*[@id=\"mat-input-1\"]");

	public static final Target BTN_LOGIN = Target.the("Botón para ingresar a la página")
			.locatedBy("//button[@class=\"mat-elevation-z6 mat-fab mat-primary\"]");

}
