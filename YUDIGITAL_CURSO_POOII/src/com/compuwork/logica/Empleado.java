package com.compuwork.logica;

public abstract class Empleado {
	
	//CAMPOS-----------------------------------
	
	private int id, sueldoBase;
	
	private String nombre;
		
	private String departamento;
	
	//CONSTRUCTOR-----------------------------
	
	public Empleado(int id, String nombre, int sueldoBase) {
		
		this.id = id;
		
		this.nombre = nombre;
		
		this.sueldoBase = sueldoBase;
		
	}
	
	//MÉTODO ABSTRACTO------------------------------
	
	public abstract void calcularSalario();
	
	//GETTERS Y SETTERS-----------------------------
	
	public int getId() { return id;}
		
	public String getNombre() { return nombre;}
		
	public int getSueldoBase() { return sueldoBase;}
	
		
	public String getDepartamento() { return departamento;}
	
	public void setDepartamento(String departamento) { this.departamento = departamento;}

}
