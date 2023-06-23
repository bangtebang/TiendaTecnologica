package TiendaTecnologica;

public class Accesorio {
	private String lapiz;
	private String funda;
	private String teclado;
	private Tablet tablet;

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

	public Accesorio(String lapiz,String funda,String teclado,Tablet tablet) {
		this.lapiz=lapiz;
		this.funda=funda;
		this.teclado=teclado;
		this.tablet=tablet;
	}
}