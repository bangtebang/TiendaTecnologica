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

	public Tablet() {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}