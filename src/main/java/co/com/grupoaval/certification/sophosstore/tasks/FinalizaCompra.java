package co.com.grupoaval.certification.sophosstore.tasks;

import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreCartUserInterface;
import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreCheckoutUserInterface;
import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreConfirmOrderUserInterface;
import co.com.grupoaval.certification.sophosstore.userinterface.SophosStorePaymentResultUserInterface;
import co.com.grupoaval.certification.sophosstore.userinterface.SophosStorePaymentUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FinalizaCompra implements Task {

	private String firstname = "Cesar";
	private String flastname = "Henao";
	private String slastname = "Molina";
	private String company = "qVision";
	private String email = "chena@comp.com";
	private String phone = "3133434";
	private String country = "Colombia";
	private String city = "Medellin";
	private String state = "Antioquia";
	private String postalcode = "0050350";
	private String address = "Cll43#12-32";

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SophosStoreCartUserInterface.BTN_PROCEDERALPAGO),
				Enter.theValue(firstname).into(SophosStoreCheckoutUserInterface.TXT_NOMBRE),
				Enter.theValue(flastname).into(SophosStoreCheckoutUserInterface.TXT_PAPELLIDO),
				Enter.theValue(slastname).into(SophosStoreCheckoutUserInterface.TXT_SAPELLIDO),
				Enter.theValue(company).into(SophosStoreCheckoutUserInterface.TXT_COMPANIA),
				Enter.theValue(email).into(SophosStoreCheckoutUserInterface.TXT_EMAIL),
				Enter.theValue(phone).into(SophosStoreCheckoutUserInterface.TXT_TELEFONO),
				Click.on(SophosStoreCheckoutUserInterface.LST_PAIS),
				Click.on(SophosStoreCheckoutUserInterface.ELIGEPAIS),
				Enter.theValue(city).into(SophosStoreCheckoutUserInterface.TXT_CIUDAD),
				Enter.theValue(state).into(SophosStoreCheckoutUserInterface.TXT_ESTADO),
				Enter.theValue(postalcode).into(SophosStoreCheckoutUserInterface.TXT_CODIGOPOSTAL),
				Enter.theValue(address).into(SophosStoreCheckoutUserInterface.TXT_DIRECCION),
				Click.on(SophosStoreCheckoutUserInterface.BTN_CONTINUAR),
				
				
				Click.on(SophosStoreConfirmOrderUserInterface.BTN_CONFIRMARPEDIDO),
				
				
				
				Click.on(SophosStorePaymentUserInterface.BTN_PAGOPSE),				
				Click.on(SophosStorePaymentUserInterface.DDL_BANCO),
				Click.on(SophosStorePaymentUserInterface.SLC_BANCO),
				Click.on(SophosStorePaymentUserInterface.DDL_TIPOPERSONA),
				Click.on(SophosStorePaymentUserInterface.SLC_PERSONA),
				Enter.theValue("Cesar Henao").into(SophosStorePaymentUserInterface.TXT_NOMBRETITULAR),
				Click.on(SophosStorePaymentUserInterface.DDL_TIPODOCUMENTO),
				Click.on(SophosStorePaymentUserInterface.SLC_TIPODOCUMENTO),
				Enter.theValue("123456").into(SophosStorePaymentUserInterface.TXT_DOCUMENTO),
				Enter.theValue("chena@corp.com").into(SophosStorePaymentUserInterface.TXT_EMAIL),
				Enter.theValue("3107667").into(SophosStorePaymentUserInterface.TXT_TELEFONO),			
				Click.on(SophosStorePaymentUserInterface.BTN_REALIZARPAGO),
				
				
				Click.on(SophosStorePaymentResultUserInterface.BTN_FINALIZACOMPRA)
				
				);

	}

	public static FinalizaCompra conLosDatos() {
		return Tasks.instrumented(FinalizaCompra.class);

	}

}
