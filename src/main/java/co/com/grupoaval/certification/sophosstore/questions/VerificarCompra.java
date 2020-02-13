package co.com.grupoaval.certification.sophosstore.questions;

import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreProccessResultUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarCompra implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(SophosStoreProccessResultUserInterface.MSG_PROCCESSRESULT).viewedBy(actor).asString();
	}

	public static VerificarCompra exitosa() {
		return new VerificarCompra();
	}
	
	

}
