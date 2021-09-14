package listaParticipantesEvento;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
/**
 * 
 * Unime - União Metropolitana de Educação e Cultura Curso: Bacharelado em
 * Sistemas de Informação Disciplina: Programação Orientada a Objetos II
 * Professor(a): Pablo Ricardo Roxo Silva 
 * Aluno(a): Jéssica Silva de Jesus
 *
 */
public class listarEvento {

	public static void main(String[] args) {

		/**
		 * (75%) 2 - Crie uma aplicação em Java que gerencie uma lista de participantes
		 * de um evento. O programa deve dispor do seguinte menu: 1 - Cadastrar
		 * participante 2 - Remover por posição 3 - Remover por nome 4 - Listar
		 * participantes 5 - Pesquisar participante 6 - Ordenar lista alfabeticamente 7
		 * - Limpar lista 8 - Encerrar
		 * 
		 * O usuário deve escolher a opção digitando o número no teclado e apertando
		 * enter. Caso o usuário escolha 1, então o programa deve solicitar o nome do
		 * participante e cadastrar na lista de participantes. Se o usuário escolher 4,
		 * então deve listar todos os participantes. Dica: para esta questão deverá ser
		 * usado ArrayList<String>. Apenas se o usuário escolher a opção 8 ele deve
		 * encerrar. Caso tenha digitado um número diferente das opções disponíveis,
		 * deve informar que a opção está incorreta.
		 */

		ArrayList<String> listarParticipantes = new ArrayList<>();

		Scanner opc = new Scanner(System.in);
		int opcao;
		opcao = 1;

		do {

			// Chama o método menu
			menu();

			System.out.print("Digite a opção desejada: ");
			opcao = opc.nextInt();

			switch (opcao) {

			case 1:
				String nome;
				Scanner user = new Scanner(System.in);
				System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
				System.out.println("|----#----# CADASTRO DE PARTICIPANTE #----#----|");
				System.out.print("Informe o nome do participante: ");
				nome = user.nextLine();
                
				if (nome != null) {
					listarParticipantes.add(nome);
					System.out.println("Participante cadastrado com sucesso!!");
				} else {
					System.err.println("Este nome está inválido, por favor tente novamente novamente! ");
					System.out.print("|----#----#----#----#----#----#----#----#----#----#----|");
				}

				break;

			case 2:
				int posicao;
				Scanner pos = new Scanner(System.in);

				System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
				System.out.println("|----#----# REMOVER PARTICIPANTE POR POSIÇÃO #----#----|");

				System.out.println("informe a posição do participante: ");
				posicao = pos.nextInt();

				// Validação

				listarParticipantes.remove(posicao);
				System.out.println("Participante removido com sucesso ");
				System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");

				break;

			case 3:

				String nomeParticipante;
				Scanner posi = new Scanner(System.in);

				System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
				System.out.println("|----#----# REMOVER PARTICIPANTE POR NOME #----#----|");

				System.out.println("informe o nome do participante: ");
				nomeParticipante = posi.nextLine();

				// verifica se existe nome na lista
				if (listarParticipantes.contains(nomeParticipante)) {
					listarParticipantes.remove(nomeParticipante);
					System.out.println("Participante removido com sucesso ");
				} else {
					System.err.println("O nome está invalido!");

				}

				System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");

				break;

			case 4:
				
				System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
				System.out.println("|----#----# LISTAR DE PARTICIPANTES #----#----|");

				for (int i = 0; i < listarParticipantes.size(); i++) {
					System.out.println(listarParticipantes.get(i));
				}
				
				System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");

				break;

			case 5:
				
				String BuscarParticipante;
				System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
				System.out.println("|----#----# PESQUISAR PARTICIPANTE #----#----|");
				
				Scanner pesquisarParticipante = new Scanner(System.in);
				
				System.out.println("Informe nome do participante: ");
				BuscarParticipante = pesquisarParticipante.nextLine();
				
				
				if (!listarParticipantes.contains(BuscarParticipante)) {

					System.err.println("Esse participante não está registrado no evento ");
				} else {
					System.out.println("Esse participante está registrado no evento!");

				}

				
				
				
				System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
				
				break;
			case 6:

				Collections.sort(listarParticipantes);
				System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
				System.out.println("Listar foi ordenada com sucesso!");
				System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");

				break;

			case 7:

				Scanner limpar = new Scanner(System.in);
				String resposta;

				System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
				System.out.println("|----#----# LIMPAR LISTAR #----#----|");

				System.out.print("Você realmente deseja limpar todos os participantes (s/n)? ");
				resposta = limpar.nextLine();

				// validação
				switch (resposta) {
				case "s":
					listarParticipantes.clear();
					System.out.println("Listar do evento está vazia!");
					System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");

					break;
				case "n":
					System.out.println("Todos participantes permanecem inscritos!");
					System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
					break;
				default:
					System.err.println("Essa opção é invalida, tente novamente! use s para sim e n para não.");
					System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
					break;
				}

				break;
			case 8:
				System.out.println("Obrigado(a) por utilizar o nosso sistema! Atenciosamente Games Developer ");
				System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
				break;
			default:
				System.err.println("Essa opção é invalida, tente novamente!");
				System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
				break;
			}

		} while (opcao != 8);

	}

	public static void menu() {

		System.out.println("|----#----#----#----#----#----#----#----#----#----#----|"
				+ "\n|----# Sejam bem vindos ao evento Games Developer #----|"
				+ "\n|----#           Menu de inscrições               #----|"
				+ "\n|----#         1 - Cadastrar participante         #----|"
				+ "\n|----#         2 - Remover por posição            #----|"
				+ "\n|----#         3 - Remover por nome               #----|"
				+ "\n|----#         4 - Listar participantes           #----|"
				+ "\n|----#         5 - Pesquisar participante         #----|"
				+ "\n|----#         6 - Ordenar lista alfabeticamente  #----|"
				+ "\n|----#         7 - Limpar lista                   #----|"
				+ "\n|----#         8 - Encerrar                       #----|"
				+ "\n|----#----#----#----#----#----#----#----#----#----#----|");
	}

}
