package calcularNotas;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * Unime - Uni�o Metropolitana de Educa��o e Cultura Curso: Bacharelado em
 * Sistemas de Informa��o Disciplina: Programa��o Orientada a Objetos II
 * Professor(a): Pablo Ricardo Roxo Silva 
 * Aluno(a): J�ssica Silva de Jesus
 *
 */

public class calcularNotas {

	public static void main(String[] args) {

		/**
		 * (25%) 1 - Crie uma aplica��o em Java para controlar as notas de um aluno. O
		 * aluno possuir� tr�s notas de provas. O sistema deve obt�-las, calcular a
		 * m�dia aritm�tica, e exibir na tela. Ap�s exibir a m�dia, deve informar o
		 * status do aluno. Se a nota foi a partir de 7,0, ent�o ele est� aprovado. Se a
		 * nota foi pelo menos 4,0, ent�o ele tem direito a uma recupera��o. Sen�o, ele
		 * est� automaticamente reprovado.
		 * 
		 **/

		// Armazenar os valores da variavel
		double nota1;
		double nota2;
		double nota3;
		double media;

		Scanner n1 = new Scanner(System.in);
		Scanner n2 = new Scanner(System.in);
		Scanner n3 = new Scanner(System.in);

		DecimalFormat deci = new DecimalFormat("0.00");

		System.out.println("----- Calcular m�dia ----");

		System.out.print("--- Digite a 1� nota: ");
		nota1 = n1.nextDouble();

		System.out.print("--- Digite a 2� nota: ");
		nota2 = n2.nextDouble();

		System.out.print("--- Digite a 3� nota: ");
		nota3 = n3.nextDouble();

		media = ((nota1 + nota2 + nota3) / 3);

		System.out.println("\n--- A sua m�dia foi de = " + deci.format(media));

		if (media >= 7.0) {

			System.out.println("\n--- Parab�ns!! voc� foi aprovado! ---");

		} else if (media >= 4.0 && media < 7.0) {

			System.out.println("\n--- Voc� tem direito a fazer a prova de recupera��o! ---");

		} else {

			System.out.println("\n--- Que pena!Infezlimente voc� foi reprovado! ---");
		}

	}

}
