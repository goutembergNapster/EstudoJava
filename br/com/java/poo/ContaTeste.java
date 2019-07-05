package br.com.java.poo;

public class ContaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta();
		conta.cliente = "Goutemberg Pessoa da Silva";
		conta.saldo = 10_000.00;
		conta.exibeSaldo();
		
		
		Conta destino = new Conta();
		destino.cliente = "Eduardo";
		destino.saldo = 8_000.00;
		destino.exibeSaldo();
		
		
		conta.transferePara(destino, 1500.00);
		
		destino.exibeSaldo();
		conta.exibeSaldo();

	}

}
