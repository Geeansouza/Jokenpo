package joKenPo;

import java.util.Random;
import java.util.Scanner;

public class Pedra {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int nJogos;
		int cont = 1;
		int pontmaquina = 0;
		int pontusua = 0;
		int empate = 0;
		String resposta = "s";
		System.out.println("J O K E N P O");

		while (resposta.equalsIgnoreCase("s")) {

			cont = 0;
			nJogos = 0;

			System.out.println("Quantas partidas: (Apenas numeros impar)");
			nJogos = leitor.nextInt();

			while (nJogos % 2 == 0) {
				System.out.println("apenas valido numeros impar");
				nJogos = leitor.nextInt();
			}

			System.out.println("Pedra = 1");
			System.out.println("Papel = 2");
			System.out.println("Tesoura = 3");

			while (nJogos >= cont) { // loop partida
				Random joken = new Random();
				int nSorteado = joken.nextInt(3) + 1;

				int nUsuario;

				System.out.println("Escolha uma opção: ");
				nUsuario = leitor.nextInt();

				System.out.println("Numero sorteado pelo pc: " + nSorteado);
				System.out.println("Numero do Usuario: " + nUsuario);

				cont++;
				if (nUsuario >= 0 && nUsuario <= 3) {
					if (nSorteado == nUsuario) {
						System.out.println("Empate!! ");
						empate++;

					} else if ((nUsuario == 1 && nSorteado == 3) || (nUsuario == 2 && nSorteado == 1)
							|| (nUsuario == 3 && nSorteado == 2)) {
						System.out.println("Usuario Ganhou!! ");
						pontusua++;
					} else if (((nUsuario == 3 && nSorteado == 1) || (nUsuario == 1 && nSorteado == 2)
							|| (nUsuario == 2 && nSorteado == 3))) {
						System.out.println("Pc Ganhou!! ");
						pontmaquina++;
					}
				}
			}
			if (pontusua == pontmaquina) {
				System.out.println("vamos ");
				while (pontusua == pontmaquina) {
					Random joken = new Random();
					int nSorteado = joken.nextInt(3) + 1;

					int nUsuario;

					System.out.println("Escolha uma opção: ");
					nUsuario = leitor.nextInt();

					System.out.println("Numero sorteado pelo pc: " + nSorteado);
					System.out.println("Numero do Usuario: " + nUsuario);

					cont++;
					if (nUsuario >= 0 && nUsuario <= 3) {
						if (nSorteado == nUsuario) {
							System.out.println("Empate!! ");
							empate++;

						} else if ((nUsuario == 1 && nSorteado == 3) || (nUsuario == 2 && nSorteado == 1)
								|| (nUsuario == 3 && nSorteado == 2)) {
							System.out.println("Usuario Ganhou!! ");
							pontusua++;
						} else if (((nUsuario == 3 && nSorteado == 1) || (nUsuario == 1 && nSorteado == 2)
								|| (nUsuario == 2 && nSorteado == 3))) {
							System.out.println("Pc Ganhou!! ");
							pontmaquina++;
						}
					}

				}
			}

			System.out.println("*****************************************************");
			if (pontusua > pontmaquina) {
				System.out.println(" Você ganhou");
			} else if (pontusua < pontmaquina) {
				System.out.println("maquina ganhou");
			} else {
				System.out.println("Você empatou");
			}
			System.out.println("*****************************************************");

			pontusua = 0;
			pontmaquina = 0;
			System.out.println("você deseja jogar mais?(S/N)");
			resposta = leitor.next();
		}

		/*
		 * while (resposta.equals("s") || resposta.equals("S")) {
		 * 
		 * cont = 0; nJogos = 0;
		 * 
		 * System.out.println("Quantas partidas: (Apenas numeros impar)"); nJogos =
		 * leitor.nextInt();
		 * 
		 * System.out.println("Pedra = 1"); System.out.println("Papel = 2");
		 * System.out.println("Tesoura = 3");
		 * 
		 * while (nJogos >= cont) {
		 * 
		 * Random joken = new Random(); int nSorteado = joken.nextInt(3) + 1;
		 * 
		 * int nUsuario = 0;
		 * 
		 * System.out.println("Escolha uma opção: "); nUsuario = leitor.nextInt();
		 * 
		 * System.out.println("Numero sorteado pelo pc: " + nSorteado);
		 * System.out.println("Numero do Usuario: " + nUsuario);
		 * 
		 * cont++; if (nUsuario >= 0 && nUsuario <= 3) { if (nSorteado == nUsuario) {
		 * System.out.println("Empate!! "); empate++;
		 * 
		 * } else if ((nUsuario == 1 && nSorteado == 3) || (nUsuario == 2 && nSorteado
		 * == 1) || (nUsuario == 3 && nSorteado == 2)) {
		 * System.out.println("Usuario Ganhou!! "); pontusua++; } else if (((nUsuario ==
		 * 3 && nSorteado == 1) || (nUsuario == 1 && nSorteado == 2) || (nUsuario == 2
		 * && nSorteado == 3))) { System.out.println("Pc Ganhou!! "); pontmaquina++; } }
		 * }
		 * 
		 * }
		 * 
		 */
		System.out.println("muito obrigado por jogar");

		leitor.close();
	}

}
