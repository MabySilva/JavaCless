package GenerationExer;

public class Aviao {
	
	private String marca;
	private String modelo;
	private int qtdAssento;
	private int velocidade;

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getQtdAssento() {
		return qtdAssento;
	}
	
	public void setQtdAssento(int qtdAssento) {
		this.qtdAssento = qtdAssento;
	}
	
	public int acelerar(int v) {
		return velocidade += v;
	}
	
	public int frear(int v) {
		return velocidade -= v;
	}

}