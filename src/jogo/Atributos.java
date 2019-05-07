
package jogo;

public class Atributos {
	private int ad;
	private int armor;
	private int ap;

	public Atributos(int ad, int armor, int ap) {
		super();
		this.ad = ad;
		this.armor = armor;
		this.ap = ap;
	}

	public int getAd() {
		return ad;
	}

	public void setAd(int ad) {
		this.ad = ad;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	
	
	
	public int getAp() {
		return ap;
	}

	public void setAp(int ap) {
		this.ap = ap;
	}

	@Override
	public String toString() {
		return "Atributos [ad=" + ad + ", armor=" + armor + ", ap=" + ap + "]";
	}
	

}
