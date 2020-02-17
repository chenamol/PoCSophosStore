package co.com.grupoaval.certification.sophosstore.questions;

import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreProductUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;

public class VerificaImagen implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		return Enabled.of(SophosStoreProductUserInterface.IMG_PRODUCTO).viewedBy(actor).asBoolean();
	}
	
	public static VerificaImagen delProducto() {
		return new VerificaImagen();
	}

}
