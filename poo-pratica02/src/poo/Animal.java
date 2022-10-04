package poo;

public abstract class Animal {
	private String nome;
	private String raca;
	private float comprimento;
	private int patas;
	private String cor;
	private String ecossistema;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public float getComprimento() {
		return comprimento;
	}
	
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	
	public int getPatas() {
		return patas;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getEcossistema() {
		return ecossistema;
	}
	
	public void setEcossistema(String ecossistema) {
		this.ecossistema = ecossistema;
	}
	
	public String Caminha() {
		return null;
	}
	
	
}
