package co.com.grupoaval.certification.sophosstore.tasks;

import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreCartUserInterface;
import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreHomeUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EliminarProductosDelCarrito implements Task {

	private String producto;

	public EliminarProductosDelCarrito(String producto) {
		this.producto = producto;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SophosStoreHomeUserInterface.BTN_CARRITO),
				Click.on(SophosStoreHomeUserInterface.BTN_DETALLECARRITO),
				Click.on(SophosStoreCartUserInterface.PRODUCTLIST.of(producto)));

	} 

	public static EliminarProductosDelCarrito seleccionaProducto(String producto) {
		return Tasks.instrumented(EliminarProductosDelCarrito.class, producto);
		
	}

}
