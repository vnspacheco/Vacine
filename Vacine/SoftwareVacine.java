package Vacine;

import java.util.Scanner;

public class SoftwareVacine {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int menu, gestante, idade, profissao, regiao, comorbidade, vacina;
		String nome;

		System.out.println(
				"\nBem-vindo ao centro de informa��o da campanha de vacina��o da Covid19 do Estado de S�o Paulo\n");

		do {
			System.out.println("	=================================================================\r\n"
					+ "	|								|\r\n" + "	|								|\r\n"
					+ "	|	[1] Quando posso me vacinar				|\r\n"
					+ " 	|	[2] Informa��es sobre os tipos de vacinas		|\r\n"
					+ " 	|	[3] Informa��es legais					|\r\n"
					+ " 	|	[9] Sair do programa					|\r\n"
					+ "	|								|\r\n" + " 	|								|\r\n"
					+ "	=================================================================");
			System.out.print("\nEscolha a op��o > ");
			menu = ler.nextInt();

			if (menu == 1) {

				System.out.print("\nComo podemos te chamar? ");
				nome = ler.next();
				System.out.println("\nOl�, " + nome + "!");
				System.out.print("Informe sua idade: ");
				idade = ler.nextInt();

				do {
					System.out.print("\nInforme sua profiss�o:\r\n" + "\r\n" + "1 - �rea da sa�de\r\n"
							+ "2 - �rea da educa��o\r\n" + "3 - �rea da seguran�a p�blica\r\n"
							+ "4 - Transporte p�blico\r\n" + "5 - Outros\r\n" + "\r\n" + "> ");
					profissao = ler.nextInt();

					if (profissao != 1 && profissao != 2 && profissao != 3 && profissao != 4 && profissao != 5) {
						System.out.println("\nOp��o inv�lida, tente novamente.");
					}

				} while (profissao != 1 && profissao != 2 && profissao != 3 && profissao != 4 && profissao != 5);

				do {
					System.out.print("\nInforme sua Regi�o:\r\n" + "\r\n" + "1 - Grande S�o Paulo\r\n"
							+ "2 - Outros munic�pios\r\n" + "\r\n" + "> ");
					regiao = ler.nextInt();
					if (regiao != 1 && regiao != 2) {
						System.out.println("\nOp��o inv�lida, tente novamente.");
					}
				} while (regiao != 1 && regiao != 2);

				do {
					System.out.print("\nVoc� possui alguma comorbidade?\r\n" + "\r\n" + "1 - Sim\r\n" + "2 - N�o\r\n"
							+ "\r\n" + "> ");
					comorbidade = ler.nextInt();
					if (comorbidade != 1 && comorbidade != 2) {
						System.out.println("\nOp��o inv�lida, tente novamente.");
					}
				} while (comorbidade != 1 && comorbidade != 2);

				do {
					System.out.print("\nVoc� � gestante?\r\n" + "\r\n" + "1 - Sim\r\n" + "2 - N�o\r\n" + "\r\n" + "> ");
					gestante = ler.nextInt();
					if (gestante != 1 && gestante != 2) {
						System.out.println("\nOp��o inv�lida, tente novamente.");
					}
				} while (gestante != 1 && gestante != 2);

				System.out.println("\n" + nome + ",\n");

				if (idade >= 59 && idade >= 58) {
					System.out.println("Sua idade est� dentro do grupo j� liberado. ");
				}
				if (idade < 60 && comorbidade == 2 && profissao == 5 && gestante == 2) {
					System.out.println(
							"Atualmente sua idade n�o est� sendo vacinada, segue dados para proxima vacina��o. ");
				}
				if (idade < 18 && gestante == 2) {
					System.out.print("No momento n�o temos planejamento de vacina��o para menores de 18 anos. ");
				}
				if (profissao == 1) {
					System.out.print("Sua profiss�o est� em andamento com a vacina��o. ");
				}
				if (profissao == 2 && idade >= 18) {
					System.out.print("Sua profiss�o est� em andamento com a vacina��o, a partir dos 45 anos. ");
				}
				if (profissao == 3) {
					System.out.print("Sua profiss�o est� em andamento com a vacina��o. ");
				}
				if (profissao == 4 && idade >= 47) {
					System.out.print(
							"Sua profiss�o est� em andamento com a vacina��o. Consulte a tabela com as datas dispon�vel nas Informa��es Legais - op��o 3. ");
				}
				if (profissao == 5) {
					System.out.print(
							"No momento outras profiss�es n�o receberam a classifica��o de priorit�rios na lista. ");
				}
				if (regiao == 1) {
					System.out
							.println("Vacinas dispon�veis para a grande S�o Paulo: Astrazeneca, Pfizer e Coronavac. ");
				}
				if (regiao == 2) {
					System.out.println("Vacinas dispon�veis para outros munic�pios: Astrazeneca e Coronavac. ");
				}

				if (comorbidade == 1 && idade >= 18) {
					System.out.print("libera��o para todas as idades com comorbidade a partir dos 18 anos. ");
				}
				if (comorbidade == 2 && idade >= 18) {
					System.out.print(
							"Pessoas sem comorbidade ainda dever�o esperar pela data de sua faixa et�ria ou profiss�o. ");
				}
				if (idade >= 18 && gestante == 1) {
					System.out.print("Gestantes a partir de 18 anos e sem comorbidades j� podem se vacinar. ");
				}
				if (idade < 18 && gestante == 1) {
					System.out.print("Gestantes menores de 18 anos e sem comorbidades ainda n�o podem se vacinar.");
				}

				System.out.println(
						"\n-------------------------------------------------------------------------------------------------------------------------------------------------------\n");

			}

			else if (menu == 2) {
				System.out.println(
						"\n	=================================================================================================\r\n"
								+ "	|												|\r\n"
								+ "	|  	Vacinas dispon�veis para utiliza��o. Digite o n�mero correspondente � vacina desejada.	|\r\n"
								+ "	|												|\r\n"
								+ "	|	[1] Coronavac										|\r\n"
								+ "	|	[2] Pfizer										|\r\n"
								+ "	|	[3] Astrazeneca										|\r\n"
								+ "	|												|\r\n"
								+ "	|												|\r\n"
								+ "	=================================================================================================");
				System.out.print("\nEscolha a op��o > ");
				vacina = ler.nextInt();

				if (vacina == 1) {
					System.out.println("\nCoronaVac: V�rus inativado\r\n\n"
							+ "Vacina que cont�m o v�rus �morto� (inativado) da Covid-19 que ao entrar no organismo, gera uma resposta imunol�gica.\r\n"
							+ "� a forma mais comum de produzir vacinas.\r\n" + "\r\n"
							+ "O esquema vacinal completo � composto por duas doses. Conforme os estudos cl�nicos e indica��o na bula, o intervalo\r\n"
							+ "entre a primeira e a segunda deve ser de 14 a 28 dias para aplica��o da segunda dose. Os anticorpos devem ter n�veis\r\n"
							+ "adequados duas semanas ap�s a segunda dose. Por ser uma vacinanova, ainda n�o est� determinada a dura��o da resposta\r\n"
							+ "imune. O Butantan realiza estudos neste sentido. N�o foram registrados eventos adversos graves e de interesse especial\r\n"
							+ "ap�s aplica��o. O evento adverso mais comum observado durante os estudos cl�nicos foi dor no local da aplica��o.\r\n"
							+ "Algumas pessoas apresentam febre, dor muscular, n�usea e dor de cabe�a. \r\n" + "\r\n"
							+ "Como os vacinados demoram cerca de duas semanas para atingir n�veis adequados de prote��o ap�s a segunda dose, mesmo\r\n"
							+ "que vacinado, se voc� estiver infectado poder� transmitir o coronav�rus para outras pessoas.");
				} else if (vacina == 2) {
					System.out.println("\nPfizer: RNA Mensageiro\r\n\n"
							+ "Essa vacina n�o utiliza um v�rus, mas sim uma mol�cula, chamada de RNA. Esta mol�cula leva uma �mensagem� at� as \r\n"
							+ "c�lulas contendo todas as informa��es gen�ticas do v�rus. � uma esp�cie de �manual de instru��es� que �ensina� as \r\n"
							+ "c�lulas a criar uma defesa contra o v�rus. Por ter essa fun��o, ela � denominada de RNA mensageiro. \r\n"
							+ "\r\n"
							+ "O esquema vacinal � composto por duas doses. A segunda dose deve ser administrada 12 semanas ap�s a primeira, conforme\r\n"
							+ "determina��o do Minist�rio da Sa�de (o per�odo indicado na bula do fabricante � de 21 dias, mas no Brasil foi adotado\r\n"
							+ "o prazo de 12 semanas para ampliar a oferta da primeira dose na popula��o, com base em discuss�es t�cnicas). Os anticorpos\r\n"
							+ "devem  ter n�veis adequados 21 dias ap�s aplica��o da vacina. Por ser uma vacina nova, ainda n�o est� determinada a dura��o\r\n"
							+ "da resposta imune. As rea��es mais comuns que constam em bula s�o dor ou incha�o no local da inje��o, dor de cabe�a\r\n"
							+ "e/ou muscular e/ou na articula��o, cansa�o, diarreia, calafrios e febre. Rea��es menos comuns incluem vermelhid�o no\r\n"
							+ "local de inje��o, n�usea e v�mito. \r\n" + "\r\n"
							+ "Como os vacinados demoram cerca de duas semanas para atingir n�veis adequados de prote��o ap�s a segunda dose, mesmo\r\n"
							+ "que vacinado, se voc� estiver infectado poder� transmitir o coronav�rus para outras pessoas.");
				} else if (vacina == 3) {
					System.out.println("\nAstrazeneca: Adenov�rus n�o replicante\r\n\n"
							+ "Essa vacina possui um v�rus �vivo�, mas n�o � o coronav�rus, e sim o adenov�rus presente em chimpanz�s. Apesar de vivo,\r\n"
							+ "ele � inofensivo, pois n�o tem o poder de se multiplicar (replicar). Mesmo assim, o organismo - ao identificar o\r\n"
							+ "�corpo vivo� - projeta carga m�xima contra o intruso, o que explica o alto �ndice de rea��es adversas (como febre,\r\n"
							+ "calafrios e dores no corpo).\r\n" + "\r\n"
							+ "O esquema vacinal � composto por duas doses. A segunda dose deve ser administrada 12 semanas ap�s a primeira. Os\r\n"
							+ "anticorpos devem ter n�veis adequados duas semanas ap�s aplica��o da vacina. Por ser uma vacina nova, ainda n�o \r\n"
							+ "est� determinada a dura��o da resposta imune. As rea��es adversas mais frequentes reportadas nos estudos cl�nicos\r\n"
							+ "foram sensibilidade e/ou dor no local da inje��o, dor de cabe�a e/ou muscular e/ou na articula��o, fadiga, mal estar,\r\n"
							+ "febre, calafrios e n�usea. A maioria foi de intensidade leve a moderada e geralmente resolvida dentro de poucos dias\r\n"
							+ "ap�s a vacina��o.\r\n" + "\r\n"
							+ "Vacinas com mesmo pr�ncipio s�o as da Oxford e fiocruz.");
				}

				else {
					System.out.println("\nOp��o inv�lida, tente novamente.");
				}

				System.out.println(
						"\n-------------------------------------------------------------------------------------------------------------------------------------------------------\n");

			}

			else if (menu == 3) {
				System.out.println("\nTotal de vacinados com a primeira dose: 13.203.153");
				System.out.println("Total de vacinados com a segunda dose: 5.950.243");
				System.out.println("\n16 de junho a 8 de julho � 55 a 59 anos");
				System.out.println("9 a 19 de julho � 54 anos");
				System.out.println("20 de julho a 3 de agosto � 50 a 53 anos");
				System.out.println("4 a 18 de agosto � 45 a 49 anos");
				System.out.println("19 a 28 de agosto � 40 a 44 anos");
				System.out.println("29 de agosto a 7 de setembro � 35 a 39 anos");
				System.out.println("8 a 17 de setembro � 30 a 34 anos");
				System.out.println("18 a 27 de setembro - 25 a 29 anos");
				System.out.println("28 de setembro a 18 de outubro - 18 a 24 anos");
				System.out.println(
						"\n-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
			}

			else if (menu == 9) {
				System.out.println("\nObrigado por utilizar nosso programa, tenha um �timo dia.");
			} else {
				System.out.println("\nOp��o inv�lida, tente novamente.\n");
			}
		} while (menu != 9);

		ler.close();
	}
}