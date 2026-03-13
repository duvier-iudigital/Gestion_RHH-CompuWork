package com.compuwork.logica;

public class EmpleadoPermanente extends Empleado{
	
	//CAMPOS-------------------------------
	
	private final String tipoContrato;
	
	private int salario, bono;
	
	//CONSTRUCTOR-------------------------
	
	public EmpleadoPermanente(int id, String nombre, int sueldoBase, int bono) {
		
		super(id, nombre, sueldoBase);
		
		tipoContrato = "Indefinido";
		
		this.bono = bono;
		
	}
	
	//MÉTODO ABSTRACTO----------------------
	
	public void calcularSalario() { salario = getSueldoBase() + bono; }
	
	//GETTER------------------------
	
	public String getTipoContrato() { return tipoContrato;}

	public int getSalario() {return salario;}
	
	public int getBono() { return bono;}

}
