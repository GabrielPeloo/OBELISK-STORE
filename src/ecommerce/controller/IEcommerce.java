package ecommerce.controller;


public interface IEcommerce {
	
	public void adicionarCarrinho(float quantidadeCartasPadrao, float quantidadeCartasTimeWizard, float acessorios);
	public void removerCarrinho(float quantidadeCartasPadrao, float quantidadeCartasTimeWizard, float acessorios);
	public void listaCarrinho(float quantidadeCartasPadrao, float quantidadeCartasTimeWizard, float acessorios);
	public void finalizarCompra(float quantidadeCartasPadrao, float quantidadeCartasTimeWizard, float acessorios, float valorFinal);
	public void visualizarPrecos(float quantidadeCartasPadrao, float quantidadeCartasTimeWizard, float acessorios);
}