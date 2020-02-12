package co.com.grupoaval.certification.sophosstore.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.grupoaval.certification.sophosstore.userinterface.SophosStoreLoginUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IniciaSesion implements Task {

	private String username, password;

	public IniciaSesion(String username) {
		this.username = username;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(username).into(SophosStoreLoginUserInterface.INPUT_USERNAME),
				Enter.theValue(password).into(SophosStoreLoginUserInterface.INPUT_PASSWORD),
				Click.on(SophosStoreLoginUserInterface.BTN_LOGIN));

	}

	public static IniciaSesion conUsername(String username) {
		return instrumented(IniciaSesion.class, username);
	}

	public IniciaSesion conPassword(String password) {
		this.password = password;
		return this;
	}

}
