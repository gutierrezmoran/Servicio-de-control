package modelo;

public class Cliente {
	private String nombre;
	private int movil;
	private Cita cita;

	public Cliente(String nombre, int movil) {
		super();
		this.nombre = nombre;
		this.movil = movil;
		this.cita = new Cita();
	}

	public Cita getCita() {
		return cita;
	}

	public String getNombre() {
		return nombre;
	}

	public void atender() {
		cita.atender();
	}

	public int getMovil() {
		return movil;
	}
	
	@Override
	public String toString() {
		return this.nombre + " | " + this.movil + " | ";
	}
	
}
