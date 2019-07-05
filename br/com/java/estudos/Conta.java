package br.com.java.estudos;

public class Conta {
	
	public int numeroTitular;
	public String nomeTitular;
	public double saldoConta;
	public double limiteConta;

	public void sacar(double valor) {
		
		if (saldoConta <= 0) {
			System.out.println("Saldo Indisponivel");
			
		} else if(saldoConta < valor){
			
			System.out.println("Saldo Insuficiente");
			
		}else{
			
			System.out.println("Saque Realizado");
			
		}
		
	}
  
	public void depositar(double valor) {
		saldoConta += valor;
		
	}
	
	public double getSaldo() {
		
      return saldoConta;
		
	}
	public int getNumeroTitular() {
		return numeroTitular;
	}
	public void setNumeroTitular(int numero) {
	    numeroTitular = numero;	
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nome) {
	   nomeTitular = nome;
	}
	public double getSaldoConta() {
		
		return saldoConta;
	}
	public void setSaldoConta(double saldo) {
		saldoConta = saldo;
	}
	public double getLimiteConta() {
		return limiteConta;
	}
	public void setLimiteConta(double limite) {
	    limiteConta = limite;
	}
}
