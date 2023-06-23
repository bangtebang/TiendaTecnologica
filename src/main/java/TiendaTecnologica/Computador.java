package TiendaTecnologica;

public class Computador extends ComponenteTecnologico {
	private String tarjetaVideo;
	private String funtePoder;
	private String chasis;
	private Pantalla pantalla;

	public String getTarjetaVideo() {
		return this.tarjetaVideo;
	}

	public void setTarjetaVideo(String tarjetaVideo) {
		this.tarjetaVideo = tarjetaVideo;
	}

	public String getChasis() {
		return this.chasis;
	}

	public String getFuntePoder() {
		return this.funtePoder;
	}

	public void setFuntePoder(String funtePoder) {
		this.funtePoder = funtePoder;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public Computador(String marca,int memoriAlmacenamiento,int memoriaRam,String procesador,String modelo,int anoFabricacion,int precio,int cantidadStock,TiendaTecnologica tiendaTecnologica,String chasis,String funtePoder,String tarjetaVideo,Pantalla pantalla) {
		super(marca,memoriAlmacenamiento,memoriaRam,procesador,modelo,anoFabricacion,precio,cantidadStock,tiendaTecnologica);
		this.chasis=chasis;
		this.funtePoder=funtePoder;
		this.tarjetaVideo=tarjetaVideo;
		this.pantalla=pantalla;

	}

	public String getTipo() {
		return "Computador";
	}
}