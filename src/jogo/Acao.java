package jogo;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;




public class Acao {
	public void golpeBasico(Personagem qdeu, NPC qlevou) {
		int dano = (qdeu.getAt().getAd()) / 2;
		double danoIgnorado = dano * (qlevou.getAt().getArmor() / 100);
		double danoRecebido = (dano - danoIgnorado);
		JOptionPane.showMessageDialog(null, "O " + qlevou.getNome()
				+ " levou: " + danoRecebido + "de dano");
		qlevou.setVida((int) (qlevou.getVida() - danoRecebido));

	}

	public void atkNPC(NPC qdeu, Personagem qlevou) {
		int dano = (qdeu.getAt().getAd()) / 2;
		double danoIgnorado = dano * (qlevou.getAt().getArmor() / 100);
		double danoRecebido = (dano - danoIgnorado);
		JOptionPane.showMessageDialog(null, "O dano recebido foi: "
				+ danoRecebido);
		qlevou.setVida((int) (qlevou.getVida() - danoRecebido));
		

	}

	public void usarHabil(Personagem qdeu, NPC qlevou) {
		Classe cqdeu = qdeu.getClasse();
		ArrayList<Habilidade> h1 = cqdeu.getSkils();
		ArrayList<String> nomeshabs = new ArrayList<String>();
		for (Habilidade i : h1) {
			nomeshabs.add(i.getNome());
			JOptionPane.showMessageDialog(null, i.toString(), "Habilidade", 0);
		}
		String nome = JOptionPane
				.showInputDialog("Digite o nome da habilidade que você quer usar:");
		Habilidade usada = null;
		for (Habilidade h : h1) {
			String nom = h.getNome();
			if (nome.equals(nom)) {
				usada = h;
			}
			// ate aqui foi pega a habilidade que o personagem vai ultilizar
		}// colocar o ataque basico que leva 50% do ad
		if (usada == null) {
			JOptionPane
					.showMessageDialog(null,
							"ERROR: Não existe habilidade com esse nome, USUARIO BURRO!");

		} else {

			if (usada.getDesc().equals("Curar")) {
				int vidaCurada = usada.getDano();
				int manaGasta = usada.getCustoMana();
				int manaQdeu = qdeu.getMana() - manaGasta;
				qdeu.setMana(manaQdeu);
				if (qdeu.getVidaMaxima() < (qdeu.getVida() + vidaCurada)) {
					qdeu.setVida(qdeu.getVidaMaxima());

				} else {
					qdeu.setVida(qdeu.getVida() + vidaCurada);
				}

			} else if (usada.getDesc().equals("Volta")) {
				int vidaPerdida = usada.getDano() / 3;
				qdeu.setVida(qdeu.getVida() - vidaPerdida);
				qlevou.setVida(qlevou.getVida() - usada.getDano());
				qdeu.setMana(qdeu.getMana() - usada.getCustoMana());

			} else {
				int danoHabil = usada.getDano() + (qdeu.getAt().getAp() / 2);
				int manaGasta = usada.getCustoMana();
				double armor = (qlevou.getAt().getArmor());
				double danoIgnorado = danoHabil * (armor / 100);
				double danoRecebido = (danoHabil - (danoIgnorado));
				JOptionPane.showMessageDialog(null,
						"O dano que o " + qlevou.getNome() + "levou foi de: "
								+ danoRecebido);
				int manaQdeu = qdeu.getMana() - manaGasta;
				danoRecebido = (int) danoRecebido;
				System.out.println(danoRecebido);
				int vidaQlevou = (int) (qlevou.getVida() - danoRecebido);
				System.out.println(vidaQlevou);
				qdeu.setMana(manaQdeu);
				JOptionPane.showMessageDialog(null, "A vida atual do"+qlevou.getNome()+"é: "
						+ vidaQlevou);
				qlevou.setVida(vidaQlevou);
			}
		}

		// ainda falta imprementar a exeção

	}

	public void shop(Personagem qcomprou, ArrayList<Item> its) {
		int ouro = qcomprou.getOuro();
		ImageIcon vend = new ImageIcon(Acao.class.getResource("img/vendedor.jpg"));
		JOptionPane.showMessageDialog(null, "Seus itens são: " + "\n"
				+ qcomprou.getItens(), "LOja", 2, vend);
		String nomeI = (String) JOptionPane
				.showInputDialog(
						null,
						"Vendedor: -Você tem "
								+ ouro
								+ " de ouro."
								+ "\n"
								+ "E não, não parcelamos e nem vendemos fiado sabichão!",
						"Vamos aos negocios!", 1, vend, null,
						"Digite aqui o nome do item que você quer" + "\n"
								+ "E para ver outro item digite ver");
		if (nomeI.equals("ver")) {
			verItem(qcomprou, its);
		}
		System.out.println(nomeI);
		for (Item i : its) {
			String nom = i.getNome();
			if (nomeI.equals(nom)) {
				int preco = i.getPreco();
				if (preco <= qcomprou.getOuro()) {
					qcomprou.setOuro(ouro - preco);
					JOptionPane.showMessageDialog(null,
							"Obrigado e volte sempre!");
					ArrayList<Item> itens = qcomprou.getItens();
					System.out.println(itens);
					System.out.println(i);
					itens.add(i);
					qcomprou.setItens(itens);
					System.out.println(itens);
					JOptionPane.showMessageDialog(null, "Seus itens são: "
							+ "\n" + qcomprou.getItens(), "LOja", 2, vend);
				} else {
					JOptionPane.showMessageDialog(null,
							"Parace que você não tem dinheiro o bastante",
							"Que vexame", 2);
				}

			}
		}
		String d = (String) JOptionPane.showInputDialog(null,
				"Deseja comprar mais alguma coisa", "Shop", 1, vend, null,
				"sim ou não");
		if (d.equals("sim")) {
			shop(qcomprou, its);
		} else {

		}

	}

	public void verItem(Personagem qcomprou, ArrayList<Item> its) {
		int ouro = qcomprou.getOuro();
		String no = JOptionPane.showInputDialog(
				"Digite o nome do item que você quer ver" + "\n"
						+ "(Se não quiser ver nada digite não)",
				"Ah, e so pra constar você tem " + ouro + "de ouro");
		boolean ie = false;
		for (Item i : its) {
			String nom = i.getNome();
			if (no.equals(nom)) {
				JOptionPane.showMessageDialog(null, i.toString());
				ie = true;

			}

		}
		if (ie == false) {
			JOptionPane
					.showMessageDialog(null, "Não existe item com esse nome");
		}
		Object[] op = { "Sim", "Não", "Voltar para o inicio" };
		int vi = JOptionPane.showOptionDialog(null, "Deseja ver mais um item?",
				"Loja", 2, 0, null, op, op[0]);
		if (vi == 0) {
			verItem(qcomprou, its);

		} else if (vi == 2) {
			lojaItem(qcomprou);

		} else {

		}
	}

	public void lojaItem(Personagem qcomprou) {
		// adicionando itens...
		ArrayList<Item> its = new ArrayList<Item>();
		ArrayList<Object> nomes = new ArrayList<>();
		Item elixirMana = new Item("Elixir de mana menor",
				"Liquido azul com gosto de " + "pirulito", 60, "CurarM", 20);
		its.add(elixirMana);
		Item pocao = new Item("Poção de cura menor",
				"Liquido vermelho com gosto de " + "groselha", 60, "Curar", 20);
		its.add(pocao);
		nomes.add(pocao.getNome());
		Item elixirForca = new Item("Elixir de força menor",
				"SUPLEMENTO FISICO BY: KLEBER BAM BAM", 60, "Fortalecer dano",
				5);
		its.add(elixirForca);
		nomes.add(elixirForca.getNome());
		Item elixirMagico = new Item("Elixir mágico menor",
				"Chá de chifre de unicornio", 60, "Fortalecer ap", 6);
		its.add(elixirMagico);
		nomes.add(elixirMagico.getNome());
		Item elixirResistencia = new Item("Elixir de resistencia menor",
				"É simplesmente um biotonico fontora melhorado", 60,
				"Fortalecer defesa", 4);
		its.add(elixirResistencia);
		nomes.add(elixirResistencia.getNome());
		ImageIcon p = new ImageIcon(Acao.class.getResource("img/pot.jpg"));
		// pronto

		JOptionPane.showMessageDialog(null,
				"Aqui você podera comprar varios itens que irão "
						+ "lhe auxiliar" + " nessa jornada!" + "\n"
						+ "Os nossos itens são: " + "\n" + nomes,
				"Bem vindo a loja norbre aventureiro!", 1, p);

		verItem(qcomprou, its);
		shop(qcomprou, its);

		// 0=sim,1=nao,2=cancel

		JOptionPane.showMessageDialog(null,
				"Seus itens são: " + qcomprou.getItens() + "E voĉe tem "
						+ qcomprou.getOuro() + " de ouro");

		// JOptionPane.showInputDialog(null, vend+"\n"+"kkk",
		// "Vamos aos negocios!", 1);
		// Lucas vai criar os itens e fds
		// JOptionPane.showMessageDialog(null, pocao.getNome() +
		// "\n+ elixirForca.getNome() + "\n" + elixirMagico.getNome() + "\n"
		// + elixirResistencia.getNome(), "Descrição dos itens", 1, shop);

		// JOptionPane.showMessageDialog(null, "Você tem " + ouro +
		// " de ouro");
	}

	// O personagem passa de level quando atinge 500 de xp
	public boolean passouDeLevel(Personagem p) {
		int xp = p.getXp();
		if (xp >= 500) {
			int level = p.getLevel() + 1;
			p.setLevel(level);
			p.setManaMaxima(p.getManaMaxima() + 50);
			p.setMana(p.getManaMaxima());
			p.setVidaMaxima(p.getVidaMaxima() + 50);
			p.setVida(p.getVidaMaxima());
			ArrayList<Habilidade> h = p.getClasse().getSkils();
			for (Habilidade i : h) {
				i.setLevel(i.getLevel() + 1);
				i.setDano(i.getDano() + 10);
				i.setCustoMana(i.getCustoMana() + 5);
			}
			p.setXp(p.getXp() - 500);
			return true;

		} else {
			return false;

		}
	}

	public void usarItem(Item i, Personagem qUsou) {
		if (i.getEfeito().equals("Curar")) {
			int vidaCurada = i.getNumEfeito();
			if (qUsou.getVidaMaxima() < (qUsou.getVida() + vidaCurada)) {
				qUsou.setVida(qUsou.getVidaMaxima());

			} else {
				qUsou.setVida(qUsou.getVida() + vidaCurada);
			}

		} else if (i.getEfeito().equals("Fortalecer dano")) {
			Atributos at = qUsou.getAt();
			int danoAumentado = i.getNumEfeito();
			int danoqUsou = at.getAd() + danoAumentado;
			at.setAd(danoqUsou);
		} else if (i.getEfeito().equals("Fortalecer defesa")) {
			Atributos at = qUsou.getAt();
			int armorAumentada = i.getNumEfeito();
			int armorQusou = at.getArmor() + armorAumentada;
			at.setArmor(armorQusou);
		} else if (i.getEfeito().equals("Fortalecer ap")) {
			Atributos at = qUsou.getAt();
			int apAumentado = i.getNumEfeito();
			int apQusou = at.getAp() + apAumentado;
			at.setArmor(apQusou);
		} else if (i.getEfeito().equals("CurarM")) {
			Atributos at = qUsou.getAt();
			int ManaCurada = i.getNumEfeito();
			if (qUsou.getManaMaxima() < (qUsou.getMana() + ManaCurada)) {
				qUsou.setMana(qUsou.getManaMaxima());

			} else {
				qUsou.setMana(qUsou.getMana() + ManaCurada);
			}

		}

	}
}
// JOptionPane.showMessageDialog(null, "As suas habilidades são: "+
// h1.toString());
// Esta classe sera usada para ultilizar itens, habilidades, ataques e etc.
// OBS: NA HABILIDADE SERA ADICIONADO 50% DO DANO MAGICO.
// PERSONAGEM E ETC.
// A QUANTIDADE DE ARMADURA SERA A PORCENTAGEM DE DANO IGNORADO
