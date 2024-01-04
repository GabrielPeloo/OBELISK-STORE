package ecommerce;

import java.util.Scanner;

import ecommerce.util.Cores;
import itens.ItensObelisk;
import ecommerce.controller.AdicionarCarrinho;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
				
		
		int opcao;
		float cartasPadrao = 12.00f;
		float cartasTimeWizard = 3.50f;
		float acessorios = 80.00f;
		/*int produto;
		float quantidadeCartasPadrao = 0;
		float quantidadeCartasTimeWizard = 0;
		float quantidadeAcessorios = 0;
		float valorFinal = 0;*/
		String endereco = null;
		int numEndereco = 0;
		AdicionarCarrinho carrinho = new AdicionarCarrinho(cartasPadrao, cartasTimeWizard, acessorios, 0, 0, 0, 0, 0);

		while (true) {
			System.out.println(Cores.TEXTO_BRANCO + Cores.ANSI_BLUE_BACKGROUND +
					"++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("                                                      ");
			System.out.println("           ⚜️👑 OBELISK CARD STORE 👑⚜️               ");
			System.out.println("                                                      ");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("                                                      ");
			System.out.println("            1 - CADASTRAR ENDEREÇO                    ");
			System.out.println("                                                      ");
			System.out.println("            2 - VISUALIZAR PRODUTOS                   ");
			System.out.println("                                                      ");
			System.out.println("            3 - ADICIONAR AO CARRINHO                 ");
			System.out.println("                                                      ");
			System.out.println("            4 - EXCLUIR ITEM DO CARRINHO              ");
			System.out.println("                                                      ");
			System.out.println("            5 - VISUALIZAR CARRINHO                   ");
			System.out.println("                                                      ");
			System.out.println("            6 - FINALIZAR COMPRA                      ");
			System.out.println("                                                      ");
			System.out.println("            9 - SAIR                                  ");
			System.out.println("                                                      ");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("                                                      "+Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
						
			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\n    Agradecemos sua preferência ");
				System.out.println(Cores.TEXT_WHITE_BOLD + "\n OBELISK STORE - OBELISCO CAMPEÃO!!");
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			
			case 1:
				 leia.nextLine(); 
				 System.out.println("Digite a rua do endereço de entrega: ");
				 endereco = leia.nextLine();
				 System.out.println("Digite o número do endereço de entrega: ");
				 numEndereco = leia.nextInt();
				 break;
			
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "VISUALIZAR PRODUTOS\n\n");
				ItensObelisk c2 = new ItensObelisk(12.00f, 3.50f, 80.00f);
				c2.visualizarPrecos();
				break;
				
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "ADICIONAR AO CARRINHO\n\n");
                carrinho.adicionarCarrinho();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "REMOVER AO CARRINHO\n\n");
                carrinho.removerCarrinho();
                break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "VISUALIZAR CARRINHO\n\n");
				carrinho.listaCarrinho();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "FINALIZAR COMPRA\n\n");
				
				if (endereco != null) {
					carrinho.finalizarCompra();
					System.out.println("\nSeu pedido será entregue no endereço "+endereco+ " Nº "+numEndereco);
				} else {
					System.out.println("Cadastre um endereço antes de finalizar sua compra!!");
				}
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "Opção inválida!!\n\n"+Cores.TEXT_RESET);
			
			}
			
		}
	}

}
