package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionAgregarCliente implements ActionListener {

	Bridge bridge;

	public ActionAgregarCliente(Bridge bridge) {
		super();
		this.bridge = bridge;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.bridge.agregarCliente();
		this.bridge.actualizarListas();
		this.bridge.actualizarTiemposDeEspera();
		this.bridge.actualizarClientes();
	}
	
}
