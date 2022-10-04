package poo;

public class MainAnimal {

	public static void main(String[] args) {
		Gato gatinho = new Gato("bichano", "Siames", 2.2f, 4, "Amarelo", "Domestico");
		
		Cachorro auau = new Cachorro("auau", "Vira-lata", 3.3f, 3, "Marrom", "Domestico");
		
		System.out.println(gatinho);
		System.out.println(auau);
		
		System.out.println("gato faz :" + gatinho.Mia());
		System.out.println("cachorro faz :" + auau.Late());
	}

}
