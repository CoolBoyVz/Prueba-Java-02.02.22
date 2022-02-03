package Prueba;

import java.util.ArrayList;

public class Productos {

	private ArrayList<String> nombre_P;
	private ArrayList<String> precio_p;
	private ArrayList<String> cantidad;

	public Productos(ArrayList<String> nombre_P, ArrayList<String> precio_p, ArrayList<String> cantidad) {

		this.nombre_P = nombre_P;
		this.precio_p = precio_p;
		this.cantidad = cantidad;
	}

	public ArrayList<String> getNombre_P() {
		return nombre_P;
	}

	public void setNombre_P(ArrayList<String> nombre_P) {
		this.nombre_P = nombre_P;
	}

	public ArrayList<String> getPrecio_p() {
		return precio_p;
	}

	public void setPrecio_p(ArrayList<String> precio_p) {
		this.precio_p = precio_p;
	}

	public ArrayList<String> getCantidad() {
		return cantidad;
	}

	public void setCantidad(ArrayList<String> cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
