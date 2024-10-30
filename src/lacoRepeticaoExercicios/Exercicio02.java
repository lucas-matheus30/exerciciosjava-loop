package lacoRepeticaoExercicios;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		int numeros,par = 0,impar = 0;
		
		Scanner leia = new Scanner (System.in);
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número: ");
			numeros = leia.nextInt();
			if(numeros % 2 == 0) { //se o numero for par incrementa na variavel par.
				par++;
			}
			else { // se não for par incrementa na variavel impar.
				impar++;
			}
			
		}
		leia.close();
		System.out.println("Números pares: " + par);
		System.out.println("Números ímpares: " + impar);
	}

}
