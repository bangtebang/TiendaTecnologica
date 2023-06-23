package TiendaTecnologica;

public abstract class ComponenteTecnologico {
	private String marca;
	private int memoriaRam;
	private int memoriAlmacenamiento;
	private String procesador;
	private String modelo;
	private int anoFabricacion;
	private int precio;
	private int cantidadStock;
	private TiendaTecnologica tiendaTecnologica;

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getMemoriaRam() {
		return this.memoriaRam;
	}

	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public int getMemoriAlmacenamiento() {
		return this.memoriAlmacenamiento;
	}

	public void setMemoriAlmacenamiento(int memoriAlmacenamiento) {
		this.memoriAlmacenamiento = memoriAlmacenamiento;
	}

	public String getProcesador() {
		return this.procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacion() {
		return this.anoFabricacion;
	}

	public void setAnoFabricacion(int anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidadStock() {
		return this.cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public ComponenteTecnologico(String marca,int memoriAlmacenamiento,int memoriaRam,String procesador,String modelo,int anoFabricacion,int precio,int cantidadStock,TiendaTecnologica tiendaTecnologica) {
		this.marca=marca;
		this.memoriAlmacenamiento=memoriAlmacenamiento;
		this.memoriaRam=memoriaRam;
		this.procesador=procesador;
		this.modelo=modelo;
		this.anoFabricacion=anoFabricacion;
		this.precio=precio;
		this.cantidadStock=cantidadStock;
		this.tiendaTecnologica=tiendaTecnologica;
	}

	public abstract String getTipo();
}