package br.com.java.logica;
import java.util.Random;

public class ArraySimples2 {
	
	public static void main (String[] args) {
    
    /** String[][] duas = {
    {"Ricardo", "M", "DF"} , {"Sandra", "F", "MG"}};
    System.out.println(duas[0].length);
    */
    String[] faces = {"A","2","3","4","5","6","7","8","9","10","Valete","Dama","Reis"};
    String[] nipes = {"Espadas","Paus","Copas","Ouro"};

    Random r = new Random();
    int indiceFace = r.nextInt(faces.length);
    String face = faces[indiceFace];

    Random n = new Random();
    int indiceNipes = n.nextInt(nipes.length);
    String nipe = nipes[indiceNipes];

    String carta = face + " " + nipe;
    System.out.println(carta);
}
}