package br.com.java.estudos;

public class CanetaExTest {

	public static void main(String[] args) {
		CanetaEx c1 = new CanetaEx("Bic", "Amarela", 0.5f);
		c1.status();
		c1.rabiscar();
		
		System.out.println("====================================");
		
		CanetaEx c2 = new CanetaEx("Compacta", "Azul", 0.7f);
		c2.status();
		c2.tampar();
		c2.rabiscar();
		

	}

}
