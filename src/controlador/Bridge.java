package controlador;

import modelo.Cliente;
import modelo.Servicio;
import vista.UI;

public class Bridge extends UI {
	
	private Servicio control;
	
	public Bridge() {
		this.control = new Servicio();
		agregarCliente.addActionListener(new ActionAgregarCliente(this));
		atenderCliente.addActionListener(new ActionAtenderCliente(this));
		actualizarTiemposDeEspera();
		actualizarClientes();
	}
	
	public void agregarCliente() {
		if(comprobarValorDeCampos()) {
			ocultarInformadorDeErrores();
			if(!this.control.crearCliente(nombre.getText(), movil.getText())) {
				mostrarInformadorDeErrores();
			} else {
				borrarCampos();
			}
		}
	}

	public void atenderCliente() {
		if(!this.control.getClientesEsperando().isEmpty()) {
			this.control.atenderCliente();
		}
	}
	
	public void actualizarClientes() {
		actualizarClientesEsperando();
		actualizarClientesAtendidos();
	}
	
	private void actualizarClientesEsperando() {
		itemsEsperando.setText("#" + this.control.getClientesEsperando().size());
	}
	
	private void actualizarClientesAtendidos() {
		itemsAtendidos.setText("#" + this.control.getClientesAtendidos().size());
	}
	
	public void actualizarTiemposDeEspera() {
		actualizarTiempoEsperando();
		actualizarTiemposAtendidos();
	}
	
	private void actualizarTiemposAtendidos() {
		tiempoMedioAtendidos.setText(String.valueOf(this.control.calcularTiempoMedioEspera(this.control.getClientesAtendidos())) + " segundos");
	}

	private void actualizarTiempoEsperando() {
		tiempoMedioEsperando.setText(String.valueOf(this.control.calcularTiempoMedioEspera(this.control.getClientesEsperando())) + " segundos");
	}

	public void actualizarListas() {
		actualizarListaEsperando();
		actualizarListaAtendidos();
	}
	
	private void actualizarListaEsperando() {
		clientesEnEspera.setText("");
		
		for (Cliente cliente : this.control.getClientesEsperando()) {
			clientesEnEspera.setText(clientesEnEspera.getText() + cliente.toString() + " " + cliente.getCita().toString() + "\n");
		}
	}
	
	private void actualizarListaAtendidos() {
		clientesAtendidos.setText("");
		
		for (Cliente cliente : this.control.getClientesAtendidos()) {
			clientesAtendidos.setText(clientesAtendidos.getText() + cliente.toString() + " " + cliente.getCita().toString() + "\n");
		}
	}
	
}
