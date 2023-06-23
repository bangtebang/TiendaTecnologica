package TiendaTecnologica;

import java.util.ArrayList;
import TiendaTecnologica.Cliente;
import TiendaTecnologica.ComponenteTecnologico;

public class TiendaTecnologica {
	private String direccion;
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<ComponenteTecnologico> componentesTecnologicos = new ArrayList<ComponenteTecnologico>();

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public TiendaTecnologica() {
		throw new UnsupportedOperationException();
	}
}