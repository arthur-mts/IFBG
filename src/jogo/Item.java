package jogo;

public class Item {
	private String nome;
	private String desc;
	private int preco;
	private String efeito;
	private int numEfeito;

	public Item(String nome, String desc, int preco, String efeito,
			int numEfeito) {
		super();
		this.nome = nome;
		this.desc = desc;
		this.preco = preco;
		this.efeito = efeito;
		this.numEfeito = numEfeito;
	}

	public String getNome() {
		return nome;
	}

	public String getDesc() {
		return desc;
	}

	public int getPreco() {
		return preco;
	}

	public String getEfeito() {
		return efeito;
	}

	public int getNumEfeito() {
		return numEfeito;
	}

	@Override
	public String toString() {
		return "Descrição do item " + nome + ": " + desc + "\n" + "Ele custa: "
				+ preco + " O seu efeito é: " + efeito
				+ "e o seu numero de efeito é:" + numEfeito;
	}

}
// os efeitos serao: cura, regen de mana, aumento da vida maxima ou mana maxima,
// aumento do
// ad ou do ap