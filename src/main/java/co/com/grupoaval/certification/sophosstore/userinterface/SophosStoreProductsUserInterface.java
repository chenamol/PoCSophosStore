package co.com.grupoaval.certification.sophosstore.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SophosStoreProductsUserInterface {

	public static final Target PRODUCTITEM = Target.the("Pertenece al producto a seleccionar")
			.locatedBy("//div/div[@class='col ng-star-inserted']//a[contains(.,'{0}')]");
	
	public static final Target PRODUCLIST = Target.the("Pertenece la lista de todos los productos")
			.locatedBy("//div/div[@class='col ng-star-inserted']");

	public static final Target BTN_CARRITOPRODUCTO = Target.the("Botón para agregar productos al carro de compras")
			.locatedBy("//button[@mattooltip=\"Añadir a carrito\"]");
	
	public static final Target BTN_TODASLASCATEGORIAS = Target.the("Opción que permite ver todos los productos")
			.locatedBy("//div/button[contains(.,'Todas las Categorias')]");

}
