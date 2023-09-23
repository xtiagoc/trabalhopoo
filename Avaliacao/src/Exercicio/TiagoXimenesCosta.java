package Exercicio;

import java.util.Scanner;
import java.util.Arrays;

public class TiagoXimenesCosta {

	public static void main (String args[]){
		TiagoXimenesCosta tiagoXimenescosta = new TiagoXimenesCosta(); 
		tiagoXimenescosta.metodo1();
		tiagoXimenescosta.metodo2();
		tiagoXimenescosta.metodo3();
		
	}

	private void metodo3() {
		Scanner s = new Scanner(System.in);
	    String[] array = new String[10];

	    System.out.println("Digite os 10 nomes dos alunos: ");

	    for (int i = 0; i < array.length; i++) {
	        array[i] = s.nextLine();
	        
	    }
	    
	    Arrays.sort(array);
	    System.out.println(Arrays.toString(array));
	}
		
	

	private void metodo2() {
		System.out.println("\nDigite o Valor em Dinheiro: ");
		Scanner sc = new Scanner(System.in);

		double valor = sc.nextDouble();
		int valorInteiro = (int) valor;

		int dez = valorInteiro / 10;

		int cinco = (valorInteiro % 10) / 5;
		
		int dois = ((valorInteiro % 10) % 5) / 2;

		int um = (((valorInteiro % 10) % 5) % 2) / 1;


		System.out.println(dez + " Nota(s) de 10\n" +
		                   cinco + " Nota(s) de 5\n" +
		                   dois + " Nota(s) de 2\n" +
		                   um + " Nota(s) de 1\n");
		
	}

	private void metodo1() {
		int i = 1, n = 10, primeironumero = 1, segundonumero = 1;
	    
	    System.out.println("A sequencia de Finobacci e");

	    while (i <= n) {
	      System.out.print(primeironumero + " ");

	      int proximonumero = primeironumero + segundonumero;
	      primeironumero = segundonumero;
	      segundonumero = proximonumero;

	      i++;
	    }
	      
	
	}
}
