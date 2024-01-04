package ecommerce.controller;


import java.util.Scanner;

import ecommerce.model.ObeliskItens;
import ecommerce.util.Cores;


public class ObkEcommerceController extends ObeliskItens{

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
	public ObkEcommerceController(float cartasPadrao, float cartasTimeWizard, float acessorios, int produto, float quantidadeCartasPadrao, float quantidadeCartasTimeWizard, float quantidadeAcessorios, float valorFinal) {
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



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public Scanner getLeia() {
		return leia;
	}


	public void setLeia(Scanner leia) {
		this.leia = leia;
	}

	public void removerCarrinho() {
		super.removerCarrinho();
	}
	
	public void adicionarCarrinho() {
		super.adicionarCarrinho();
	}
	
	public void listaCarrinho() {
		super.listaCarrinho();
	}
	
	public void finalizarCompra() {
		super.finalizarCompra();
	}
	}