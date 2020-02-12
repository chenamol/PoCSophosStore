package co.com.grupoaval.certification.sophosstore.questions;

import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreHomeUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarInicioFallido implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(SophosStoreHomeUserInterface.BTN_INGRESAR).viewedBy(actor).asString();
	}
	
	public static VerificarInicioFallido conClaveInvalida() {
		return new VerificarInicioFallido();
	}

}
