package ecommerce;

import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) {
			System.out.println(Cores.TEXTO_BRANCO + Cores.ANSI_BLUE_BACKGROUND +
					"++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("                                                      ");
			System.out.println("                  OBELISK STORE                      ");
			System.out.println("                                                      ");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("                                                      ");
			System.out.println("      Econtre o que deseja escolhendo uma sessão:     ");
			System.out.println("                                                      ");
			System.out.println("                                                      ");
			System.out.println("            Entre com a opção desejada:               ");
			System.out.println("                                                      ");
			System.out.println("            1 - CARTAS FORMATO PADRÃO                 ");
			System.out.println("                                                      ");
			System.out.println("            2 - CARTAS FORMATO TIME WIZARD            ");
			System.out.println("                                                      ");
			System.out.println("            3 - ACESSÓRIOS                            ");
			System.out.println("                                                      ");
			System.out.println("            4 - ITENS EM PROMOÇÃO                     ");
			System.out.println("                                                      ");
			System.out.println("            5 - FINALIZAR COMPRA                      ");
			System.out.println("                                                      ");
			System.out.println("            9 - SAIR                                  ");
			System.out.println("                                                      ");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("                                                      "+Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
			
			
			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\n OBELISK STORE - OBELISCO CAMPEÃO!!");
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "CARTAS FORMATO PADRÃO\n\n");
				
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "CARTAS FORMATO TIME WIZARD\n\n");
				
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "ACESSÓRIOS\n\n");
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "ITENS EM PROMOÇÃO\n\n");
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "FINALIZAR COMPRA\n\n");
				
				
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "Opção inválida!!\n\n"+Cores.TEXT_RESET);
			
			}
			
		}
	}

}
