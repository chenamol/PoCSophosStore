package co.com.grupoaval.certification.sophosstore.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/realizar_compra.feature", 
glue = "co.com.grupoaval.certification.sophosstore.stepdefinitions", 
snippets = SnippetType.CAMELCASE)

public class RealizarCompra {

}
