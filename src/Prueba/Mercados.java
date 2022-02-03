package Prueba;

public class Mercados {

	private String nombre_M;
	private String ubicacion_M;
	private int numero_de_mercado;
	private String rut_M;
	private String comuna_M;
	private String telfono;
	private String correo;

	
	public Mercados(String nombre_M, String ubicacion_M, int numero_de_mercado, String rut_M, String comuna_M,
			String telfono, String correo) {

		this.nombre_M = nombre_M;
		this.ubicacion_M = ubicacion_M;
		this.numero_de_mercado = numero_de_mercado;
		this.rut_M = rut_M;
		this.comuna_M = comuna_M;
		this.telfono = telfono;
		this.correo = correo;
	}


	public String getNombre_M() {
		return nombre_M;
	}


	public void setNombre_M(String nombre_M) {
		this.nombre_M = nombre_M;
	}


	public String getUbicacion_M() {
		return ubicacion_M;
	}


	public void setUbicacion_M(String ubicacion_M) {
		this.ubicacion_M = ubicacion_M;
	}


	public int getNumero_de_mercado() {
		return numero_de_mercado;
	}


	public void setNumero_de_mercado(int numero_de_mercado) {
		this.numero_de_mercado = numero_de_mercado;
	}


	public String getRut_M() {
		return rut_M;
	}


	public void setRut_M(String rut_M) {
		this.rut_M = rut_M;
	}


	public String getComuna_M() {
		return comuna_M;
	}


	public void setComuna_M(String comuna_M) {
		this.comuna_M = comuna_M;
	}


	public String getTelfono() {
		return telfono;
	}


	public void setTelfono(String telfono) {
		this.telfono = telfono;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}

}