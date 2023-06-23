package TiendaTecnologica;

public class Tablet extends ComponenteTecnologico {
	private String resolucionPantalla;
	private Accesorio accesorio;

	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public Tablet(String marca,int memoriAlmacenamiento,int memoriaRam,String procesador,String modelo,int anoFabricacion,int precio,int cantidadStock,TiendaTecnologica tiendaTecnologica,String resolucionPantalla,Accesorio accesorio) {
		super(marca,memoriAlmacenamiento,memoriaRam,procesador,modelo,anoFabricacion,precio,cantidadStock,tiendaTecnologica);
		this.resolucionPantalla=resolucionPantalla;
		this.accesorio=accesorio;
	}

	public String getTipo() {
		return "Tablet";
	}
}