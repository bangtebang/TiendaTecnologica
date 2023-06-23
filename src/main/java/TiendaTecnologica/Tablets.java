package TiendaTecnologica;

public class Tablets extends ComponentesTecnologicos {
	private String resolucionPantalla;
	private Accesorio accesorio;

	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public Tablets() {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}