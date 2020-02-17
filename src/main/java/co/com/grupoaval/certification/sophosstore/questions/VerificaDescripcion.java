package co.com.grupoaval.certification.sophosstore.questions;

import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreProductUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificaDescripcion implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(SophosStoreProductUserInterface.LBL_DESCRIPCION).viewedBy(actor).asString();
		
	}
	
	public static VerificaDescripcion delProducto() {
		return new VerificaDescripcion();
	}
	

}
