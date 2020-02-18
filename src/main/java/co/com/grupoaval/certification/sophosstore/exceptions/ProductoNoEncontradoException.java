package co.com.grupoaval.certification.sophosstore.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class ProductoNoEncontradoException extends SerenityManagedException{
	public static final String MENSAJE_PRODUCTO_NO_ENCONTRADO = "El producto no fue encontrado en esta categoría";
	
	public ProductoNoEncontradoException(String mensaje, Throwable errorException) {
		super(mensaje, errorException);
	}


}
