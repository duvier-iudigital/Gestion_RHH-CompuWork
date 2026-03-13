package com.compuwork.logica;

public class DesbordamientoDatosCalificacionException extends Exception{
	
	//CONSTRUCTOR----------------------------------
	
	public DesbordamientoDatosCalificacionException(double valor) {
		
		super("Error: la calificación  " + valor + " es inválida. Debe erstar entre 0.0 y 100.0");
		
	}

}
