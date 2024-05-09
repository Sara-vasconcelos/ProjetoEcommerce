package projetoEcommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import projetoEcommerce.Controller.EcommerceController;
import projetoEcommerce.model.Ecommerce;
import projetoEcommerce.util.CoresEcommerce;
import projetoEcommerce.model.SetordeAlimentos;
import projetoEcommerce.model.SetorRoupas;

public class MenuEcommerce {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		// Criação do Menu do E-commerce com o intuito de gerenciar dois setores , um de Alimentos e outro de Roupas , o que diferencia os dois 
		//+é que Alimentos pede a validade, e Roupas pede para identificar a Categoria sendo Masculino ou Feiminino.

		EcommerceController produtos = new EcommerceController();

		int opcao, id, tipo, quantidade;
		String categoria, nome, validade;
		float preco;

		System.out.println("\nCadastrar produtos\n");

		SetordeAlimentos sa1 = new SetordeAlimentos(produtos.gerarNumero(), 3, 1, "Bolacha Maisena", 10f, "23/07/2024");
		produtos.cadastrar(sa1);

		SetordeAlimentos sa2 = new SetordeAlimentos(produtos.gerarNumero(), 2, 1, "Leite ninho", 15f, "23/12/2024");
		produtos.cadastrar(sa2);

		SetorRoupas sr1 = new SetorRoupas(produtos.gerarNumero(), 5, 2, "Calça Jeans", 400f, "Masculino");
		produtos.cadastrar(sr1);

		SetorRoupas sr2 = new SetorRoupas(produtos.gerarNumero(), 2, 2, "Vestido longo", 450f, "Feiminino");
		produtos.cadastrar(sr2);

		produtos.listarTodas();

		// int opcao =0;

		while (true) {

			System.out.println(CoresEcommerce.TEXT_YELLOW + CoresEcommerce.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                   SKYMARKET                         ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar produto                    ");
			System.out.println("            2 - Lista de produtos                    ");
			System.out.println("            3 - Consultar produtos - por ID          ");
			System.out.println("            4 - Atualizar dados dos produtos         ");
			System.out.println("            5 - Apagar produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("          Entre com a opção desejada:                ");
			System.out.println("                                                     ");
			System.out.println("                                                     " + CoresEcommerce.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) { // erro : incompatibilidade de entrada
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 6) {

				System.out.println(CoresEcommerce.TEXT_WHITE_BOLD + "Obrigado por usar o SKYMARKET!");
				sobre();
				leia.close();
				System.exit(0);// força o programa a fechar aqui

			}

			switch (opcao) {
			case 1:
				System.out.println(CoresEcommerce.TEXT_WHITE + "Cadastrar produto\n\n");
				System.out.println("Digite o preço do produto");
				preco = leia.nextFloat();
				System.out.println("Digite o nome do produto");
				leia.skip("\\R");
				nome = leia.nextLine();

				do {
					System.out.println(
							"Digite o tipo da Setor -  1 : Para Setor de Alimentos ou 2 : Para Setor de Roupas");
					tipo = leia.nextInt();

				} while (tipo < 1 && tipo > 2);

				System.out.println("Digite o quantidade que deseja cadastrar: ");
				quantidade = leia.nextInt();

				switch (tipo) {

				case 1 -> {
					System.out.println("Digite a validade do produto: ");
					leia.skip("\\R");
					validade = leia.nextLine();

					produtos.cadastrar(
							new SetordeAlimentos(produtos.gerarNumero(), quantidade, tipo, nome, preco, validade));

				}

				case 2 -> {
					System.out.println("Digite a Categoria do produto - Masculino ou Feiminino: ");
					leia.skip("\\R");
					categoria = leia.nextLine();
					produtos.cadastrar(
							new SetorRoupas(produtos.gerarNumero(), quantidade, tipo, nome, preco, categoria));
				}

				}
				keyPress();
				break;

			case 2:
				System.out.println(CoresEcommerce.TEXT_WHITE + "Listar todos os produtos\n\n");
				produtos.listarTodas();

				keyPress();
				break;
			case 3:

				System.out.println(CoresEcommerce.TEXT_WHITE + "Consultar os dados do Produto - por ID \n\n");

				System.out.println("Digite o ID do produto: ");
				id = leia.nextInt();

				produtos.procurarPorNumero(id);
				keyPress();
				break;
			case 4:
				System.out.println(CoresEcommerce.TEXT_WHITE + "Atualizar dados dos produtos\n\n");

				System.out.println("Digite o número do Produto : ");
				id = leia.nextInt();

				var buscaProduto = produtos.buscarNaCollection(id);

				if (buscaProduto != null) {
					tipo = buscaProduto.getTipo();

					System.out.println("Digite o preço atualizado : ");
					preco = leia.nextFloat();

					System.out.println("Digite o nome do Produto : ");
					leia.skip("\\R");
					nome = leia.nextLine();

					System.out.println("Digite a quantidade : ");
					quantidade = leia.nextInt();

					switch (tipo) {

					case 1 -> {

						System.out.println("Digite a validade atualizada  : ");
						leia.skip("\\R");
						validade = leia.nextLine();
						produtos.atualizar(new SetordeAlimentos(id, quantidade, tipo, nome, preco, validade));
					}
					case 2 -> {

						System.out.println("Digite a categoria Masculino ou Feiminino: ");
						leia.skip("\\R");
						categoria = leia.nextLine();

						produtos.atualizar(new SetorRoupas(id, quantidade, tipo, nome, preco, categoria));

					}
					default -> {

						System.out.println("Setor inválido!");
					}
					}

				}else {
					System.out.println("O produto não foi encontrado!");
				}
				keyPress();
				break;
			case 5:
				
                System.out.println(CoresEcommerce.TEXT_WHITE + "Deletar produto \n\n");
				
				System.out.println( "Digite o ID da conta");
				id =leia.nextInt();
				
				produtos.deletar(id);
				keyPress();
				break;
			case 6:
				System.out.println(CoresEcommerce.TEXT_WHITE + "Sair\n\n");
				keyPress();
				break;

			default:
				System.out.println(CoresEcommerce.TEXT_RED_BOLD + "\nOpção Inválida!\n" + CoresEcommerce.TEXT_RESET);
				keyPress();
				break;
			}

		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Sara Vasconcelos Freitas Souza  - vasconcelossara11@gmail.com");
		System.out.println("github.com/Sara-vasconcelos");
		System.out.println("*********************************************************");

	}

	public static void keyPress() {

		try {

			System.out.println(CoresEcommerce.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) { // IOException entrada e saida do teclado , e verifica se a tecla está correta

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}

	}
}
