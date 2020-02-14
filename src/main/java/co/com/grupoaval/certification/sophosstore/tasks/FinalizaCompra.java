package co.com.grupoaval.certification.sophosstore.tasks;

import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreConfirmOrderUserInterface;
import co.com.grupoaval.certification.sophosstore.userinterface.SophosStorePaymentResultUserInterface;
import co.com.grupoaval.certification.sophosstore.userinterface.SophosStorePaymentUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

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
