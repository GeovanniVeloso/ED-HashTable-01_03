package model;

public class Barra {

	public int altura;
	public int largura;
	public int comprimento;
	public String barraNome;
	
	public Barra(int altura, int largura, int comprimento, String barraNome) {
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
		this.barraNome = barraNome;
	}

	public int getAltura() {
		return altura;
	}

	public int getLargura() {
		return largura;
	}

	public int getComprimento() {
		return comprimento;
	}

	public String getBarraNome() {
		return barraNome;
	}
	
}
