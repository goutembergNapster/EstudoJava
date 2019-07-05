package br.com.java.estudos;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status() {
		System.out.println("===================================");
		System.out.println("Modelo " + this.modelo);
		System.out.println("Uma Caneta " + this.cor);
		System.out.println("Ponta " + this.ponta);
		System.out.println("Carga " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
		System.out.println("===================================");
	}
	
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("Nao copia, Caneta tampada");
		} else {
			System.out.println("Estou Rabiscando");
		}
		
	}
	protected void tampar() {
		this.tampada = true;
	}
	protected void destampar() {
		this.tampada = false;
	}

}
