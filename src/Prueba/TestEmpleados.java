package Prueba;

import junit.framework.TestCase;

public class TestEmpleados extends TestCase{
	private Empleados empleados;
	
	public void escenario() {
	empleados = new Empleados("Alfredo"," Sanchez"," 98609", 34," empaquetador");
     }

   public void empleados () {
	   assertTrue(true);
   }

}
