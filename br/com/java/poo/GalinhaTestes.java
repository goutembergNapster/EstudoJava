package br.com.java.poo;

public class GalinhaTestes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Galinha g1 = new Galinha();
		Galinha g2 = new Galinha();
		g1.botar().botar().botar();
		g2.botar().botar();
		
		System.out.println(g1.ovos);
		System.out.println(g2.ovos);
		System.out.println(Galinha.ovosDaGranja);
	}
	

}
