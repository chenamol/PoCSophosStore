package co.com.grupoaval.certification.sophosstore.stepdefinitions;

import java.util.List;

import org.hamcrest.Matchers;

import co.com.grupoaval.certification.sophosstore.interactions.Esperar;
import co.com.grupoaval.certification.sophosstore.models.DatosDePagoPSE;
import co.com.grupoaval.certification.sophosstore.models.DatosDeUsuario;
import co.com.grupoaval.certification.sophosstore.models.DatosProducto;
import co.com.grupoaval.certification.sophosstore.questions.VerificarCompra;
import static co.com.grupoaval.certification.sophosstore.tasks.AgregaProductos.seleccionaProducto;
import co.com.grupoaval.certification.sophosstore.tasks.AgregaProductosPorCategoria;
import co.com.grupoaval.certification.sophosstore.tasks.ConfirmaPedido;
import co.com.grupoaval.certification.sophosstore.tasks.DiligenciaDatos;
import co.com.grupoaval.certification.sophosstore.tasks.DiligenciaMetodoDePagoPSE;
import co.com.grupoaval.certification.sophosstore.tasks.EliminarProductosDelCarrito;
import co.com.grupoaval.certification.sophosstore.tasks.FinalizaCompra;
import static co.com.grupoaval.certification.sophosstore.tasks.IngresaSeccion.todasLasCategorias;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RealizarCompraStepDefinition {

	private final String ACTOR = "actor";

	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
		OnStage.theActorCalled(ACTOR);
	}

	@When("^el usuario agrega los productos a comprar$")
	public void elUsuarioAgregaLosProductosAComprar(List<DatosProducto> datosProducto) {
		datosProducto.forEach(producto -> {

			OnStage.theActorInTheSpotlight().attemptsTo(
					AgregaProductosPorCategoria.seleccionaCategoria(producto.getCategoria())
							.seleccionaProducto(producto.getProducto()),
					Esperar.CargaDeContenido(), AgregaProductosPorCategoria.seleccionaCategoria(producto.getCategoria())
							.seleccionaProducto(producto.getProducto()));

		});

	}

	@When("^el usuario elimina uno de los productos del carrito$")
	public void elUsuarioEliminaUnoDeLosProductosDelCarrito(List<DatosProducto> datosProducto) {
		datosProducto.forEach(producto -> {

			OnStage.theActorInTheSpotlight()
					.attemptsTo(EliminarProductosDelCarrito.seleccionaProducto(producto.getProducto()),
							Esperar.CargaDeContenido());
		});

	}

	@When("^el usuario diligencia la informacion de envio$")
	public void elUsuarioDiligenciaLaInformacionDeEnvO(List<DatosDeUsuario> datosDeUsuario) {
		datosDeUsuario.forEach(datos -> {

			OnStage.theActorInTheSpotlight()
					.attemptsTo(DiligenciaDatos.conNombre(datos.getfirstame())
							.conPrimerApellido(datos.getfLastname()).conSegundoApellido(datos.getsLastname())
							.conCompania(datos.getCompany()).conEmail(datos.getEmail()).conTelefono(datos.getPhone())
							.conPais(datos.getCountry()).conCiudad(datos.getCity()).conEstado(datos.getState())
							.conCodigoPostal(datos.getPostalCode()).conDireccion(datos.getAddress()),
							Esperar.CargaDeContenido());

		});

	}

	@Then("^el usuario verifica la informacion de envio$")
	public void elUsuarioVerificaLaInformacionDeEnvio() {
		OnStage.theActorInTheSpotlight().attemptsTo(ConfirmaPedido.realizado(), Esperar.CargaDeContenido());

	}

	@Then("^el usuario selecciona metodo de pago a traves de pse con datos$")
	public void elUsuarioSeleccionaMetodoDePagoATravezDePseConDtos(List<DatosDePagoPSE> datosDePagoPSE) {

		datosDePagoPSE.forEach(datos -> {
			OnStage.theActorInTheSpotlight()
					.attemptsTo(DiligenciaMetodoDePagoPSE.conBanco(datos.getBank())
							.conTipoPersona(datos.getKindPerson()).conNombreTirular(datos.getOwnerName())
							.conTipoDocumento(datos.getDocumentType()).conDocumento(datos.getDocument())
							.conEmail(datos.getEmail()).conTelefono(datos.getPhone()),
							Esperar.CargaDeContenido());
		});

	}

	@Then("^el finaliza con la compra con exito visualizando el mensaje (.*)$")
	public void elFinalizaConLaCompraConExitoVisualizandoElMensaje(String mensaje) {
		OnStage.theActorInTheSpotlight().attemptsTo(FinalizaCompra.conResultadoDePago());
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarCompra.exitosa(), Matchers.is(mensaje)));

	}

	// ESCENARIO PARA BUSCAR POR TODAS LAS CATEGORIAS

	@When("^el usuario agrega los productos a comprar desde la seccion Todas las categorias$")
	public void elUsuarioAgregaLosProductosAComprarDesdeLaSeccionTodasLasCategorias(List<DatosProducto> datosProducto) {
		OnStage.theActorInTheSpotlight().attemptsTo(todasLasCategorias());
		datosProducto.forEach(producto -> {
			OnStage.theActorInTheSpotlight().attemptsTo(seleccionaProducto(producto.getProducto()));
		});

	}

}
