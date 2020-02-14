package co.com.grupoaval.certification.sophosstore.models;

public class DatosDeUsuario {

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

	public String getfirstame() {
		return nombre;
	}

	public String getfLastname() {
		return pApellido;
	}

	public String getsLastname() {
		return sApellido;
	}

	public String getCompany() {
		return compania;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return telefono;
	}

	public String getCountry() {
		return pais;
	}

	public String getCity() {
		return ciudad;
	}

	public String getState() {
		return estado;
	}

	public String getPostalCode() {
		return codigoPostal;
	}

	public String getAddress() {
		return direccion;
	}

}
