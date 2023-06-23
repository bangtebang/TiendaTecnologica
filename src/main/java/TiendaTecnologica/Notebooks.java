package TiendaTecnologica;

public class Notebooks extends ComponentesTecnologicos {
	private String resolucionPantallaIntegrada;
	private String tipoTecglado;
	private int bateria;

	public String getResolucionPantallaIntegrada() {
		return this.resolucionPantallaIntegrada;
	}

	public void setResolucionPantallaIntegrada(String resolucionPantallaIntegrada) {
		this.resolucionPantallaIntegrada = resolucionPantallaIntegrada;
	}

	public String getTipoTecglado() {
		return this.tipoTecglado;
	}

	public void setTipoTecglado(String tipoTecglado) {
		this.tipoTecglado = tipoTecglado;
	}

	public int getBateria() {
		return this.bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public Notebooks() {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}