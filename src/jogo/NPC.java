package jogo;

//CLASSE ESTATICA
public class NPC {
	private int vida;
	private Atributos at;
	private String nome;
	private int ouroDropado;
	private int xp;

	public NPC(int vida, String nome, int ouroDropado, Atributos at, int xp) {
		super();
		this.vida = vida;
		this.nome = nome;
		this.ouroDropado = ouroDropado;
		this.at = at;
		this.xp = xp;
	}

	public int getXp() {
		return xp;
	}

	public int getVida() {
		return vida;
	}

	public String getNome() {
		return nome;
	}

	public int getOuroDropado() {
		return ouroDropado;
	}

	public Atributos getAt() {
		return at;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Atributos: " + at + "\n" + "Vida: "
				+ vida + ", Ouro dropado: " + ouroDropado + ", Experiencia: "
				+ xp;
	}

}
