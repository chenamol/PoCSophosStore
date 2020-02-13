package co.com.grupoaval.certification.sophosstore.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SophosStoreCartUserInterface {

	public static final Target PRODUCTLIST = Target.the("Lista de productos en el carrito de compras")
			.locatedBy("//mat-card/div/div[contains(.,'{0}')]/child::div[6]/div/button");

	public static final Target BTN_PROCEDERALPAGO = Target.the("Botón para proceder a finalizar la compra")
			.locatedBy("//mat-card/div/div/div/a[contains(.,'Proceder al Pago')]");

}
