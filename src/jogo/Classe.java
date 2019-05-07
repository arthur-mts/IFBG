package jogo;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
//CLASSE ESTATIACA
public class Classe {
	private String nome;
	private String desc;
	private ArrayList<Item> itensP;
	private ArrayList<Habilidade> skils;
	private Atributos at;
	public Classe(String nome, String desc, ArrayList<Item> itensP,
			ArrayList<Habilidade> skils, Atributos at) {
		super();
		this.nome = nome;
		this.desc = desc;
		this.itensP = itensP;
		this.skils = skils;
		this.at = at;
	}
	public String getNome() {
		return nome;
	}
	public String getDesc() {
		return desc;
	}
	public ArrayList<Item> getItensP() {
		return itensP;
	}
	public ArrayList<Habilidade> getSkils() {
		return skils;
	}
	public Atributos getAt() {
		return at;
	}
	@Override
	public String toString() {
		String h = "";
		for (Habilidade i: skils) {
			h += i.toString()+"\n";
		}
		return "Nome: "+nome+" Descrição: "+desc+"\n"+"Habilidades: "+h+"\n"+"Atributos iniciais: "+at;
	}
	
	
	
	
	
}
