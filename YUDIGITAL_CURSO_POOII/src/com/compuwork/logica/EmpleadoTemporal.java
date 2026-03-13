package com.compuwork.logica;

//IMPORTACIONES-----------------------------

import java.util.Date;

import java.util.GregorianCalendar;

public class EmpleadoTemporal extends Empleado{

	//CAMPOS-------------------------------
	
	private String tipoContrato;
	
	private Date finalizacionContrato;
	
	private int salario;
	
	//CONSTRUCTOR-------------------------
	
	public EmpleadoTemporal (int id, String nombre, int sueldoBase, int dia, int mes, int agno) {
		
		super(id, nombre, sueldoBase);
		
		tipoContrato = "Prestación de servicios";
		
		GregorianCalendar calendario = new GregorianCalendar(dia, mes - 1, agno);
		
		finalizacionContrato = calendario.getTime();
		
	}
	
	//MÉTODO ABSTRACTO----------------------
	
	public void calcularSalario() { salario = getSueldoBase();} 
	
	//GETTER Y SETTER------------------------
	
	public String getTipoContrato() {return tipoContrato;}

	public Date getFinalizacionContrato() { return finalizacionContrato;}
	
	public int getSalario() { return salario;}
	
}
