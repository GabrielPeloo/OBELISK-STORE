package itens;

public class ItensObelisk {
	
	//Atributos do objeto
	private float cartasPadrao = 10.00f;
	private float cartasTimeWizard = 3.50f;
	private float acessorios = 80.00f;
	
	public ItensObelisk(float cartasPadrao, float cartasTimeWizard, float acessorios) {
		this.cartasPadrao = cartasPadrao;
		this.cartasTimeWizard = cartasTimeWizard;
		this.acessorios = acessorios;
			
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

	
	public void visualizarPrecos() {
		System.out.println("\nValores dos produtos: ");
		System.out.println("\n *******************************************");
		System.out.println("\n                                            ");
		System.out.println("\nID: 1 Cartas Padrão R$ " + this.cartasPadrao);
		System.out.println("\n                                            ");
		System.out.println("\nID: 2 Cartas Time Wizard R$ " + this.cartasTimeWizard);
		System.out.println("\n                                            ");
		System.out.println("\nID: 3 Acessorios R$ " + this.acessorios);
		System.out.println("\n                                            ");
		System.out.println("\n *******************************************");
	
	}
	
	
	
}