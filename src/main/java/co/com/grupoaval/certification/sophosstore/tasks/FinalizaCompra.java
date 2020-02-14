package co.com.grupoaval.certification.sophosstore.tasks;

import co.com.grupoaval.certification.sophosstore.userinterface.SophosStorePaymentResultUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class FinalizaCompra implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(

				Click.on(SophosStorePaymentResultUserInterface.BTN_FINALIZACOMPRA)

		);

	}

	public static FinalizaCompra conResultadoDePago() {
		return Tasks.instrumented(FinalizaCompra.class);

	}

}
