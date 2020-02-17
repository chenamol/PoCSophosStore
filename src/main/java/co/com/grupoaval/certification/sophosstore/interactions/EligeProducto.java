package co.com.grupoaval.certification.sophosstore.interactions;

import java.util.List;

import static co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreProductsUserInterface.PRODUCLIST;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class EligeProducto implements Interaction {

	private String producto;

	public EligeProducto(String producto) {
		this.producto = producto;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElementFacade> productos = PRODUCLIST.resolveAllFor(actor);
		productos.stream().filter(element -> element.containsText(producto)).findFirst().ifPresent(element -> {
			element.findBy(
					By.cssSelector("div > mat-card > div.icons > app-controls > div > div > button:nth-child(2)"))
					.click();
		});

	}

	public static EligeProducto conNombre(String producto) {
		return Tasks.instrumented(EligeProducto.class, producto);
	}

}
