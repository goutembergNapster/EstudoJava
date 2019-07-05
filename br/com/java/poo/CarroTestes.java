package br.com.java.poo;

public class CarroTestes {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrari Enzo";
		ferrari.segundoZeroAcem = 3.4;
		ferrari.velocidadeMaxima = 349;
		
		Carro lamborguini = new Carro("lamborguini", 349,3.6);
		
		System.out.println();
		

	}

}
