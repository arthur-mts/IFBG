package jogo;

public class Arma {
	// CLASSE ESTATICA
	private String nome;
	private String desc;
	private Atributos at;

	public Arma(String nome, String desc, Atributos at) {
		super();
		this.nome = nome;
		this.desc = desc;
		this.at = at;
	}

	public String getNome() {
		return nome;
	}

	public String getDesc() {
		return desc;
	}

	public Atributos getAt() {
		return at;
	}

	public String toString() {
		return "Nome da arma: " + nome + "\n"+", Descrição: " + desc +"\n"+ ", Atributos: " + at;
	}

}
