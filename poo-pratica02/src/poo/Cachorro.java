package poo;

public class Cachorro extends Animal{
	public Cachorro(){
		
	}
	
	public Cachorro(String nome, String raca, float comprimento, int patas, String cor, String ecossistema) {
		this.setNome(nome);
		this.setRaca(raca);
		this.setComprimento(comprimento);
		this.setPatas(patas);
		this.setCor(cor);
		this.setEcossistema(ecossistema);
	}
	
	public String Late() {
		return "auauauuauauauau";
	}
	
	@Override
	public String toString() {
		return this.getNome() + " " + this.getRaca() + " " + this.getComprimento() + " " + this.getPatas() + " " + this.getCor() + " " + this.getEcossistema();
	}
}
