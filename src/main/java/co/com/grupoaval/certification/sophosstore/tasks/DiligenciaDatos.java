package co.com.grupoaval.certification.sophosstore.tasks;

import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreCheckoutUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DiligenciaDatos implements Task {

	private String nombre;
	private String pApellido;
	private String sApellido;
	private String compania;
	private String email;
	private String telefono;
	private String pais;
	private String ciudad;
	private String estado;
	private String codigoPostal;
	private String direccion;

	public DiligenciaDatos(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(nombre).into(SophosStoreCheckoutUserInterface.TXT_NOMBRE),
				Enter.theValue(pApellido).into(SophosStoreCheckoutUserInterface.TXT_PAPELLIDO),
				Enter.theValue(sApellido).into(SophosStoreCheckoutUserInterface.TXT_SAPELLIDO),
				Enter.theValue(compania).into(SophosStoreCheckoutUserInterface.TXT_COMPANIA),
				Enter.theValue(email).into(SophosStoreCheckoutUserInterface.TXT_EMAIL),
				Enter.theValue(telefono).into(SophosStoreCheckoutUserInterface.TXT_TELEFONO),
				Click.on(SophosStoreCheckoutUserInterface.LST_PAIS),
				Click.on(SophosStoreCheckoutUserInterface.ELIGEPAIS.of(pais)),
				Enter.theValue(ciudad).into(SophosStoreCheckoutUserInterface.TXT_CIUDAD),
				Enter.theValue(estado).into(SophosStoreCheckoutUserInterface.TXT_ESTADO),
				Enter.theValue(codigoPostal).into(SophosStoreCheckoutUserInterface.TXT_CODIGOPOSTAL),
				Enter.theValue(direccion).into(SophosStoreCheckoutUserInterface.TXT_DIRECCION),
				Click.on(SophosStoreCheckoutUserInterface.BTN_CONTINUAR));

	}

	public static DiligenciaDatos conNombre(String nombre) {
		return Tasks.instrumented(DiligenciaDatos.class, nombre);
	}

	public DiligenciaDatos conPrimerApellido(String pApellido) {
		this.pApellido = pApellido;
		return this;
	}

	public DiligenciaDatos conSegundoApellido(String sApellido) {
		this.sApellido = sApellido;
		return this;
	}

	public DiligenciaDatos conCompania(String compania) {
		this.compania = compania;
		return this;
	}

	public DiligenciaDatos conEmail(String email) {
		this.email = email;
		return this;
	}

	public DiligenciaDatos conTelefono(String telefono) {
		this.telefono = telefono;
		return this;
	}

	public DiligenciaDatos conPais(String pais) {
		this.pais = pais;
		return this;
	}

	public DiligenciaDatos conCiudad(String ciudad) {
		this.ciudad = ciudad;
		return this;
	}

	public DiligenciaDatos conEstado(String estado) {
		this.estado = estado;
		return this;
	}

	public DiligenciaDatos conCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
		return this;
	}
	
	public DiligenciaDatos conDireccion(String direccion) {
		this.direccion = direccion;
		return this;
	}

}
