package modelo;

import java.util.ArrayDeque;

public class Servicio {

	private ArrayDeque<Cliente> clientesAtendidos = new ArrayDeque<>();
	private ArrayDeque<Cliente> clientesEsperando = new ArrayDeque<>();

	public boolean crearCliente(String nombre, String movil) {
		try {
			this.clientesEsperando.add(new Cliente(nombre, Integer.parseInt(movil)));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void atenderCliente() {
		this.clientesEsperando.getFirst().atender();
		this.clientesAtendidos.addFirst(this.clientesEsperando.pop());
	}

	public long calcularTiempoMedioEspera(ArrayDeque<Cliente> clientes) {
		try {
			return calcularTiempoEspera(clientes) / clientes.size(); 
		} catch (ArithmeticException e) {
			return 0;
		}
	}
	
	private long calcularTiempoEspera(ArrayDeque<Cliente> clientes) {
		long tiempo = 0;
		for (Cliente cliente : clientes) {
			tiempo += cliente.getCita().obtenerTiempoDeEspera();
		}
		
		return tiempo;
	}
	
	public ArrayDeque<Cliente> getClientesAtendidos() {
		return clientesAtendidos;
	}

	public ArrayDeque<Cliente> getClientesEsperando() {
		return clientesEsperando;
	}

}
