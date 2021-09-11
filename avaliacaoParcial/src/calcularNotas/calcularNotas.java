package calcularNotas;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * Unime - União Metropolitana de Educação e Cultura Curso: Bacharelado em
 * Sistemas de Informação Disciplina: Programação Orientada a Objetos II
 * Professor(a): Pablo Ricardo Roxo Silva 
 * Aluno(a): Jéssica Silva de Jesus
 *
 */

public class calcularNotas {

	public static void main(String[] args) {

		/**
		 * (25%) 1 - Crie uma aplicação em Java para controlar as notas de um aluno. O
		 * aluno possuirá três notas de provas. O sistema deve obtê-las, calcular a
		 * média aritmética, e exibir na tela. Após exibir a média, deve informar o
		 * status do aluno. Se a nota foi a partir de 7,0, então ele está aprovado. Se a
		 * nota foi pelo menos 4,0, então ele tem direito a uma recuperação. Senão, ele
		 * está automaticamente reprovado.
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

		System.out.println("----- Calcular média ----");

		System.out.print("--- Digite a 1º nota: ");
		nota1 = n1.nextDouble();

		System.out.print("--- Digite a 2º nota: ");
		nota2 = n2.nextDouble();

		System.out.print("--- Digite a 3º nota: ");
		nota3 = n3.nextDouble();

		media = ((nota1 + nota2 + nota3) / 3);

		System.out.println("\n--- A sua média foi de = " + deci.format(media));

		if (media >= 7.0) {

			System.out.println("\n--- Parabéns!! você foi aprovado! ---");

		} else if (media >= 4.0 && media < 7.0) {

			System.out.println("\n--- Você tem direito a fazer a prova de recuperação! ---");

		} else {

			System.out.println("\n--- Que pena!Infezlimente você foi reprovado! ---");
		}

	}

}
