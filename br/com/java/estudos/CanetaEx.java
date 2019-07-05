package br.com.java.estudos;

public class CanetaEx {
	
	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	//metodo construtor
	
	public CanetaEx(String m, String c, float p) {
		this.modelo = m;
		this.cor = c;
		this.ponta = p;
		this.destampar();
	}

	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public float getPonta() {
		return ponta;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void rabiscar() {
		if (this.tampada = true) {
			System.out.println("Desculpe estou fechada e por isso nao posso escrever");
		} else {
			System.out.println("Estou escrevendo");
		}
	}
	
	public void status() {
		System.out.println("Sobre a Caneta: ");
		System.out.println("Modelo " + this.getModelo());
		System.out.println("Ponta " + this.getPonta());
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada : " + this.tampada);
	}
}
