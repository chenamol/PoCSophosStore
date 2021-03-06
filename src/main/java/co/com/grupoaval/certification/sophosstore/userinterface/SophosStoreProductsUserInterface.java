package co.com.grupoaval.certification.sophosstore.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SophosStoreProductsUserInterface {

	public static final Target PRODUCTITEM = Target.the("Pertenece al producto a seleccionar")
			.locatedBy("//div/div[@class='col ng-star-inserted']//a[contains(.,'{0}')]");

	public static final Target PRODUCLIST = Target.the("Pertenece la lista de todos los productos")
			.locatedBy("//div/div[@class='col ng-star-inserted']");

	public static final Target BTN_CARRITOPRODUCTO = Target.the("Bot�n para agregar productos al carro de compras")
			.locatedBy("//button[@mattooltip=\"A�adir a carrito\"]");

	public static final Target BTN_TODASLASCATEGORIAS = Target.the("Opci�n que permite ver todos los productos")
			.locatedBy("//div/button[contains(.,'Todas las Categorias')]");

	public static final Target BTN_SIGUIENTEPAGINA = Target.the("Bot�n para buscar productos en la siguiente p�gina")
			.locatedBy("//li/a[@aria-label='Next page']");

	public static final Target BTN_ANTERIORPAGINA = Target
			.the("Bot�n para regresar a la p�gina anterior de los productos")
			.locatedBy("//li/a[@aria-label='Previous page']");

}
