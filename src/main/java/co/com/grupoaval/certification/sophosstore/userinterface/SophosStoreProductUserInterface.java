package co.com.grupoaval.certification.sophosstore.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SophosStoreProductUserInterface {

	public static final Target LBL_PRODUCTO = Target.the("Campo que muestra el nombre del producto")
			.locatedBy("//div/div/h2[contains(text(),'Airpods')]");

	public static final Target IMG_PRODUCTO = Target.the("Imagen que muestra el producto").locatedBy(
			"//*[@id=\"app\"]/app-pages/mat-sidenav-container/mat-sidenav-content/div/app-product/div[1]/div[1]/mat-card/img");

	public static final Target LBL_DESCRIPCION = Target.the("Texto que muestra la descripción del producto")
			.locatedBy("//*[@id=\"app\"]/app-pages/mat-sidenav-container/mat-sidenav-content/div/app-product/div[1]/div[2]/p");

}
