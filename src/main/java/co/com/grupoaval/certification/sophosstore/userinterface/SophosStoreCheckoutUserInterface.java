package co.com.grupoaval.certification.sophosstore.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SophosStoreCheckoutUserInterface {

	public static final Target TXT_NOMBRE = Target.the("Campo para ingresar nombre de usuario")
			.locatedBy("//input[@ng-reflect-name='firstName']");

	public static final Target TXT_PAPELLIDO = Target.the("Campo para ingresar el primer apellido del usuario")
			.locatedBy("//input[@ng-reflect-name='lastName']");

	public static final Target TXT_SAPELLIDO = Target.the("Campo para ingresar el Segundo apellido del usuario")
			.locatedBy("//input[@ng-reflect-name='middleName']");

	public static final Target TXT_COMPANIA = Target.the("Campo para ingresar la compañia del usuario")
			.locatedBy("//mat-form-field/div/div/div/input[@ng-reflect-name='company']");

	public static final Target TXT_EMAIL = Target.the("Campo para ingresar el correo del usuario")
			.locatedBy("//input[@ng-reflect-name='email']");

	public static final Target TXT_TELEFONO = Target.the("Campo para ingresar el teléfono del usuario")
			.locatedBy("//input[@ng-reflect-name='phone']");

	public static final Target LST_PAIS = Target.the("Campo para ingresar el pais del usuario")
			.locatedBy("//mat-select/div/div/span[contains(.,'País')]");

	public static final Target ELIGEPAIS = Target.the("Selecciona uno de los paises")
			.locatedBy("//mat-option/span[@class][contains(.,'{0}')]");

	public static final Target TXT_CIUDAD = Target.the("Campo para ingresar la ciudad del usuario")
			.locatedBy("//input[@ng-reflect-name='city']");

	public static final Target TXT_ESTADO = Target.the("Campo para ingresar el estado del usuario")
			.locatedBy("//input[@ng-reflect-name='state']");

	public static final Target TXT_CODIGOPOSTAL = Target.the("Campo para ingresar el código postal del usuario")
			.locatedBy("//input[@ng-reflect-name='zip']");

	public static final Target TXT_DIRECCION = Target.the("Campo para ingresar la dirección del usuario")
			.locatedBy("//input[@ng-reflect-name='address']");

	public static final Target BTN_CONTINUAR = Target.the("botón para continuar con la compra")
			.locatedBy("//div/button[@class='mat-mini-fab mat-primary' and @type='submit'][1]");

}
