package br.com.java.diversos;

import java.util.Scanner;


public class SomaDoisNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numero_a;
		int numero_b;
		int soma;
		System.out.println("Digite o número A: ");
		numero_a = entrada.nextInt();
		System.out.println("Digite o número B: ");
		numero_b = entrada.nextInt();
		soma = numero_a + numero_b;
		System.out.println("A soma dos numeros A e B é: " + soma);

	}

}
