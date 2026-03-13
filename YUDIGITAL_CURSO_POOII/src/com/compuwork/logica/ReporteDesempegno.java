package com.compuwork.logica;

//IMPORTACIONES----------------------------------

import java.util.Date;

public class ReporteDesempegno {
	
	//CAMPOS--------------------------------------
	
	private Empleado empleado;
	
	private Date fecha;
	
	private String metricas;
	
	private double puntaje;
	
	
	//CONSTRUCTOR----------------------------------
	
	public ReporteDesempegno(Empleado empleado, String metricas, double puntaje) throws DesbordamientoDatosCalificacionException{
		
		if(puntaje < 0 || puntaje > 100) {
			
			throw new DesbordamientoDatosCalificacionException(puntaje);
			
		}
		
		this.empleado = empleado;
		
		this.metricas = metricas;
		
		this.puntaje = puntaje;
		
		this.fecha = new Date();
		
	}
	
	//MÉTODOS---------------------------------------
	
	public String generarReporte() throws Exception{ //Método para generar un reporte detallado
		
		if(this.empleado == null) {
			
			throw new Exception ("Error: no se puede generar el reporte sin ñun empleado vinculado");
			
		}
		
		StringBuilder reporte = new StringBuilder();
		
		reporte.append("REPORTE DE DESEMPEÑO COMPUWORK\n");
		
		reporte.append("Fecha: ").append(this.fecha).append("\n");
		
		reporte.append("ID Empleado: ").append(empleado.getId()).append("\n");
		
		reporte.append("Nombre: ").append(empleado.getNombre()).append("\n");
		
		reporte.append("Departamento: ").append(empleado.getDepartamento()).append("\n");
		
		reporte.append("Métricas evaluadas: ").append(this.metricas).append("\n");
		
		reporte.append("Puntaje obtenido: ").append(this.puntaje).append("/100\n");
		
		return reporte.toString();
		
	}
	
	//GETTERS------------------------------
	
	public Empleado getEmpleado() { return empleado;}
	
	public Date getFecha() { return fecha;}
	
	public String getMetricas() { return metricas;}
	
	public double getPuntaje() { return puntaje;}

}
