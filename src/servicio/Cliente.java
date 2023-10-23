package servicio;

class Cliente {
    private String nombre="";
    private Integer numeroMovil=0;
    private long llegada;
    private long atencion;

    public Cliente(String nombre, Integer numeroMovil) {
        this.nombre = nombre;
        this.numeroMovil = numeroMovil;
        this.llegada = Reloj.ahora();
    }

    public void serAtendido() {
        this.atencion = Reloj.ahora();
    }

    public long getTiempoEspera() {
        return (atencion - llegada) / (1000 * 60); // Tiempo en minutos
        /* 60000 milisegundos => 1 min
         * resul milisegundos => x min
         * 
         * 1000 milisegundos => 1 seg
         * 
        */
    }

	public String getNombre() {
		return nombre;
	}

	public Integer getNumeroMovil() {
		return numeroMovil;
	}

	public long getLlegada() {
		return llegada;
	}

	public long getAtencion() {
		return atencion;
	}
    
    
}
