package jogo;

import java.util.ArrayList;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Main {
	public static void batalha(Personagem p, NPC m) {

	}

	public static NPC escolherMonstro(Personagem p) {
		NPC goblin = new NPC(100, "Goblin", 20, new Atributos(40, 15, 12), 20);
		NPC lobo = new NPC(200, "Lobo", 100, new Atributos(60, 15, 12), 40);
		NPC trol = new NPC(300, "Trol", 120, new Atributos(80, 30, 12), 40);
		NPC pirata = new NPC(400, "Pirata", 200, new Atributos(90, 40, 12), 60);
		NPC lobisomem = new NPC(500, "Tony Ramos", 300, new Atributos(90, 60,
				12), 100);
		NPC dragão = new NPC(1000, "Dragão", 2000, new Atributos(500, 70, 12),
				400);
		NPC pfHugo = new NPC(9999, "PROVA FINAL DE HUGO", 99999, new Atributos(
				99999, 99, 12), 1000);
		ImageIcon bb = new ImageIcon(Main.class.getResource("img/bb.jpg"));
		ImageIcon drag = new ImageIcon(Main.class.getResource("img/dragão.jpg"));
		ImageIcon gob = new ImageIcon(Main.class.getResource("img/goblin.jpg"));
		ImageIcon lob = new ImageIcon(Main.class.getResource("img/lobo.jpg"));
		ImageIcon tr = new ImageIcon(Main.class.getResource("img/trol.jpg"));
		ImageIcon pir = new ImageIcon(Main.class.getResource("img/pirata.jpg"));
		ImageIcon lobi = new ImageIcon(Main.class.getResource("img/lobisomem.jpg"));
		ImageIcon hugoff = new ImageIcon(Main.class.getResource("img/hugoff.png"));

		JOptionPane.showMessageDialog(null,
				"Os mosntros diponiveis na masmorra são: "
						+ "Goblin, Lobo, Trol, Pirata, Lobisomem, Dragão e \n "
						+ "A PROVA FINAL DE HUGO", "IFBG", 2, bb);
		JOptionPane.showMessageDialog(null, "Goblin, parece contigo: \n"
				+ goblin.toString(), "IFBG", 2, gob);
		JOptionPane.showMessageDialog(
				null,
				"Dragão, a tua mã... Brincadeirinha ;3" + ": \n"
						+ dragão.toString(), "IFBG", 2, drag);
		JOptionPane.showMessageDialog(null,
				"Lobo, um lobo: \n" + lobo.toString(), "IFBG", 2, lob);
		JOptionPane.showMessageDialog(null, "Trol, criaturas maldosas: \n"
				+ trol.toString(), "IFBG", 2, tr);
		JOptionPane.showMessageDialog(null, "Piratas, vendem dvds ilicitos \n"
				+ pirata.toString(), "IFBG", 2, pir);
		JOptionPane.showMessageDialog(null,
				"Lobisomem, homens metade lobos. \n" + lobisomem.toString(),
				"IFBG", 2, lobi);
		JOptionPane.showMessageDialog(null, "O TEMIDO PROFESSOR HUGO!!!!: \n"
				+ pfHugo.toString(), "IFBG", 2, hugoff);
		String nm = (String) JOptionPane.showInputDialog(null,
				"Digite o nome do monstro desejado", "IFBG", 2, bb, null, ":v");
		switch (nm) {
		case "Goblin":

			return goblin;
		case "Lobo":
			return lobo;
		case "Trol":
			return trol;
		case "Pirata":
			return pirata;
		case "Lobisomem":
			return lobisomem;
		case "Dragão":
			return dragão;
		case "PROVA FINAL DE HUGO":
			return pfHugo;
		default:
			JOptionPane.showMessageDialog(null,
					"Não existe monstro com esse nome", "IFBG", 2);
			escolherMonstro(p);
			break;

		}
		return null;
	}

	public static Personagem criaPersonagem(ArrayList<Classe> c,
			ArrayList<Arma> armas) {
		System.out.println(c.get(3));
		ImageIcon cl = new ImageIcon(Main.class.getResource("img/rpgg.jpg"));
		String classe = (String) JOptionPane.showInputDialog(null,
				"Escolha para a sua jornada um dos nossos quatro " + "\n"
						+ "(nem tanto) nobres gurreiros." + "\n"
						+ "MAGO, LADRÃO, GURREIRO E METALEIRO!",
				"Criação de personagem", 0, cl, null,
				"Digite aqui o nome da classe");
		Personagem np = null;
		Classe nc = null;
		ImageIcon imgc = null;
		String nome = null;
		for (Classe i : c) {
			if (i.getNome().equals(classe)) {
				nc = i;
			}
		}

		switch (classe) {
		case "Mago":
			imgc = new ImageIcon(Main.class.getResource("img/black-mage.png"));
			nome = (String) JOptionPane.showInputDialog(null,
					"Agora dê um nome ao seu querido " + classe,
					"Criação de personagem", 0, imgc, null,
					"Digite aqui o nome do seu personagem");
			np = new Personagem(nome, nc);
			break;
		case "Ladrão":
			imgc = new ImageIcon(Main.class.getResource("img/thief.png"));
			nome = (String) JOptionPane.showInputDialog(null,
					"Agora dê um nome ao seu querido " + classe,
					"Criação de personagem", 0, imgc, null,
					"Digite aqui o nome do seu personagem");
			np = new Personagem(nome, nc);

			break;
		case "Guerreiro":
			imgc = new ImageIcon(Main.class.getResource("img/warrior.png"));
			nome = (String) JOptionPane.showInputDialog(null,
					"Agora dê um nome ao seu querido " + classe,
					"Criação de personagem", 0, imgc, null,
					"Digite aqui o nome do seu personagem");
			np = new Personagem(nome, nc);

			break;
		case "Metaleiro":
			imgc = new ImageIcon(Main.class.getResource("img/metaleiro.jpg"));
			nome = (String) JOptionPane.showInputDialog(null,
					"Agora dê um nome ao seu querido " + classe,
					"Criação de personagem", 0, imgc, null,
					"Digite aqui o nome do seu personagem");
			np = new Personagem(nome, nc);

			break;
		default:
			JOptionPane.showMessageDialog(null, "Não existe classe com o nome "
					+ classe, "ERROR", 2);
			String oo = JOptionPane.showInputDialog(null,
					"Digite 1 para criar outro personagem e 2 para" + "\n"
							+ "ir para o menu", "Criação de personagem", 0);
			if (oo.equals("1")) {
				criaPersonagem(c, armas);
			} else if (oo.equals("2")) {
				menu(c, armas);
			} else {
				menu(c, armas);
			}
			break;
		}
		ImageIcon cong = new ImageIcon(Main.class.getResource("img/con.gif"));
		JOptionPane.showMessageDialog(null,
				"Parabens, seu personagem foi criado:" + "\n" + np.toString(),
				"Criação de personagem", 0, cong);
		return np;
	}

	public static Personagem menu(ArrayList<Classe> c, ArrayList<Arma> armas) {
		Personagem np = null;
		ImageIcon home = new ImageIcon(Main.class.getResource("img/bb.jpg"));
		String opcao = (String) JOptionPane.showInputDialog(null,
				"IFBatlleGround" + "\n" + "by: Arthur MTS & Lucas Rodrigues."
						+ "\n" + "2° ano IFPB Campus Esperança" + "\n"
						+ "Para ir direto ao RPG digite 'Start'" + "\n"
						+ "Para saber mais sobre as classes digite 'Classes"
						+ "\n"
						+ "Para saber mais dos desenvolvedores digite 'Inutil'"
						+ "\n" + "E para sair digite 'Sair",
				"Bem vindo ao IFBatlleGround ", 1, home, null, ":v");
		switch (opcao) {
		case "Start":
			ImageIcon avv = new ImageIcon(Main.class.getResource("img/avv.jpg"));
			JOptionPane.showMessageDialog(null,
					"Antes de começar a nossa jornada vamos criar um heroi",
					"IFBG", 1, avv);
			np = criaPersonagem(c, armas);
			Object[] options = { "Sim", "Não" };
			int oo = JOptionPane.showOptionDialog(null,
					"Tudo pronto para começar nossa jornada?", "IFBG",
					JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
					avv, options, options[0]);
			if (oo == 1) {
				np = criaPersonagem(c, armas);
			}

			ImageIcon batlle = new ImageIcon(Main.class.getResource("img/ccc.jpg"));
			String nomesA = "";
			int k = 0;
			for (Arma i : armas) {
				nomesA += i.getNome() + ", ";
				k += 1;
				if (k == 3) {
					nomesA += "\n";
					k = 0;

				}

			}
			int va = 0;
			int contArmas = 0;
			ArrayList<Arma> arms = np.getArmas();
			while (contArmas <= 1) {
				String arma = (String) JOptionPane.showInputDialog(null,
						"Agora o seu personagem precisa de armas não é?" + "\n"
								+ "As nossas armas disponiveis atualmente são:"
								+ nomesA, "IFBG", 2, batlle, null,
						"Digite aqui o nome da arma que você quer ver");
				JOptionPane.showMessageDialog(null,
						"Seus atributos agora são: " + "\n" + np.getAt(),
						"IFBG", 2);
				for (Arma i : armas) {
					String scr = "img/"+i.getNome() + ".png";
					System.out.println(scr);
					if (arma.equals(i.getNome())) {
						ImageIcon a = new ImageIcon(Main.class.getResource(scr));
						JOptionPane.showMessageDialog(null, i.toString(),
								"IFBG", 2, a);
						int oa = JOptionPane.showOptionDialog(null,
								"Quer essa arma?*OBS: Você so pode ter duas",
								"IFBG", JOptionPane.DEFAULT_OPTION,
								JOptionPane.WARNING_MESSAGE, a, options,
								options[0]);
						if (oa == 0) {
							contArmas += 1;
							arms.add(i);
							int adArm = i.getAt().getAd();
							int armorArm = i.getAt().getArmor();
							int apArm = i.getAt().getAp();
							np.setAt(new Atributos(np.getAt().getAd() + adArm,
									np.getAt().getArmor() + armorArm, np
											.getAt().getAp() + apArm));

						}
						JOptionPane.showMessageDialog(
								null,
								"Seus atributos agora são: " + "\n"
										+ np.getAt(), "IFBG", 2);

					}
				}
			}

			break;
		case "Classes":
			ImageIcon classe = new ImageIcon(Main.class.getResource("img/rpgg.jpg"));
			String nome = (String) JOptionPane.showInputDialog(null,
					"Nossas classes atuais são:" + "\n"
							+ "Gurreiro, Mago, Metaleiro e Ladrão", "Classes",
					1, classe, null,
					"Nome da classe:(Digite voltar para voltar:v");
			// null, "jjjj", "Classes", 1, classe , null, "Digite aqui a classe"
			// null,classe+,"Digite aqui o nome da classe",1
			switch (nome) {
			case "Guerreiro":
				ImageIcon kng = new ImageIcon(
						Main.class.getResource("img/warrior.png"));
				JOptionPane.showMessageDialog(null, c.get(0).toString(),
						"Guerreiro", 1, kng);
				break;
			case "Ladrão":
				ImageIcon thief = new ImageIcon(
						Main.class.getResource("img/thief.png"));
				JOptionPane.showMessageDialog(null, c.get(3).toString(),
						"Ladrão", 1, thief);
				break;
			case "Metaleiro":
				ImageIcon m = new ImageIcon(
						Main.class.getResource("img/metaleiro.jpg"));
				JOptionPane.showMessageDialog(null, c.get(2).toString(),
						"Metaleiro", 1, m);
				break;
			case "Mago":
				ImageIcon ma = new ImageIcon(
						Main.class.getResource("img/black-mage.png"));
				JOptionPane.showMessageDialog(null, c.get(1).toString(),
						"Mago", 1, ma);
				break;
			case "Voltar":
				menu(c, armas);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Classe inexistente");
				menu(c, armas);
				break;
			}
			menu(c, armas);

			break;
		case "Inutil":
			ImageIcon art = new ImageIcon(Main.class.getResource("img/art.jpg"));
			ImageIcon luk = new ImageIcon(Main.class.getResource("img/luk.jpg"));
			Object[] options1 = { "Fotenha Art", "Fotenha Luk" };
			int oo2 = JOptionPane.showOptionDialog(null,
					"Qual dos dois lindos?", "IFBG",
					JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
					null, options1, options1[0]);
			if (oo2 == 0) {
				JOptionPane
						.showMessageDialog(
								null,
								"Email: arthur.mts@gmail.com"
										+ "\n"
										+ "Arthur Mauricio 2° Ano IFPB Campus Esperança",
								"IFBG", 2, art);
			} else if (oo2 == 1) {
				JOptionPane
						.showMessageDialog(
								null,
								"Email: zerefinho32@gmail.com"
										+ "\n"
										+ "Lucas Rodrigues 2° Ano IFPB Campus Esperança",
								"IFBG", 2, luk);
			}

			break;
		case "Sair":
			break;
		default:
			JOptionPane.showMessageDialog(null, "ERROr", "Opção inexxxistente",
					3, null);
			break;
		}
		return np;

	}

	public static void main(String[] args) {
		Acao a = new Acao();
		ArrayList<Arma> armas = new ArrayList<Arma>();
		ArrayList<Classe> c = new ArrayList<Classe>();
		Arma dagger = new Arma("Adaga inicial", "causa dano físico",
				new Atributos(15, 0, 0));
		armas.add(dagger);
		Arma cajado1 = new Arma("Cajado inicial", "causa dano mágico",
				new Atributos(0, 0, 15));
		armas.add(cajado1);
		Arma cajado2 = new Arma("Cajado mediano", "causa dano mágico",
				new Atributos(0, 0, 150));
		armas.add(cajado2);
		Arma longsword = new Arma("longsword",
				"causa dano longoooo( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)",
				new Atributos(40, 0, 0));
		armas.add(longsword);
		Arma swordgoddomain = new Arma("Espada de um deus Caído",
				"causa dano para um caralho", new Atributos(400, 0, 0));
		armas.add(swordgoddomain);
		Arma excalibur = new Arma("Excalibur", "Overload", new Atributos(999,
				60, 999));
		armas.add(excalibur);
		Arma HuntersArmor = new Arma(
				"Armadura de caçador",
				"Armadura de caçador: embora não seja tão boa, tem sua proteção",
				new Atributos(0, 15, 0));
		armas.add(HuntersArmor);
		Arma MilitarArmor = new Arma(
				"Armadura de militar",
				"Armadura de militar: Resistente conra projeteis físicos, como magias de lançamentos e hit e espada, mas fraca contra acerto mais fortes",
				new Atributos(0, 30, 0));
		armas.add(MilitarArmor);
		Arma SolitaryHunterArmor = new Arma(
				"Armadura de caçador solitário",
				"Armadura de caçador solitário: Armadura poderosa que pertenceu ao grande caçador Hendryken",
				new Atributos(0, 50, 0));
		armas.add(SolitaryHunterArmor);
		Arma DraconiumArmor = new Arma(
				"Armadura Draconium",
				"Armadura Draconium: Armadura feita a partir das mais duras escamas do mitológico dragão negro do vale",
				new Atributos(0, 60, 0));
		armas.add(DraconiumArmor);
		Arma SladeArmor = new Arma("Slade Armor",
				"Armadura do personagem Slade Wilson (DC Comics)",
				new Atributos(0, 45, 0));
		armas.add(SladeArmor);
		Arma BasicShield = new Arma(
				"Escudo básico",
				"Defende relativamente bem, para quem está iniciando sua jornada",
				new Atributos(0, 5, 0));
		armas.add(BasicShield);
		Arma mediumshield = new Arma("Escudo Médio",
				"Defende razoavelmene bem", new Atributos(0, 10, 0));
		armas.add(mediumshield);
		Arma ValadorsShield = new Arma("Escudo Final", "Super proteção",
				new Atributos(15, 50, 0));
		armas.add(ValadorsShield);
		ArrayList<Habilidade> KnightH = new ArrayList<Habilidade>();

		Habilidade knght1 = new Habilidade("Força total!",
				"Fortalece seu golpe basico", "", 30, 40);
		Habilidade knght2 = new Habilidade("Grito de reforço!",
				"Com um grito de gloria recupera forças", "Curar", 50, 60);
		Habilidade knght3 = new Habilidade(
				"Espada Justiceira",
				"Desfere um golpe mortal com sua arma, porem se machuca também",
				"Volta", 90, 130);
		KnightH.add(knght1);
		KnightH.add(knght2);
		KnightH.add(knght3);
		Classe guerreiroClasse = new Classe("Guerreiro",
				"Jovens que buscam a gloria nos campos de batalha",
				new ArrayList<Item>(), KnightH, new Atributos(20, 50, 10));
		c.add(guerreiroClasse);
		ArrayList<Habilidade> MagoH = new ArrayList<Habilidade>();
		Habilidade mago1 = new Habilidade("Jarrada mistica",
				"Uma jarrada de energia cosmica", "", 50, 50);
		MagoH.add(mago1);
		Habilidade mago2 = new Habilidade("Trovão de luz",
				"Invoca um trovão do ceu", "", 20, 40);
		MagoH.add(mago2);
		Habilidade mago3 = new Habilidade("Invocar espiritos",
				"Reza muito loka", "Curar", 50, 70);
		MagoH.add(mago3);
		Classe mago = new Classe("Mago", "Aprendizes de feiticeiro",
				new ArrayList<Item>(), MagoH, new Atributos(15, 20, 45));
		c.add(mago);
		ArrayList<Habilidade> MetaleiroH = new ArrayList<Habilidade>();
		Habilidade metal1 = new Habilidade("Slasher",
				"Onda sonora extremamente distorcida", "", 50, 80);
		MetaleiroH.add(metal1);
		Habilidade metal2 = new Habilidade("Fear of the dark",
				"SE CURA NAS PROFUNDEZAS DA ESCURIDÃO", "Curar", 30, 80);
		MetaleiroH.add(metal2);
		Habilidade metal3 = new Habilidade("Guns",
				"Toca musicas do Guns no seu celular", " ", 0, 10);
		MetaleiroH.add(metal3);
		Classe metaleiro = new Classe("Metaleiro",
				"Usam roupas pretas e tem barbas longas(Redes<3)",
				new ArrayList<Item>(), MetaleiroH, new Atributos(70, 20, 20));
		// PASSIVO: CORDAS NOVAS!: PEGADA MAIS FIRME NAS ARMAS
		c.add(metaleiro);
		ArrayList<Habilidade> LadraoH = new ArrayList<Habilidade>();
		Habilidade ladrao1 = new Habilidade("Corrupção",
				"Espalha santinhos de politicos", "", 60, 60);
		LadraoH.add(ladrao1);
		Habilidade ladrao2 = new Habilidade("Conloio politico",
				"Reforçar as alianças com o governo atual", "Curar", 70, 1000);
		LadraoH.add(ladrao2);
		Habilidade ladrao3 = new Habilidade(
				"DESVIAR MILHÕES",
				"Agora sua comida ficou mais cara e você não tem mais nem saneamento basio",
				" ", 100, 200);
		LadraoH.add(ladrao3);
		Classe ladrao = new Classe("Ladrão", "O Brasileiro conhece bem",
				new ArrayList<Item>(), LadraoH, new Atributos(40, 40, 60));
		c.add(ladrao);
		// PASSIVA: APADRINHAMENTO :AUMENTA A RESISTENCIA
		// CLASSES!
		// null,home+"\n"+"by: Arthur MTS & Lucas Rodrigues","Bem vindo ao IFBatlleGround",1
		Personagem np = menu(c, armas);
		ImageIcon home = new ImageIcon(Main.class.getResource("img/bb.jpg"));
		boolean cb = true;
		if (np.equals(null)) {
			System.exit(0);
		}
		while (cb == true) {
			NPC m = escolherMonstro(np);
			JOptionPane.showMessageDialog(null,
					"Antes de começar a batalha, vamos comprar" + "\n"
							+ "alguns itens!", "IFBG", 2, home);
			a.lojaItem(np);
			while (np.getVida() > 0 && m.getVida() > 0) {
				JOptionPane.showMessageDialog(
						null,
						"O NPC que você esta enfrentando é" + "\n"
								+ m.toString(), "IFBG", 2, home);
				Object[] options = { "Usar ataque basico", "Habilidade",
						"Usar item", "Fugir;-;" };
				int oo = JOptionPane.showOptionDialog(null,
						"Escolha uma opção", "IFBG",
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.WARNING_MESSAGE, home, options, options[0]);
				switch (oo) {
				case 0:
					a.golpeBasico(np, m);
					break;
				case 1:
					a.usarHabil(np, m);
					break;
				case 2:
					ArrayList<Item> its = np.getItens();
					String ni = "";
					int ci = 0;
					for (Item k : its) {
						ni += k.getNome() + ", ";
						ci += 1;
						if (ci == 3) {
							ci = 0;
							ni += "\n";

						}
					}
					String niu = JOptionPane.showInputDialog(null,
							"Seus itens são: " + ni,
							"Qual item você quer usar?", 2);
					boolean ic = false;
					for (Item u : its) {
						if (niu.equals(u.getNome())) {
							JOptionPane.showMessageDialog(null, "Item: " + "\n"
									+ u.toString(), "IFBG", 2, home);
							a.usarItem(u, np);
							ic = true;
							break;

						}
					}
					if (ic == false) {
						JOptionPane.showMessageDialog(null,
								"ERROU O NOME E PERDEU O TURNO USUARIO BURRO",
								"IFBG", 2, home);
					}

					break;
				case 3:
					ImageIcon joia = new ImageIcon(
							Main.class.getResource("img/joia.jpg"));
					JOptionPane.showMessageDialog(null,
							"Obrigado por jogar e volte" + "sempre :)", "IFBG",
							2, joia);
					System.exit(0);
					break;
				default:
					break;
				}
				JOptionPane.showMessageDialog(null,
						"Agora é a vez do " + m.getNome() + " atacar", "IFBG",
						2, home);
				a.atkNPC(m, np);

			}
			if (m.getVida() <= 0) {
				np.setXp(np.getXp() + m.getXp());
				np.setOuro(np.getOuro() + m.getOuroDropado());
				ImageIcon joia = new ImageIcon(
						Main.class.getResource("img/joia.jpg"));
				boolean p = a.passouDeLevel(np);
				if (p == true) {
					JOptionPane.showMessageDialog(null,
							"Seus atributos agora são: " + np.toString(),
							"IFBG", 2, joia);
					ArrayList<Habilidade> ha = np.getClasse().getSkils();
					String h1 = ha.get(0).toString();
					String h2 = ha.get(1).toString();
					String h3 = ha.get(2).toString();
					JOptionPane.showMessageDialog(null,
							"Seus habilidades aprimoradas: " + h1 + "\n" + h2
									+ "\n" + h3, "IFBG", 2, joia);
				}
				Object[] ops = { "Continuar", "Sair", "Menu" };
				int ov = JOptionPane.showOptionDialog(null,
						"Parabens você venceu o duelo!", "IFBG",
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.WARNING_MESSAGE, joia, ops, ops[0]);
				JOptionPane.showMessageDialog(null,
						"Seus  atributos atuais são: " + np.toString());
				if (ov == 0) {
					cb = true;
				} else if(ov==1){
					System.exit(0);
				}
				else{
					menu(c, armas);
				}

			} else if (np.getVida() <= 0) {
				ImageIcon go = new ImageIcon(
						Main.class.getResource("img/gameover.png"));
				Object[] ops = { "Continuar", "Sair","Menu" };
				int ov = JOptionPane
						.showOptionDialog(
								null,
								"Infelizmente a gente não ganha todas"
										+ "\n"
										+ "Aperte continuar para tentar novamente"
										+ "\n"
										+ "OBS: O mostro pegou seus itens e metade do seu ouro ;-;",
								"IFBG", JOptionPane.DEFAULT_OPTION,
								JOptionPane.WARNING_MESSAGE, go, ops, ops[0]);
				if (ov == 0) {
					cb = true;
				} else if(ov==1) {
					System.exit(0);
				}
				else{
					menu(c, armas);
				}

			}

		}
	}
}
