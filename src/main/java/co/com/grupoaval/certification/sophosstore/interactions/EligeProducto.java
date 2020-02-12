package co.com.grupoaval.certification.sophosstore.interactions;

import java.util.List;

import org.openqa.selenium.WebElement;

import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreHomeUserInterface;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class EligeProducto implements Interaction {

	private String producto;
	List<WebElementFacade> productos;

	@Override
	public <T extends Actor> void performAs(T actor) {

		productos.stream().filter(element -> element.containsText(producto)).findFirst().ifPresent(element -> {
			element.findBy("div > mat-card > div.icons > app-controls > div > div > button:nth-child(2) > span > mat-icon").click();
		});

	}

	public static EligeProducto conNombre(String producto, List<WebElementFacade> productos) {

		return Tasks.instrumented(EligeProducto.class, producto, productos);
	}
	
	

}
