package co.com.grupoaval.certification.sophosstore.questions;

import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreProductUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificaNombre implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(SophosStoreProductUserInterface.LBL_PRODUCTO).viewedBy(actor).asString();
	}
	
	public static VerificaNombre delProducto() {
		return new VerificaNombre();
	}

}
