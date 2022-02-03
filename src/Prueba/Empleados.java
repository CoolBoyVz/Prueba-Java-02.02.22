package Prueba;

public class Empleados {

	private String nombre;
	private String apellido;
	private String rut;
	private int edad;
	private String puesto_de_trabajo;

	public Empleados(String nombre, String apellido, String rut, int edad, String puesto_de_trabajo) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.edad = edad;
		this.puesto_de_trabajo = puesto_de_trabajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPuesto_de_trabajo() {
		return puesto_de_trabajo;
	}

	public void setPuesto_de_trabajo(String puesto_de_trabajo) {
		this.puesto_de_trabajo = puesto_de_trabajo;
	}
	
	
}



