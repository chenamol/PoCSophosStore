package co.com.grupoaval.certification.sophosstore.tasks;

import co.com.grupoaval.certification.sophosstore.exceptions.ProductoNoEncontradoException;
import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreHomeUserInterface;
import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreProductsUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AgregaProductosPorCategoria implements Task {
	
	

	private String categoria, producto;

	public AgregaProductosPorCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
		actor.attemptsTo(

				
				Click.on(SophosStoreHomeUserInterface.BTN_MENUSUPERIOR.of(categoria)),
				Click.on(SophosStoreProductsUserInterface.PRODUCTITEM.of(producto)));
				} catch (Exception e) {
					throw new ProductoNoEncontradoException(ProductoNoEncontradoException.MENSAJE_PRODUCTO_NO_ENCONTRADO, e);
				}
	}

	public static AgregaProductosPorCategoria seleccionaCategoria(String categoria) {
		return Tasks.instrumented(AgregaProductosPorCategoria.class, categoria);
	}

	public AgregaProductosPorCategoria seleccionaProducto(String producto) {
		this.producto = producto;
		return this;
	}

}
