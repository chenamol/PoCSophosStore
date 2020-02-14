package co.com.grupoaval.certification.sophosstore.tasks;

import co.com.grupoaval.certification.sophosstore.userinterface.SophosStorePaymentUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DiligenciaMetodoDePagoPSE implements Task {

	private String banco;
	private String tipoPersona;
	private String nombreTitular;
	private String tipoDocumento;
	private String documento;
	private String email;
	private String telefono;

	public DiligenciaMetodoDePagoPSE(String banco) {
		this.banco = banco;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SophosStorePaymentUserInterface.BTN_PAGOPSE),
				Click.on(SophosStorePaymentUserInterface.DDL_BANCO),
				Click.on(SophosStorePaymentUserInterface.SLC_BANCO.of(banco)),
				Click.on(SophosStorePaymentUserInterface.DDL_TIPOPERSONA),
				Click.on(SophosStorePaymentUserInterface.SLC_PERSONA.of(tipoPersona)),
				Enter.theValue(nombreTitular).into(SophosStorePaymentUserInterface.TXT_NOMBRETITULAR),
				Click.on(SophosStorePaymentUserInterface.DDL_TIPODOCUMENTO),
				Click.on(SophosStorePaymentUserInterface.SLC_TIPODOCUMENTO.of(tipoDocumento)),
				Enter.theValue(documento).into(SophosStorePaymentUserInterface.TXT_DOCUMENTO),
				Enter.theValue(email).into(SophosStorePaymentUserInterface.TXT_EMAIL),
				Enter.theValue(telefono).into(SophosStorePaymentUserInterface.TXT_TELEFONO),
				Click.on(SophosStorePaymentUserInterface.BTN_REALIZARPAGO));

	}

	public static DiligenciaMetodoDePagoPSE conBanco(String banco) {
		return Tasks.instrumented(DiligenciaMetodoDePagoPSE.class, banco);
	}

	public DiligenciaMetodoDePagoPSE conTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
		return this;
	}

	public DiligenciaMetodoDePagoPSE conNombreTirular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
		return this;
	}

	public DiligenciaMetodoDePagoPSE conDocumento(String documento) {
		this.documento = documento;
		return this;
	}

	public DiligenciaMetodoDePagoPSE conTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
		return this;
	}

	public DiligenciaMetodoDePagoPSE conEmail(String email) {
		this.email = email;
		return this;
	}

	public DiligenciaMetodoDePagoPSE conTelefono(String telefono) {
		this.telefono = telefono;
		return this;
	}

}
