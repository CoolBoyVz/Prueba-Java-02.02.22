package Prueba;

public class Proveedor {
	private String nombre_Pr;
	private String numero_Pr;
	private String rut_Pr;
	private String ubicacion_Pr;
	private String comuna_Pr;
	
	public Proveedor(String nombre_Pr, String numero_Pr, String rut_Pr, String ubicacion_Pr, String comuna_Pr) {
	
		this.nombre_Pr = nombre_Pr;
		this.numero_Pr = numero_Pr;
		this.rut_Pr = rut_Pr;
		this.ubicacion_Pr = ubicacion_Pr;
		this.comuna_Pr = comuna_Pr;
	}

	public String getNombre_Pr() {
		return nombre_Pr;
	}

	public void setNombre_Pr(String nombre_Pr) {
		this.nombre_Pr = nombre_Pr;
	}

	public String getNumero_Pr() {
		return numero_Pr;
	}

	public void setNumero_Pr(String numero_Pr) {
		this.numero_Pr = numero_Pr;
	}

	public String getRut_Pr() {
		return rut_Pr;
	}

	public void setRut_Pr(String rut_Pr) {
		this.rut_Pr = rut_Pr;
	}

	public String getUbicacion_Pr() {
		return ubicacion_Pr;
	}

	public void setUbicacion_Pr(String ubicacion_Pr) {
		this.ubicacion_Pr = ubicacion_Pr;
	}

	public String getComuna_Pr() {
		return comuna_Pr;
	}

	public void setComuna_Pr(String comuna_Pr) {
		this.comuna_Pr = comuna_Pr;
	}
	
}
