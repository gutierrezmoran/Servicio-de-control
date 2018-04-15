package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionAtenderCliente implements ActionListener {

	private Bridge bridge;
	
	public ActionAtenderCliente(Bridge bridge) {
		super();
		this.bridge = bridge;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.bridge.atenderCliente();
		this.bridge.actualizarListas();
		this.bridge.actualizarTiemposDeEspera();
		this.bridge.actualizarClientes();
	}
	
}
