package br.com.java.poo;

public class Galinha {
	
	public static int ovosDaGranja; // por causa do static a variavel se tornou global
	
	public int ovos; //total de ovos do objeto Galinha
		public Galinha botar() {
			this.ovos++;
			Galinha.ovosDaGranja++;
			// como ovosDaGranja é uma variavel global so se é possivel chama-la pelo classe Galinha
			return this;
		}
	

}
