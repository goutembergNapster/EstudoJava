package br.com.java.curso_em_video;

public class LutadorTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lutador l[] = new Lutador[7];
		
				l[0] = new Lutador ("Goutemberg", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
				l[1] = new Lutador ("Eduardo" , "Alemanha" , 29, 1.89f, 78.9f, 13, 4, 11);
				l[2] = new Lutador ("Max" , "Dinamarca", 32, 1.68f, 70.1f, 12, 2, 12);
				l[3] = new Lutador ("Elias", "Irlanda", 28, 1.90f, 81.0f, 14, 10, 15);
				l[4] = new Lutador ("Bruno", "EUA", 32, 1.81f, 79.8f, 12, 19,17);
				l[5] = new Lutador ("Rafael", "Hungria", 24, 1.78f, 81.1f, 10, 10, 11);
				l[6] = new Lutador ("Alex", "Belgica", 27, 1.90f, 67.5f, 10, 9, 8);
				
		Luta UFC = new Luta();
		UFC.marcarLuta(l[5    ], l[5]);
		UFC.lutar();
	}

}
