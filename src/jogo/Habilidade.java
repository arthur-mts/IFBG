package jogo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Habilidade {
	//CLASSE ESTATICA
	private int dano;
	private int level;
	private String nome;
	private String desc;
	private int custoMana;
	//QUANDO USA UMA SKIL DIMINUI PERMANENTE NA MANA
	//Os efeitos serão: atordoar, diminuir ad ou ap SO POR UM TURNO
	public Habilidade(String nome, String desc, String efeito, int custoMana, int dano) {
		super();
		this.level = 1;
		this.nome = nome;
		this.desc = desc;
		this.custoMana = custoMana;
		this.dano = dano;
	}
	public int getDano() {
		return dano;
	}
	public void setDano(int dano) {
		this.dano = dano;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public String getNome() {
		return nome;
	}
	public String getDesc() {
		return desc;
	}
	public int getCustoMana() {
		return custoMana;
	}
	public void setCustoMana(int custoMana) {
		this.custoMana = custoMana;
	}
	@Override
	public String toString() {
		return "Nome: "+ nome + ", Level: " + level +  ", Descrição: " + desc 
				+ " ,Custo: " + custoMana + ", Dano:"+dano;
	}
	public String nomes(){
		return nome;
	}
	
}