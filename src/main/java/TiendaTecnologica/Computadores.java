package TiendaTecnologica;

public class Computadores extends ComponentesTecnologicos {
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

	public String getFuntePoder() {
		return this.funtePoder;
	}

	public void setFuntePoder(String funtePoder) {
		this.funtePoder = funtePoder;
	}

	public String getChasis() {
		return this.chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public Computadores() {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}