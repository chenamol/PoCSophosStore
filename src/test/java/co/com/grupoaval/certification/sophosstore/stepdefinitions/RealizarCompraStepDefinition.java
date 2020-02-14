package co.com.grupoaval.certification.sophosstore.stepdefinitions;

import java.util.List;

import org.hamcrest.Matchers;

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
	public void elUsuarioAgregaLosProductosAComprar(List<DatosProducto> DatosProducto) {
		OnStage.theActorInTheSpotlight().attemptsTo(
				AgregaProductosPorCategoria.seleccionaCategoria(DatosProducto.get(0).getCategoria())
						.seleccionaProducto(DatosProducto.get(0).getProducto()),
				AgregaProductosPorCategoria.seleccionaCategoria(DatosProducto.get(1).getCategoria())
						.seleccionaProducto(DatosProducto.get(1).getProducto()));
	}

	@When("^el usuario elimina uno de los productos del carrito$")
	public void elUsuarioEliminaUnoDeLosProductosDelCarrito(List<DatosProducto> DatosProducto) {
		OnStage.theActorInTheSpotlight()
				.attemptsTo(EliminarProductosDelCarrito.seleccionaProducto(DatosProducto.get(0).getProducto()));
	}

	@When("^el usuario diligencia la informacion de envio$")
	public void elUsuarioDiligenciaLaInformacionDeEnvO(List<DatosDeUsuario> DatosDeUsuario) {
		OnStage.theActorInTheSpotlight()
				.attemptsTo(DiligenciaDatos.conNombre(DatosDeUsuario.get(0).getfirstame())
						.conPrimerApellido(DatosDeUsuario.get(0).getfLastname())
						.conSegundoApellido(DatosDeUsuario.get(0).getsLastname())
						.conCompania(DatosDeUsuario.get(0).getCompany()).conEmail(DatosDeUsuario.get(0).getEmail())
						.conTelefono(DatosDeUsuario.get(0).getPhone()).conPais(DatosDeUsuario.get(0).getCountry())
						.conCiudad(DatosDeUsuario.get(0).getCity()).conEstado(DatosDeUsuario.get(0).getState())
						.conCodigoPostal(DatosDeUsuario.get(0).getPostalCode())
						.conDireccion(DatosDeUsuario.get(0).getAddress()));

	}

	@Then("^el usuario verifica la informacion de envio$")
	public void elUsuarioVerificaLaInformacionDeEnvio() {
		OnStage.theActorInTheSpotlight().attemptsTo(ConfirmaPedido.realizado());

	}

	@Then("^el usuario selecciona metodo de pago a traves de pse con datos$")
	public void elUsuarioSeleccionaMetodoDePagoATravezDePseConDtos(List<DatosDePagoPSE> DatosDePagoPSE) {
		
		DatosDePagoPSE.forEach(datos ->{
			OnStage.theActorInTheSpotlight()
			.attemptsTo(DiligenciaMetodoDePagoPSE.conBanco(datos.getBank())
					.conTipoPersona(datos.getKindPerson())
					.conNombreTirular(datos.getOwnerName())
					.conTipoDocumento(datos.getDocumentType())
					.conDocumento(datos.getDocument()).conEmail(datos.getEmail())
					.conTelefono(datos.getPhone()));
		});
//		OnStage.theActorInTheSpotlight()
//				.attemptsTo(DiligenciaMetodoDePagoPSE.conBanco(DatosDePagoPSE.get(0).getBank())
//						.conTipoPersona(DatosDePagoPSE.get(0).getKindPerson())
//						.conNombreTirular(DatosDePagoPSE.get(0).getOwnerName())
//						.conTipoDocumento(DatosDePagoPSE.get(0).getDocumentType())
//						.conDocumento(DatosDePagoPSE.get(0).getDocument()).conEmail(DatosDePagoPSE.get(0).getEmail())
//						.conTelefono(DatosDePagoPSE.get(0).getPhone()));

	}

	@Then("^el finaliza con la compra con exito visualizando el mensaje (.*)$")
	public void elFinalizaConLaCompraConExitoVisualizandoElMensaje(String mensaje) {
		OnStage.theActorInTheSpotlight().attemptsTo(FinalizaCompra.conResultadoDePago());
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarCompra.exitosa(), Matchers.is(mensaje)));

	}

	// ESCENARIO PARA BUSCAR POR TODAS LAS CATEGORIAS

	@When("^el usuario agrega los productos a comprar desde la seccion Todas las categorias$")
	public void elUsuarioAgregaLosProductosAComprarDesdeLaSeccionTodasLasCategorias(List<DatosProducto> datosProducto) {
		
		datosProducto.forEach(producto-> {
			OnStage.theActorInTheSpotlight().attemptsTo(seleccionaProducto(producto.getProducto()));
		});

	}

}
