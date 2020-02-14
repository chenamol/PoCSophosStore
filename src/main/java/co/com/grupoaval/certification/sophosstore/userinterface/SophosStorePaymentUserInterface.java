package co.com.grupoaval.certification.sophosstore.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SophosStorePaymentUserInterface {

	public static final Target BTN_PAGOPSE = Target.the("Botón para pagar por PSE")
			.locatedBy("//mat-button-toggle/button[contains(.,' Debito Pse ')]");

	public static final Target DDL_BANCO = Target.the("Lista para seleccionar el banco")
			.locatedBy("//div/span[contains(.,'Banco grupo aval')]");

	public static final Target SLC_BANCO = Target.the("Selecciona uno de los bancos")
			.locatedBy("//mat-option/span[contains(.,'{0}')]");

	public static final Target DDL_TIPOPERSONA = Target.the("Lista para seleccionar el banco")
			.locatedBy("//div/span[contains(.,'Tipo de Persona')]");

	public static final Target SLC_PERSONA = Target.the("Selcciona un tipo de persona")
			.locatedBy("//mat-option/span[contains(.,'{0}')]");

	public static final Target TXT_NOMBRETITULAR = Target.the("Texto para ingresar el nobre del titular de la cuenta")
			.locatedBy("//div/input[@placeholder='Nombre titular']");

	public static final Target DDL_TIPODOCUMENTO = Target.the("Lista para elegir el tipo de documento de la persona")
			.locatedBy("//div/span[contains(.,'Tipo de documento')]");

	public static final Target SLC_TIPODOCUMENTO = Target.the("Selecciona un tipo de documento")
			.locatedBy("//mat-option/span[contains(.,'{0}')]");

	public static final Target TXT_DOCUMENTO = Target.the("Ingresa número de documento")
			.locatedBy("//div/input[@placeholder='Documento']");

	public static final Target TXT_EMAIL = Target.the("Ingresa un correo electrónico")
			.locatedBy("//*[@id=\"mat-input-30\"]");

	public static final Target TXT_TELEFONO = Target.the("Campo para ingresar el teléfono")
			.locatedBy("/html/body/app-root/div/app-pages/mat-sidenav-container/mat-sidenav-content/div[1]/app-checkout/mat-horizontal-stepper/div[2]/div[3]/form[2]/div/div[8]/mat-form-field/div/div[1]/div/input");

	public static final Target BTN_REALIZARPAGO = Target.the("Botón para proceder con el pago")
			.locatedBy("//div/button[contains(.,'Realizar pago')]");

}
