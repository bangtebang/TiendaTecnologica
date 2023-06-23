package TiendaTecnologica;

import java.util.ArrayList;
import TiendaTecnologica.Cliente;
import TiendaTecnologica.ComponentesTecnologicos;

public class TiendaTecnologica {
	private String direccion;
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<ComponentesTecnologicos> componentesTecnologicos = new ArrayList<ComponentesTecnologicos>();

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