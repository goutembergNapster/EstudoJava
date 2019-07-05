package br.com.java.curso_em_video;

public class Professor extends Pessoa {

	private float salario;
	private String especialidade;


public void receberAumento(float aum) {
	this.salario += aum;
	
	}
public String getEspecialidade() {
	return especialidade;
}
public float getSalario() {
	return salario;
}
public void setSalario(float salario) {
	this.salario = salario;
}
public void setEspecialidade(String especialidade) {
	this.especialidade = especialidade;
}



}
