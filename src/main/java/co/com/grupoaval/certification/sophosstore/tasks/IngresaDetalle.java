package co.com.grupoaval.certification.sophosstore.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreHomeUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IngresaDetalle implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SophosStoreHomeUserInterface.BTN_CUENTA));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static IngresaDetalle deCuenta() {
		return instrumented(IngresaDetalle.class);
	}

}
