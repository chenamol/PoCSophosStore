package co.com.grupoaval.certification.sophosstore.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SophosStoreHomeUserInterface {

	public static final Target BTN_CUENTA = Target.the("Boton para verificar la cuenta").locatedBy(
			"//*[@id=\"app\"]/app-pages/mat-sidenav-container/mat-sidenav-content/mat-toolbar/mat-toolbar-row[1]/app-top-menu/div/a");

	public static final Target MSG_USERNAME = Target.the("Mensaje con el nombre de usuario")
			.locatedBy("//div/p[contains(text(),'Perrin')]");

	public static final Target IMG_USERPROFILE = Target.the("Imagen detalle de cuenta")
			.locatedBy("//img[@alt=\"user-image\"]");

	public static final Target BTN_INGRESAR = Target.the("Botón que permite iniciar sesión")
			.locatedBy("//span[.=\"Ingresar\"]");

	public static final Target BTN_MENUSUPERIOR = Target.the("Opciones del menu superior")
			.locatedBy("//app-menu/mat-toolbar/a[.='{0}']");

	public static final Target BTN_CELULARES = Target.the("Opciones del menu superior")
			.locatedBy("//app-menu/mat-toolbar/a[.='Celulares']");

	public static final Target BTN_CARRITO = Target.the("Botón Correspondiente al carrito de compra")
			.locatedBy("//div/button[contains(.,'shopping_cart')]");

	public static final Target BTN_DETALLECARRITO = Target.the("Ingresa al Detalle del Carrito")
			.locatedBy("//div/b/a[contains(.,'VER CARRITO')]");

}
