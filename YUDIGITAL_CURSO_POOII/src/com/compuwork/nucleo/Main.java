package com.compuwork.nucleo;

//IMPORTACIONES-----------------------------

import com.compuwork.logica.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BLOQUE TRY-CATCH--------------------------------------
		
		try {
			
			//PARA CREAR DEPARTAMENTO
			
			Departamento deptoTi = new Departamento("Tecnología");
			
			Departamento deptoAseo = new Departamento("Aseo");
			
			//PARA CREAR EMPLEADO
			
			Empleado emp1 = new EmpleadoPermanente(16, "Bayron", 2500000, 50000);
			
			Empleado emp2 = new EmpleadoTemporal(75, "Porfidio", 1750000, 30, 03, 2026);
			
			//PARA ASIGNAR EMPELADO A DEPARTAMENTO
			
			deptoTi.assignarEmpleado(emp1);
			
			System.out.println();
			
			deptoAseo.assignarEmpleado(emp2);
			
			System.out.println();
			
			//PARA GENERAR REPORTE DE DESEMPEÑO
			
			ReporteDesempegno reporteEmp1 = new ReporteDesempegno(emp1, "Muy productivo, puntual y colaborador", 99.5);
			
			ReporteDesempegno reporteEmp2 = new ReporteDesempegno(emp2, "Muy flojo y falto de compromiso: no quiere madrugar a las 3:00 a.m. y se quiere ir antes de las 11:00 p.m.; además, "
					+ "no quiere trarerle el cafesito a los jefes y es contestón", 0.01);
			
			//IMPRIMIR EN CONSOLA
			
			System.out.println(reporteEmp1.generarReporte() + "\n\n" + reporteEmp2.generarReporte());
			
			
		}catch (Exception e) {//Para atrapar excerciones (errores)
		
			System.err.println(e.getMessage());
			
		}

	}

}
