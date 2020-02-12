package co.com.grupoaval.certification.sophosstore.tasks;

import co.com.grupoaval.certification.sophosstore.interactions.EligeProducto;
import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreHomeUserInterface;
import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreProductsUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AgrepaProductos implements Task {

	private String categoria, producto;
	

	public AgrepaProductos(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SophosStoreHomeUserInterface.BTN_MENUSUPERIOR.of(categoria)),
				Click.on(SophosStoreProductsUserInterface.PRODUCTITEM.of(producto)),
				Click.on(SophosStoreProductsUserInterface.BTN_CARRITOPRODUCTO)
				
				//EligeProducto.conNombre("ejemplo", SophosStoreProductsUserInterface.PRODUCTITEM.resolveAllFor(actor))
				
				
				
				);
	}

	public static AgrepaProductos seleccionaCategoria(String categoria) {
		return Tasks.instrumented(AgrepaProductos.class, categoria);
	}

	public AgrepaProductos seleccionaProducto(String producto) {
		this.producto = producto;
		return this;
	}

}
