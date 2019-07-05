package br.com.java.poo;

public class Conta {
	
	String cliente;
	double saldo;
	
	void exibeSaldo() {
		System.out.println(cliente + " seu saldo é " + saldo);
	}
	
	 void saca(double valor) {
		saldo -= valor;
		
		//System.out.print("Voce sacou: ", valor);
	}
	void depositar(double valor) {
		saldo += valor;
	}
	void transferePara(Conta destino, double valor) {
		this.saca(valor);
		destino.depositar(valor);
	}

}
