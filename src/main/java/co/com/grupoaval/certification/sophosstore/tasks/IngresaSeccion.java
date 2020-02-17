package co.com.grupoaval.certification.sophosstore.tasks;

import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreHomeUserInterface;
import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreProductsUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IngresaSeccion implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SophosStoreHomeUserInterface.BTN_CELULARES),
				Click.on(SophosStoreProductsUserInterface.BTN_TODASLASCATEGORIAS));

	}

	public static IngresaSeccion todasLasCategorias() {
		return Tasks.instrumented(IngresaSeccion.class);
	}

}
