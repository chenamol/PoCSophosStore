package co.com.grupoaval.certification.sophosstore.questions;

import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreHomeUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;

public class VerificarNombreCuenta implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		return Enabled.of(SophosStoreHomeUserInterface.IMG_USERPROFILE).viewedBy(actor).asBoolean();
	}
	
	public static VerificarNombreCuenta conNombre() {
		return new VerificarNombreCuenta();
	}

}
