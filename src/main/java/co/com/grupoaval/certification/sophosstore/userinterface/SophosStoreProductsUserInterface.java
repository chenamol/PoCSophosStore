package co.com.grupoaval.certification.sophosstore.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SophosStoreProductsUserInterface {

	public static final Target PRODUCTITEM = Target.the("Pertenece al producto a seleccionar")
			.locatedBy("//div/div[@class='col ng-star-inserted']//a[contains(.,'{0}')]");

	public static final Target BTN_CARRITOPRODUCTO = Target.the("Botón para agregar productos al carro de compras")
			.locatedBy("//button[@mattooltip=\"Añadir a carrito\"]");

}
