package co.com.grupoaval.certification.sophosstore.tasks;

import co.com.grupoaval.certification.sophosstore.interactions.EligeProducto;
import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreHomeUserInterface;
import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreProductsUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AgregaProductos implements Task {

	private String producto;

	public AgregaProductos(String producto) {
		this.producto = producto;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SophosStoreHomeUserInterface.BTN_CELULARES),
				Click.on(SophosStoreProductsUserInterface.BTN_TODASLASCATEGORIAS));

		EligeProducto.conNombre("producto", SophosStoreProductsUserInterface.PRODUCTITEM.resolveAllFor(actor));

	}

	public static AgregaProductos seleccionaProducto(String producto) {
		return Tasks.instrumented(AgregaProductos.class, producto);
	}

}
