package co.com.grupoaval.certification.sophosstore.models;

public class DatosDePagoPSE {

	private String banco;
	private String tipoPersona;
	private String nombreTitular;
	private String tipoDocumento;
	private String documento;
	private String email;
	private String telefono;

	public String getBank() {
		return banco;
	}

	public String getKindPerson() {
		return tipoPersona;
	}

	public String getOwnerName() {
		return nombreTitular;
	}

	public String getDocumentType() {
		return tipoDocumento;
	}

	public String getDocument() {
		return documento;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return telefono;
	}

}
