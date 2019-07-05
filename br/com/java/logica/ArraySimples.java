package br.com.java.logica;
import java.util.Arrays;
public class ArraySimples{
	public static void main (String [] args){
		String[] paises = {"Brasil", "Russia", "India", "China"};
		System.out.println(paises[0]);
		System.out.println(paises.length);
		System.out.println(Arrays.toString(paises));
        
        //buscar em um array
		int posicao = Arrays.binarySearch(paises, "Russia");
		System.out.println(posicao);
		//ordenacao com apresentacao apos a ordenacao
		Arrays.sort(paises, 0, paises.length);
		//exibicao apos ordenacao
		System.out.println(Arrays.toString(paises));

		Double [] valores = {12.35, 3456.3456};
		System.out.println(valores[0].doubleValue());

	}
}