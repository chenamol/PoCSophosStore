package co.com.grupoaval.certification.sophosstore.tasks;

import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreHomeUserInterface;
import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreProductUserInterface;
import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreProductsUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IngresaProducto implements Task {

	private String producto;

	public IngresaProducto(String producto) {
		this.producto = producto;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SophosStoreHomeUserInterface.BTN_CELULARES),
				Click.on(SophosStoreProductsUserInterface.BTN_TODASLASCATEGORIAS),
				Click.on(SophosStoreProductsUserInterface.PRODUCTITEM.of(producto)));

	}

	public static IngresaProducto alDetalle(String producto) {
		return Tasks.instrumented(IngresaProducto.class, producto);
	}

}
