package TiendaTecnologica;

public class Notebook extends ComponenteTecnologico {
	private String resolucionPantallaIntegrada;
	private String tipoTeclado;
	private int bateria;

	public String getResolucionPantallaIntegrada() {
		return this.resolucionPantallaIntegrada;
	}

	public void setResolucionPantallaIntegrada(String resolucionPantallaIntegrada) {
		this.resolucionPantallaIntegrada = resolucionPantallaIntegrada;
	}

	public String getTipoTeclado() {
		return this.tipoTeclado;
	}

	public void setTipoTeclado(String tipoTecglado) {
		this.tipoTeclado = tipoTecglado;
	}

	public int getBateria() {
		return this.bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public Notebook(String marca,int memoriAlmacenamiento,int memoriaRam,String procesador,String modelo,int anoFabricacion,int precio,int cantidadStock,TiendaTecnologica tiendaTecnologica,String resolucionPantallaIntegrada,int bateria,String tipoTeclado) {
		super(marca,memoriAlmacenamiento,memoriaRam,procesador,modelo,anoFabricacion,precio,cantidadStock,tiendaTecnologica);
		this.bateria=bateria;
		this.tipoTeclado=tipoTeclado;
		this.resolucionPantallaIntegrada=resolucionPantallaIntegrada;
	}

	public String getTipo() {
		return "Notebook";
	}
}