package co.com.grupoaval.certification.sophosstore.stepdefinitions;

import java.util.List;

import co.com.grupoaval.certification.sophosstore.models.DatosSelecionProducto;
import co.com.grupoaval.certification.sophosstore.tasks.AgrepaProductos;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
				AgrepaProductos.seleccionaCategoria(DatosSelecionProducto.get(0).getCategoria())
						.seleccionaProducto(DatosSelecionProducto.get(0).getProducto()),
				AgrepaProductos.seleccionaCategoria(DatosSelecionProducto.get(1).getCategoria())
						.seleccionaProducto(DatosSelecionProducto.get(1).getProducto())
//				AgrepaProductos.seleccionaCategoria(DatosSelecionProducto.get(2).getCategoria())
//						.seleccionaProducto(DatosSelecionProducto.get(2).getProducto())
						);
	}

	@When("^el usuario elimina uno de los productos del carrito$")
	public void elUsuarioEliminaUnoDeLosProductosDelCarrito(List<DatosSelecionProducto> DatosSelecionProducto) {

	}

	@Then("^el finaliza con la compra con exito visualizando el mensaje Felicidades! Su orden ha sido procesada$")
	public void elFinalizaConLaCompraConExitoVisualizandoElMensajeFelicidadesSuOrdenHaSidoProcesada() {

	}

}
