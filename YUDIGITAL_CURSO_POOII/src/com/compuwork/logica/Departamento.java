package com.compuwork.logica;

//IMPORTACIONES-------------------------------------------

import java.util.ArrayList;

import java.util.List;

public class Departamento {
	
	//CAMPOS--------------------------------------------
	
	private String nombreDepto;
	
	private List<Empleado> listaEmpleados;
	
	//CONSTRUCTOR-----------------------------------
	
	public Departamento(String nombreDepto) {
		
		this.nombreDepto = nombreDepto;
		
		this.listaEmpleados = new ArrayList<>();
		
	}
	
	//MÉTODOS---------------------------------------
	
	public void	assignarEmpleado(Empleado emp) throws Exception{
		
		if(emp == null) {
			
			throw new Exception("Error: no se puede asignar un empleado inexistente");
			
		}
		
		emp.setDepartamento(this.nombreDepto);
		
		listaEmpleados.add(emp);
		
		System.out.println("Empleado " + emp.getNombre() + " asignado a " + nombreDepto);
		
	}
	
	
	public List<Empleado> getListaEmpleados(){ return listaEmpleados;}
	

}
