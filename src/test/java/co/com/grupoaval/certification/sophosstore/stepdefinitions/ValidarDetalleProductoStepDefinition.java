package co.com.grupoaval.certification.sophosstore.stepdefinitions;

import java.util.List;

import org.hamcrest.Matchers;

import co.com.grupoaval.certification.sophosstore.interactions.Esperar;
import co.com.grupoaval.certification.sophosstore.models.DatosProducto;
import co.com.grupoaval.certification.sophosstore.questions.VerificaDescripcion;
import co.com.grupoaval.certification.sophosstore.questions.VerificaImagen;
import co.com.grupoaval.certification.sophosstore.questions.VerificaNombre;
import co.com.grupoaval.certification.sophosstore.tasks.AgregaProductos;
import co.com.grupoaval.certification.sophosstore.tasks.AgregaProductosPorCategoria;
import co.com.grupoaval.certification.sophosstore.tasks.IngresaProducto;
import co.com.grupoaval.certification.sophosstore.tasks.IngresaSeccion;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ValidarDetalleProductoStepDefinition {

	private final String ACTOR = "actor";

	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
		OnStage.theActorCalled(ACTOR);
	}

	@When("^agrega el producto a validar (.*)$")
	public void elProductoAValidar(String producto) {

		OnStage.theActorInTheSpotlight().attemptsTo(IngresaProducto.alDetalle(producto));

	}

	@Then("^verifica que muestre el nombre del producto (.*)$")
	public void verificaQueMuestreElNombreDelProducto(String producto) {
		OnStage.theActorInTheSpotlight().attemptsTo(Esperar.CargaDeContenido());
		OnStage.theActorInTheSpotlight()
				.should(GivenWhenThen.seeThat(VerificaNombre.delProducto(), Matchers.is(producto)));
	}

	@Then("^verifica que se muestre imagen de producto$")
	public void verificaQueSeMuestreImagenDeProducto() {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificaImagen.delProducto()));

	}

	@Then("^verifica que apareza la descripcion del producto (.*)$")
	public void verificaQueAparezaLaDescripcionDelProducto(String descripcion) {
		OnStage.theActorInTheSpotlight()
				.should(GivenWhenThen.seeThat(VerificaDescripcion.delProducto(), Matchers.is(descripcion)));

	}

}
