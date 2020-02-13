package co.com.grupoaval.certification.sophosstore.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SophosStorePaymentResultUserInterface {

	public static final Target BTN_FINALIZACOMPRA = Target.the("Botón para finalizar todo el proceso de compra")
			.locatedBy("//div/button[@type='submit'][contains(.,'Finalizar Compra')]");

}
