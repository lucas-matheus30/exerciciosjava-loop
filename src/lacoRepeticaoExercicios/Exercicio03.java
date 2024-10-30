package lacoRepeticaoExercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, menor = 0, maior = 0;

		while (true) {

			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();

			if (idade <= 0) { // se a idade for igual ou menor que 0 encerra o loop.
				break;
			}

			if (idade >= 50) {
				maior++; // incrementa o contador se for maior que 50 anos
			} else if (idade <= 21) {
				menor++; // incrementa o contador se for menor que 21 anos
			}

		}
		System.out.println("Total de pessoas menores de 21 anos: " + menor);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior);
		leia.close();
	}
}
