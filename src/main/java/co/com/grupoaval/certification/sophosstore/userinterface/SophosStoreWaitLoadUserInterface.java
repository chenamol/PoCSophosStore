package co.com.grupoaval.certification.sophosstore.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SophosStoreWaitLoadUserInterface {

	public static final Target LOADING = Target.the("Objeto que pertenes a la carga de la p�gina miestras se espera")
			.locatedBy("//*[@id=\"app\"]/ngx-spinner/div");

}
