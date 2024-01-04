package ecommerce.controller;


import java.util.Scanner;

import ecommerce.util.Cores;


public class AdicionarCarrinho {

	//private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;
	
	Scanner leia = new Scanner(System.in);
	
	private float cartasPadrao = 12.00f;
	private float cartasTimeWizard = 3.50f;
	private float acessorios = 80.00f;
	private int produto;
	private float quantidadeCartasPadrao;
	private float quantidadeCartasTimeWizard;
	private float quantidadeAcessorios;
	private float valorFinal;
	public AdicionarCarrinho(float cartasPadrao, float cartasTimeWizard, float acessorios, int produto, float quantidadeCartasPadrao, float quantidadeCartasTimeWizard, float quantidadeAcessorios, float valorFinal) {
		this.cartasPadrao = cartasPadrao;
		this.cartasTimeWizard = cartasTimeWizard;
		this.cartasTimeWizard = cartasTimeWizard;
		this.produto = produto;
		this.quantidadeCartasPadrao = quantidadeCartasPadrao;
		this.quantidadeCartasTimeWizard = quantidadeCartasTimeWizard;
		this.quantidadeAcessorios = quantidadeAcessorios;
		this.valorFinal = valorFinal;
		
	}
	
	

	public float getCartasPadrao() {
		return cartasPadrao;
	}



	public void setCartasPadrao(float cartasPadrao) {
		this.cartasPadrao = cartasPadrao;
	}



	public float getCartasTimeWizard() {
		return cartasTimeWizard;
	}



	public void setCartasTimeWizard(float cartasTimeWizard) {
		this.cartasTimeWizard = cartasTimeWizard;
	}



	public float getAcessorios() {
		return acessorios;
	}



	public void setAcessorios(float acessorios) {
		this.acessorios = acessorios;
	}
    
	

	public int getProduto() {
		return produto;
	}



	public void setProduto(int produto) {
		this.produto = produto;
	}



	public float getQuantidadeCartasPadrao() {
		return quantidadeCartasPadrao;
	}



	public void setQuantidadeCartasPadrao(float quantidadeCartasPadrao) {
		this.quantidadeCartasPadrao = quantidadeCartasPadrao;
	}



	public float getQuantidadeCartasTimeWizard() {
		return quantidadeCartasTimeWizard;
	}



	public void setQuantidadeCartasTimeWizard(float quantidadeCartasTimeWizard) {
		this.quantidadeCartasTimeWizard = quantidadeCartasTimeWizard;
	}



	public float getQuantidadeAcessorios() {
		return quantidadeAcessorios;
	}



	public void setQuantidadeAcessorios(float quantidadeAcessorios) {
		this.quantidadeAcessorios = quantidadeAcessorios;
	}



	public float getValorFinal() {
		return valorFinal;
	}



	public void setValorFinal(float valorFinal) {
		this.valorFinal = valorFinal;
	}


	public void adicionarCarrinho() {
		
		System.out.println("\n **********************************************");
		System.out.println("Digite o produto que deseja adicionar ao carrinho");
		System.out.println("                                                 ");
		System.out.println("Digite 9 caso queira voltar ao menu              ");
		produto = leia.nextInt();
		
		if (produto == 9) {
			System.out.println("Você voltou ao menu ");
			leia.close();
			System.exit(0);
		}
		
		
		switch (produto) {
		case 1:
			System.out.println("Você deseja adicionar Cartas Padrão ao carrinho ");
			System.out.println("Digite a quantidade: ");
			quantidadeCartasPadrao += leia.nextFloat();
			valorFinal += quantidadeCartasPadrao * cartasPadrao;
			break;
		case 2:
			System.out.println("Você deseja adicionar Cartas Time Wizard ao carrinho ");
			System.out.println("Digite a quantidade: ");
			quantidadeCartasTimeWizard += leia.nextFloat();
			valorFinal += quantidadeCartasTimeWizard * cartasTimeWizard;
			break;
		case 3:
			System.out.println("Você deseja adicionar Acessórios ao carrinho ");
			System.out.println("Digite a quantidade: ");
			quantidadeAcessorios += leia.nextFloat();
			valorFinal += quantidadeAcessorios * acessorios;
			break;	
		default:
			System.out.println("Opção inválida!!");
		}
	  }
	
public void removerCarrinho() {
		
		System.out.println("\n **********************************************");
		System.out.println("Digite o produto que deseja remover do carrinho: ");
		System.out.println("                                                 ");
		System.out.println("                                                 ");
		System.out.println("\n **********************************************");
		System.out.println("Digite 9 caso queira voltar ao menu              ");
		produto = leia.nextInt();
		
		if (produto == 9) {
			System.out.println("Você voltou ao menu ");
			leia.close();
			System.exit(0);
		}
		
		
		switch (produto) {
		case 1:
			System.out.println("Você deseja remover Cartas Padrão ao carrinho ");
			System.out.println("Digite a quantidade: ");
			quantidadeCartasPadrao -= leia.nextFloat();
			
			break;
		case 2:
			System.out.println("Você deseja remover Cartas Time Wizard ao carrinho ");
			System.out.println("Digite a quantidade: ");
			quantidadeCartasTimeWizard -= leia.nextFloat();
			break;
		case 3:
			System.out.println("Você deseja remover Acessórios ao carrinho ");
			System.out.println("Digite a quantidade: ");
			quantidadeAcessorios -= leia.nextFloat();
			break;	
		default:
			System.out.println("Opção inválida!!");
		}
	  }
	
	public void listaCarrinho() {
		
		System.out.println("**********************************************");
		System.out.println("                   CARRINHO                   ");
		System.out.println("                                              ");
		System.out.println("**********************************************");
			if (quantidadeCartasPadrao > 0) {
				System.out.println("\nQuantidade Cartas Padrão: "+this.quantidadeCartasPadrao);
				System.out.println("Preço Cartas Padrão: "+this.cartasPadrao *quantidadeCartasPadrao);
			}
			if (quantidadeCartasTimeWizard > 0) {
				System.out.println("\nQuantidade Cartas Time Wizard: "+this.quantidadeCartasTimeWizard);
				System.out.println("Preço Cartas Time Wizard: "+this.cartasTimeWizard *this.quantidadeCartasTimeWizard);
			}
			if (quantidadeAcessorios > 0) {
				System.out.println("\nQuantidade Acessórios: "+this.quantidadeAcessorios);
				System.out.println("Preço Acessórios: "+this.acessorios *this.quantidadeAcessorios);
			}
			
	  
		
	}
	
	public void finalizarCompra() {
		System.out.println(Cores.TEXTO_BRANCO + Cores.ANSI_BLUE_BACKGROUND +
				"++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("**********************************************");
		System.out.println("                   CARRINHO                   ");
		System.out.println("                                              ");
		System.out.println("               FINALIZAR COMPRA               ");
		System.out.println("                                              ");
		System.out.println("**********************************************");
		System.out.println("                                              ");
		System.out.println("                                                      "+Cores.TEXT_RESET);
		System.out.println("Quantidade de Cartas do formato Padrão: "+quantidadeCartasPadrao);
		System.out.println("                                              ");
		System.out.println("Quantidade de Cartas do formato Time Wizard: "+quantidadeCartasTimeWizard);
		System.out.println("                                              ");
		System.out.println("Quantidade de Acessórios: "+quantidadeAcessorios);
		System.out.println("                                              ");
		System.out.println("O valor total da compra foi de R$"+valorFinal);
		System.out.println("                                              ");
		System.out.println("VOLTE SEMPRE!! - OBELISCO CAMPEÃO!! ");
	}
	
	
	}