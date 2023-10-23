package servicio;

public class Atencion {

	private Long momentoLlegada=null;
	private Cliente cliente=null;
	private Long momentoAtencion=null;

	public Atencion(Cliente cliente, Long momentoLlegada) {
		this.cliente=cliente;
		this.momentoLlegada=momentoLlegada;
	}

	public Long getMomentoLlegada() {
		return momentoLlegada;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Long getMomentoAtencion() {
		return momentoAtencion;
	}

	public void setMomentoAtencion(Long momentoAtencion) {
		this.momentoAtencion = momentoAtencion;
	}
	
	

}
