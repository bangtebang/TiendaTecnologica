package TiendaTecnologica;

public class Accesorio {
	private String lapiz;
	private String funda;
	private String teclado;
	private Tablets tablet;

	public String getLapiz() {
		return this.lapiz;
	}

	public void setLapiz(String lapiz) {
		this.lapiz = lapiz;
	}

	public String getFunda() {
		return this.funda;
	}

	public void setFunda(String funda) {
		this.funda = funda;
	}

	public String getTeclado() {
		return this.teclado;
	}

	public void setTeclado(String teclado) {
		this.teclado = teclado;
	}

	public Accesorio() {
		throw new UnsupportedOperationException();
	}
}