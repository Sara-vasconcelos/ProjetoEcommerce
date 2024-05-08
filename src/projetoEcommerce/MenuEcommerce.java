package projetoEcommerce;

import ecommerce.model.Ecommerce;
import ecommerce.model.SetorVarejista;
import ecommerce.model.LojaDepartamentos;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


import projetoEcommerce.util.CoresEcommerce;

public class MenuEcommerce {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		//Criação do Menu do E-commerce
		

		
		
	
				
				
				// Teste do Setor Varejista
				SetorVarejista SetorVarejo1 = new SetorVarejista(2, 123, 1, "Bata doce", 6, 1);
				SetorVarejo1.visualizar();
				SetorVarejo1.deletar(2);
				SetorVarejo1.visualizar();
				SetorVarejo1.Cadastrar(4);
				SetorVarejo1.visualizar();
				
		        // Teste da Loja de Departamentos
				LojaDepartamentos LojaDepart = new LojaDepartamentos(3, 40, 2, "Calça Jeans", 6, "Masculino");
				LojaDepart.visualizar();
				LojaDepart.deletar(2);
				LojaDepart.visualizar();
				LojaDepart.Cadastrar(3);
				LojaDepart.visualizar();
		
		
		
		
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
			
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) { // erro : incompatibilidade de entrada
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			

			}

			if (opcao == 9) {
				System.out.println(CoresEcommerce.TEXT_WHITE_BOLD+ "Obrigada por usar o SkyMarket!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println(CoresEcommerce.TEXT_WHITE+ "Cadastrar produto\n\n");
					keyPress();
					break;
				case 2:
					System.out.println(CoresEcommerce.TEXT_WHITE+"Lista de produtos\n\n");
					keyPress();
					break;
				case 3:
					System.out.println(CoresEcommerce.TEXT_WHITE+"Consultar produtos - por ID\n\n");
					keyPress();
					break;
				case 4:
					System.out.println(CoresEcommerce.TEXT_WHITE+"Atualizar produtos \n\n");
					keyPress();
					break;
				case 5:
					System.out.println(CoresEcommerce.TEXT_WHITE+"Apagar produto\n\n");
					keyPress();
					break;
				case 6:
					System.out.println(CoresEcommerce.TEXT_WHITE+"Sair\n\n");
					keyPress();
					break;
					
				default:
					System.out.println(CoresEcommerce.TEXT_RED_BOLD+"\nOpção Inválida!\n");
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
			System.in.read();// indica a leitura de um dispositivo de entrada padrão (teclado),
			// os dados do buffer nativo são transferidos para a JVM e o primeiro byte
			// digitado é retornado ao usuário e retirado do buffer.

			// Porém se o buffer nativo estiver vazio, o método retorna -1. No caso do
			// Método keyPress(), ao pressionar a tecla , automaticamente o Menu é
			// reiniciado.

		} catch (IOException e) { // IOException entrada e saida do teclado , e verifica se a tecla está correta

			System.out.println("Você pressionou uma tecla diferente de enter!");

	}
		
	}
}



