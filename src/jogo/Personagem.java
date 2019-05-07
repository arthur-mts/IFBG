package jogo;

import java.util.ArrayList;

//CLASSE NÃO ESTATICA
public class Personagem {
	private int vida;
	private int vidaMaxima;
	private int mana;
	private int manaMaxima;
	private String nome;
	private int ouro;
	private int xp;
	private int level;
	private ArrayList<Item> itens;
	private ArrayList<Arma> armas;
	private Classe classe;
	private Atributos at;

	// AS HABILIDADES ESTAO NA CLASSE

	public Personagem(String nome, Classe classe) {
		super();
		int vida = 500;
		int mana = 300;
		int xp = 0;
		int ouro = 2500;
		int level = 1;
		Atributos at = classe.getAt();
		ArrayList<Item> itens = new ArrayList<Item>();
		itens.add(new Item("Poção de cura menor",
				"Liquido vermelho com gosto de " + "groselha", 60, "Curar", 20));
		ArrayList<Arma> armas = new ArrayList<Arma>();
		this.vida = vida;
		this.mana = mana;
		this.nome = nome;
		this.ouro = ouro;
		this.xp = xp;
		this.level = level;
		this.itens = itens;
		this.armas = armas;
		this.at = at;
		this.classe = classe;
		this.vidaMaxima = vida;
		this.manaMaxima = mana;
	}

	public int getVidaMaxima() {
		return vidaMaxima;
	}

	public void setVidaMaxima(int vidaMaxima) {
		this.vidaMaxima = vidaMaxima;
	}

	public int getManaMaxima() {
		return manaMaxima;
	}

	public void setManaMaxima(int manaMaxima) {
		this.manaMaxima = manaMaxima;
	}

	public Atributos getAt() {
		return at;
	}

	public void setAt(Atributos at) {
		this.at = at;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getOuro() {
		return ouro;
	}

	public void setOuro(int ouro) {
		this.ouro = ouro;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

	public ArrayList<Arma> getArmas() {
		return armas;
	}

	public void setArmas(ArrayList<Arma> armas) {
		this.armas = armas;
	}

	public Classe getClasse() {
		return classe;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Vida Maxima: " + vidaMaxima
				+ ", Vida atual : " + vida + ", Mana Maxima: " + manaMaxima
				+ ", Mana Atual:" + mana + "\n" + " Quant. ouro: " + ouro
				+ ", Xp: " + xp + ", Level atual: =" + level + "\n"
				+ "Seus itens: " + itens + "\n" + "Suas armas: " + armas + "\n"
				+ "Sua classe: " + classe.getNome() + ", Atributos: " + at;
	}

}
