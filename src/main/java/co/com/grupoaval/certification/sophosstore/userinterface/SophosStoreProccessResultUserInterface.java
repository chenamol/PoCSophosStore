package co.com.grupoaval.certification.sophosstore.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SophosStoreProccessResultUserInterface {
	
	public static final Target MSG_PROCCESSRESULT = Target.the("Mensaje final de validación del proceso")
			.locatedBy("//div/h2[contains(.,'Felicidades! Su orden ha sido procesada')]");

}

