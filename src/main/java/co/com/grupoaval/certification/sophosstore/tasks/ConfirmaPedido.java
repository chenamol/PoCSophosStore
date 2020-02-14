package co.com.grupoaval.certification.sophosstore.tasks;

import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreConfirmOrderUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ConfirmaPedido implements Task {
	
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SophosStoreConfirmOrderUserInterface.BTN_CONFIRMARPEDIDO));
	}
	
	public static ConfirmaPedido realizado() {
		return Tasks.instrumented(ConfirmaPedido.class);
	}

}
