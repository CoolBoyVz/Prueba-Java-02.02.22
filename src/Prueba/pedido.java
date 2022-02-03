package Prueba;

import java.util.ArrayList;

public class pedido {

	private String fecha_de_envio;
	private String hora_de_salida;
	private String hora_de_llegada;
	private ArrayList<String> cantidad_Pe;
	
	public pedido(String fecha_de_envio, String hora_de_salida, String hora_de_llegada, ArrayList<String> cantidad_Pe) {

		this.fecha_de_envio = fecha_de_envio;
		this.hora_de_salida = hora_de_salida;
		this.hora_de_llegada = hora_de_llegada;
		this.cantidad_Pe = cantidad_Pe;
	}

	public String getFecha_de_envio() {
		return fecha_de_envio;
	}

	public void setFecha_de_envio(String fecha_de_envio) {
		this.fecha_de_envio = fecha_de_envio;
	}

	public String getHora_de_salida() {
		return hora_de_salida;
	}

	public void setHora_de_salida(String hora_de_salida) {
		this.hora_de_salida = hora_de_salida;
	}

	public String getHora_de_llegada() {
		return hora_de_llegada;
	}

	public void setHora_de_llegada(String hora_de_llegada) {
		this.hora_de_llegada = hora_de_llegada;
	}

	public ArrayList<String> getCantidad_Pe() {
		return cantidad_Pe;
	}

	public void setCantidad_Pe(ArrayList<String> cantidad_Pe) {
		this.cantidad_Pe = cantidad_Pe;
	}

	
}
