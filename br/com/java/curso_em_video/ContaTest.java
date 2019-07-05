package br.com.java.curso_em_video;

public class ContaTest {

	public static void main(String[] args) {
		
		Conta p1 = new Conta();
		p1.setNumConta(1111);
		p1.setDono("Goutemberg");
		p1.abrirConta("CC");
		
		//p1.depositar(300);
		p1.sacar(300);
		p1.estadoAtual();

	}

}
