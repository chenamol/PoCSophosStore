package co.com.grupoaval.certification.sophosstore.stepdefinitions;

import java.util.List;

import org.hamcrest.Matchers;

import co.com.grupoaval.certification.sophosstore.models.DatosDeProducto;
import co.com.grupoaval.certification.sophosstore.models.DatosSelecionProducto;
import co.com.grupoaval.certification.sophosstore.questions.VerificarCompra;
import co.com.grupoaval.certification.sophosstore.tasks.AgregaProductos;
import co.com.grupoaval.certification.sophosstore.tasks.AgregaProductosPorCategoria;
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
	public void elUsuarioAgregaLosProductosAComprar(List<DatosSelecionProducto> DatosSelecionProducto) {
		OnStage.theActorInTheSpotlight().attemptsTo(
				AgregaProductosPorCategoria.seleccionaCategoria(DatosSelecionProducto.get(0).getCategoria())
						.seleccionaProducto(DatosSelecionProducto.get(0).getProducto()),
				AgregaProductosPorCategoria.seleccionaCategoria(DatosSelecionProducto.get(1).getCategoria())
						.seleccionaProducto(DatosSelecionProducto.get(1).getProducto())
//				AgregaProductosPorCategoria.seleccionaCategoria(DatosSelecionProducto.get(2).getCategoria())
//						.seleccionaProducto(DatosSelecionProducto.get(2).getProducto())
		);
	}

	@When("^el usuario elimina uno de los productos del carrito$")
	public void elUsuarioEliminaUnoDeLosProductosDelCarrito(List<DatosSelecionProducto> DatosSelecionProducto) {
		OnStage.theActorInTheSpotlight()
				.attemptsTo(EliminarProductosDelCarrito.seleccionaProducto(DatosSelecionProducto.get(0).getProducto()));
	}

	@Then("^el finaliza con la compra con exito visualizando el mensaje (.*)$")
	public void elFinalizaConLaCompraConExitoVisualizandoElMensaje(String mensaje) {
		OnStage.theActorInTheSpotlight().attemptsTo(FinalizaCompra.conLosDatos());
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarCompra.exitosa(), Matchers.is(mensaje)));

	}

	// ESCENARIO PARA BUSCAR POR TODAS LAS CATEGORIAS

	@When("^el usuario agrega los productos a comprar desde la seccion Todas las categorias$")
	public void elUsuarioAgregaLosProductosAComprarDesdeLaSeccionTodasLasCategorias(
			List<DatosSelecionProducto> DatosSelecionProducto) {
		OnStage.theActorInTheSpotlight()
				.attemptsTo(AgregaProductos.seleccionaProducto(DatosSelecionProducto.get(0).getProducto())
						.seleccionaProducto(DatosSelecionProducto.get(0).getProducto()));
	}

}
