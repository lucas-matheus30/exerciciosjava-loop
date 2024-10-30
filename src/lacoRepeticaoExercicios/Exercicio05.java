package lacoRepeticaoExercicios;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {

		int numero, soma = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um número inteiro: (Zero encerra o programa)");
			numero = leia.nextInt();

			if (numero > 0) { // se o numero for positivo vai somar
				soma = numero + soma;
			}

		} while (numero != 0); // roda o loop enquanto o numero for difente de zero

		System.out.println("A soma dos números positivos digitados é: " + soma);
		leia.close();
	}
}
