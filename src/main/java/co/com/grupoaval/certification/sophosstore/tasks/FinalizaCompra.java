package co.com.grupoaval.certification.sophosstore.tasks;

import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreConfirmOrderUserInterface;
import co.com.grupoaval.certification.sophosstore.userinterface.SophosStorePaymentResultUserInterface;
import co.com.grupoaval.certification.sophosstore.userinterface.SophosStorePaymentUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FinalizaCompra implements Task {



	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
//				Click.on(SophosStorePaymentUserInterface.BTN_PAGOPSE),
//				Click.on(SophosStorePaymentUserInterface.DDL_BANCO),
//				Click.on(SophosStorePaymentUserInterface.SLC_BANCO),
//				Click.on(SophosStorePaymentUserInterface.DDL_TIPOPERSONA),
//				Click.on(SophosStorePaymentUserInterface.SLC_PERSONA),
//				Enter.theValue("Cesar Henao").into(SophosStorePaymentUserInterface.TXT_NOMBRETITULAR),
//				Click.on(SophosStorePaymentUserInterface.DDL_TIPODOCUMENTO),
//				Click.on(SophosStorePaymentUserInterface.SLC_TIPODOCUMENTO),
//				Enter.theValue("123456").into(SophosStorePaymentUserInterface.TXT_DOCUMENTO),
//				Enter.theValue("chena@corp.com").into(SophosStorePaymentUserInterface.TXT_EMAIL),
//				Enter.theValue("3107667").into(SophosStorePaymentUserInterface.TXT_TELEFONO),
//				Click.on(SophosStorePaymentUserInterface.BTN_REALIZARPAGO),

				Click.on(SophosStorePaymentResultUserInterface.BTN_FINALIZACOMPRA)

		);

	}

	public static FinalizaCompra conLosDatos() {
		return Tasks.instrumented(FinalizaCompra.class);

	}

}
