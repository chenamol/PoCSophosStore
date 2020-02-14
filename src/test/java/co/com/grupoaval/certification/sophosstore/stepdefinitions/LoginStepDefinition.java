package co.com.grupoaval.certification.sophosstore.stepdefinitions;

import java.util.List;

import org.hamcrest.Matchers;

import co.com.grupoaval.certification.sophosstore.models.DatosInicioSesion;
import co.com.grupoaval.certification.sophosstore.questions.VerificarInicioFallido;
import co.com.grupoaval.certification.sophosstore.questions.VerificarNombreCuenta;
import co.com.grupoaval.certification.sophosstore.tasks.IngresaDetalle;
import co.com.grupoaval.certification.sophosstore.tasks.IniciaSesion;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginStepDefinition {

	private final String ACTOR = "actor";

	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
		OnStage.theActorCalled(ACTOR);
	}

	@Given("^que el usuario se encuentra en la pagina principal$")
	public void queElUsuarioSeEncuentraEnLaPaginaPrincipal() {
		OnStage.theActorInTheSpotlight()
				.attemptsTo(Open.url("http://aca5ae963492711eaa1ea0a23e0edceb-673580570.us-east-1.elb.amazonaws.com/"));

	}

	@When("^el ingresa la informacion de la cuenta$")
	public void elIngresaLaInformacionDeLaCuenta(List<DatosInicioSesion> DatosInicioSesion) {
		OnStage.theActorInTheSpotlight().attemptsTo(IniciaSesion.conUsername(DatosInicioSesion.get(0).getUsername())
				.conPassword(DatosInicioSesion.get(0).getPassword()));
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Then("^el se registra exitosamente visualizando su imagen de perfil$")
	public void elSeRegistraExitosamenteVisualizandoSuNombre() {
		OnStage.theActorInTheSpotlight().attemptsTo(IngresaDetalle.deCuenta());
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarNombreCuenta.conNombre()));
	}

	@Then("^el usuario visualiza la palabra (.*)$")
	public void elUsuarioVisualizaLaPalabraIngresar(String palabra) {
		OnStage.theActorInTheSpotlight().attemptsTo(IngresaDetalle.deCuenta());
		OnStage.theActorInTheSpotlight()
				.should(GivenWhenThen.seeThat(VerificarInicioFallido.conClaveInvalida(), Matchers.is(palabra)));

	}

}
