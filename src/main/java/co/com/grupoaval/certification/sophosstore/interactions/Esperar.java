package co.com.grupoaval.certification.sophosstore.interactions;

import static co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreWaitLoadUserInterface.LOADING;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;

public class Esperar implements Interaction {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(LOADING, isNotPresent()));
	}
	
	public static Esperar CargaDeContenido() {
		return Tasks.instrumented(Esperar.class);
	}

}
