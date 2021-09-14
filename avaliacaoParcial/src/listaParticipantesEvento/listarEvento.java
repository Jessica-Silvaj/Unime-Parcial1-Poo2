package listaParticipantesEvento;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
/**
 * 
 * Unime - Uni�o Metropolitana de Educa��o e Cultura Curso: Bacharelado em
 * Sistemas de Informa��o Disciplina: Programa��o Orientada a Objetos II
 * Professor(a): Pablo Ricardo Roxo Silva 
 * Aluno(a): J�ssica Silva de Jesus
 *
 */
public class listarEvento {

	public static void main(String[] args) {

		/**
		 * (75%) 2 - Crie uma aplica��o em Java que gerencie uma lista de participantes
		 * de um evento. O programa deve dispor do seguinte menu: 1 - Cadastrar
		 * participante 2 - Remover por posi��o 3 - Remover por nome 4 - Listar
		 * participantes 5 - Pesquisar participante 6 - Ordenar lista alfabeticamente 7
		 * - Limpar lista 8 - Encerrar
		 * 
		 * O usu�rio deve escolher a op��o digitando o n�mero no teclado e apertando
		 * enter. Caso o usu�rio escolha 1, ent�o o programa deve solicitar o nome do
		 * participante e cadastrar na lista de participantes. Se o usu�rio escolher 4,
		 * ent�o deve listar todos os participantes. Dica: para esta quest�o dever� ser
		 * usado ArrayList<String>. Apenas se o usu�rio escolher a op��o 8 ele deve
		 * encerrar. Caso tenha digitado um n�mero diferente das op��es dispon�veis,
		 * deve informar que a op��o est� incorreta.
		 */

		ArrayList<String> listarParticipantes = new ArrayList<>();

		Scanner opc = new Scanner(System.in);
		int opcao;
		opcao = 1;

		do {

			// Chama o m�todo menu
			menu();

			System.out.print("Digite a op��o desejada: ");
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
					System.err.println("Este nome est� inv�lido, por favor tente novamente novamente! ");
					System.out.print("|----#----#----#----#----#----#----#----#----#----#----|");
				}

				break;

			case 2:
				int posicao;
				Scanner pos = new Scanner(System.in);

				System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
				System.out.println("|----#----# REMOVER PARTICIPANTE POR POSI��O #----#----|");

				System.out.println("informe a posi��o do participante: ");
				posicao = pos.nextInt();

				// Valida��o

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
					System.err.println("O nome est� invalido!");

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

					System.err.println("Esse participante n�o est� registrado no evento ");
				} else {
					System.out.println("Esse participante est� registrado no evento!");

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

				System.out.print("Voc� realmente deseja limpar todos os participantes (s/n)? ");
				resposta = limpar.nextLine();

				// valida��o
				switch (resposta) {
				case "s":
					listarParticipantes.clear();
					System.out.println("Listar do evento est� vazia!");
					System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");

					break;
				case "n":
					System.out.println("Todos participantes permanecem inscritos!");
					System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
					break;
				default:
					System.err.println("Essa op��o � invalida, tente novamente! use s para sim e n para n�o.");
					System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
					break;
				}

				break;
			case 8:
				System.out.println("Obrigado(a) por utilizar o nosso sistema! Atenciosamente Games Developer ");
				System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
				break;
			default:
				System.err.println("Essa op��o � invalida, tente novamente!");
				System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
				break;
			}

		} while (opcao != 8);

	}

	public static void menu() {

		System.out.println("|----#----#----#----#----#----#----#----#----#----#----|"
				+ "\n|----# Sejam bem vindos ao evento Games Developer #----|"
				+ "\n|----#           Menu de inscri��es               #----|"
				+ "\n|----#         1 - Cadastrar participante         #----|"
				+ "\n|----#         2 - Remover por posi��o            #----|"
				+ "\n|----#         3 - Remover por nome               #----|"
				+ "\n|----#         4 - Listar participantes           #----|"
				+ "\n|----#         5 - Pesquisar participante         #----|"
				+ "\n|----#         6 - Ordenar lista alfabeticamente  #----|"
				+ "\n|----#         7 - Limpar lista                   #----|"
				+ "\n|----#         8 - Encerrar                       #----|"
				+ "\n|----#----#----#----#----#----#----#----#----#----#----|");
	}

}
