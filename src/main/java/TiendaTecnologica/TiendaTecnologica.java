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

	public TiendaTecnologica(String direccion) {
		this.direccion=direccion;
		this.clientes=new ArrayList<Cliente>();
		this.componentesTecnologicos=new ArrayList<ComponenteTecnologico>();
	}
	public void agregarCliente(Cliente cliente) {
		if(!clienteExiste(cliente)) {
			this.clientes.add(cliente);
		}
	}
	public boolean clienteExiste(Cliente cliente) {
		for(Cliente c : this.clientes) {
			if(c.getNombre().equals(cliente.getNombre()) &&
					c.getApellido().equals(cliente.getApellido())) {

				return true;
			}
		}

		return false;
	}

	public void agregarComponenteTecnogico(ComponenteTecnologico componenteTecnologico) {
		if(!componenteTecnologicoExiste(componenteTecnologico)) {
			if(componenteTecnologico.getTipo().equals("Notebook")){
			this.componentesTecnologicos.add((Notebook) componenteTecnologico);
			}
			if(componenteTecnologico.getTipo().equals("Computador")){
				this.componentesTecnologicos.add((Computador) componenteTecnologico);
			}
			if(componenteTecnologico.getTipo().equals("Tablet")){
				this.componentesTecnologicos.add((Tablet) componenteTecnologico);
			}

		}
	}
	public boolean componenteTecnologicoExiste(ComponenteTecnologico componenteTecnologico) {
		for(ComponenteTecnologico c : componentesTecnologicos) {
			if(c.getMemoriaRam()==(componenteTecnologico.getMemoriaRam()) &&
					c.getMarca().equals(componenteTecnologico.getMarca())) {

				return true;
			}
		}

		return false;
	}
	public ArrayList<ComponenteTecnologico> obtenerInformacionComponentes() {
		return ComponentesTecnologicos;
	}





}
