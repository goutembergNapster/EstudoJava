package br.com.java.estudos;

public class ContaTest {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.setNomeTitular("Goutemberg");
		c1.setNumeroTitular(4567);
		c1.setLimiteConta(400);
		c1.depositar(500);
		c1.sacar(600);

	}

}
