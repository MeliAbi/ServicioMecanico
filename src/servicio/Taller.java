package servicio;

import java.util.ArrayList;
import java.util.List;

class Taller {
    private List<Cliente> clientesEnEspera;
    private List<Cliente> clientesAtendidos;

    public Taller() {
        clientesEnEspera = new ArrayList<>();
        clientesAtendidos = new ArrayList<>();
    }

    public void nuevoCliente(String nombre, Integer numeroMovil) {
        Cliente cliente = new Cliente(nombre, numeroMovil);
        clientesEnEspera.add(cliente);
    }

    public Cliente atenderCliente() throws Exception {
        if (clientesEnEspera.isEmpty()) {
            throw new Exception("No hay clientes en espera");
        }
        Cliente cliente = clientesEnEspera.remove(0);
        cliente.serAtendido();
        clientesAtendidos.add(cliente);
        return cliente;
    }

    public double tiempoEsperaNoAtendidos() {
        if (clientesEnEspera.isEmpty()) {
            return 0.0;
        }

        long totalTiempoEspera = 0;
        for (Cliente cliente : clientesEnEspera) {
            totalTiempoEspera += cliente.getTiempoEspera();
        }

        return (double) totalTiempoEspera / clientesEnEspera.size();
    }

    public double tiempoEsperaAtendidos() {
        if (clientesAtendidos.isEmpty()) {
            return 0.0;
        }

        long totalTiempoEspera = 0;
        for (Cliente cliente : clientesAtendidos) {
            totalTiempoEspera += cliente.getTiempoEspera();
        }

        return (double) totalTiempoEspera / clientesAtendidos.size();
    }

    public int obtenerCantidadClientesEnEspera() {
        return clientesEnEspera.size();
    }

    public int obtenerCantidadClientesAtendidos() {
        return clientesAtendidos.size();
    }

	public List<Cliente> getClientesEnEspera() {
		return clientesEnEspera;
	}

	public List<Cliente> getClientesAtendidos() {
		return clientesAtendidos;
	}

    
    
}