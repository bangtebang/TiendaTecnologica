package TiendaTecnologica;

public class Cliente {
	private String nombre;
	private String correoElectronico;
	private String apellido;
	private int numeroContacto;
	private String estadoCivil;
	private String ciudad;
	private TiendaTecnologica tiendaTecnologica;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumeroContacto() {
		return this.numeroContacto;
	}

	public void setNumeroContacto(int numeroContacto) {
		this.numeroContacto = numeroContacto;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Cliente(String nombre,String estadoCivil,String correoElectronico,String ciudad,int numeroContacto,String apellido,TiendaTecnologica tiendaTecnologica) {
		this.apellido=apellido;
		this.nombre=nombre;
		this.estadoCivil=estadoCivil;
		this.ciudad=ciudad;
		this.numeroContacto=numeroContacto;
		this.tiendaTecnologica=tiendaTecnologica;
		this.correoElectronico=correoElectronico;
	}

}
