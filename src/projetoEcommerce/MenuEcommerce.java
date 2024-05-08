package projetoEcommerce;

import java.util.Scanner;


import projetoEcommerce.util.CoresEcommerce;

public class MenuEcommerce {

	public static void main(String[] args) {
		//Criação do Menu do E-commerce
		
		
		
		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println(CoresEcommerce.TEXT_YELLOW + CoresEcommerce.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                   SKYMARKET                          ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar produto                    ");
			System.out.println("            2 - Lista de produtos                    ");
			System.out.println("            3 - Consultar produtos - por ID          ");
			System.out.println("            4 - Atualizar produtos                   ");
			System.out.println("            5 - Apagar produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println(CoresEcommerce.TEXT_WHITE_BOLD+ "Obrigada por usar o SkyMarket!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println(CoresEcommerce.TEXT_WHITE+ "Cadastrar produto\n\n");

					break;
				case 2:
					System.out.println(CoresEcommerce.TEXT_WHITE+"Lista de produtos\n\n");

					break;
				case 3:
					System.out.println(CoresEcommerce.TEXT_WHITE+"Consultar produtos - por ID\n\n");

					break;
				case 4:
					System.out.println(CoresEcommerce.TEXT_WHITE+"Atualizar produtos \n\n");

					break;
				case 5:
					System.out.println(CoresEcommerce.TEXT_WHITE+"Apagar produto\n\n");

					break;
				case 6:
					System.out.println(CoresEcommerce.TEXT_WHITE+"Sair\n\n");

					break;
					
				default:
					System.out.println(CoresEcommerce.TEXT_RED_BOLD+"\nOpção Inválida!\n");
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


	}


