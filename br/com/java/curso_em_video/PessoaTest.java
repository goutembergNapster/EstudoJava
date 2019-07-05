package br.com.java.curso_em_video;

public class PessoaTest {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Pessoa p5 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Andre");
		p2.setNome("Maria");
		p3.setNome("Claudio");
		p4.setNome("Fabiana");
		p5.setNome("Kerolynne");
		p5.setIdade(25);
		
		p1.setSexo("M");
		p4.setSexo("F");
		p5.setSexo("F");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		System.out.println(p5.toString());
		

	}

}
