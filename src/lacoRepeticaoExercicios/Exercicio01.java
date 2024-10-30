package lacoRepeticaoExercicios;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero1, numero2;
		
		System.out.println("A seguir você digitará um intervalo dois números o primeiro número deverá ser menor que o segundo: ");
		
		System.out.println("Digite o primeiro número inteiro");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo número inteiro ");
		numero2 = leia.nextInt();
		
		if(numero1 < numero2) { // compara se o numero 1 é menor que o numero 2
			for (int i = numero1; i <= numero2; i++) { // percorre o intervalo entre o numero1 e numero2
				if(i % 3 == 0 && i % 5 == 0) { // verifica se é divido por 3 e 5.
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		} else {
			System.out.println("Intervaldo inválido!");
		}
		leia.close();
	}
	

}