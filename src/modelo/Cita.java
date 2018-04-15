package modelo;

import java.time.Duration;
import java.time.LocalTime;

public class Cita {

	private LocalTime horaDeLlegada;
	private LocalTime horaDeAtencion;
	
	public Cita() {
		this.horaDeLlegada = LocalTime.now();
	}
	
	public void atender() {
		this.horaDeAtencion = LocalTime.now();
	}
	
	public long obtenerTiempoDeEspera() {
		if(this.horaDeAtencion != null) {
			return Duration.between(horaDeLlegada, horaDeAtencion).getSeconds();
		} else {
			return Duration.between(horaDeLlegada, LocalTime.now()).getSeconds();
		}
	}
	
	@Override
	public String toString() {
		if(this.horaDeAtencion == null) {
			return this.horaDeLlegada.toString();
		} else {
			return this.horaDeAtencion.toString();
		}
	}

}
