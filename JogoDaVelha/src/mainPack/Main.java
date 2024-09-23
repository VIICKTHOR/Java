package mainPack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[][] arei = { { 3, 3, 3 }, { 3, 3, 3 }, { 3, 3, 3 } };

		for (int x = 0; x < 9; x++) {
			limpatela();
			for (int i = 0; i < 3; i++) {

				System.out.println("\n");
				for (int p = 0; p < 3; p++) {

					System.out.print("|");
					if (arei[i][p] == 1) {
						System.out.print(" X ");
					} else if (arei[i][p] == 2) {
						System.out.print(" O ");
					} else {
						System.out.print("   ");
					}

				}
				System.out.print("|");
			}
			verifica(arei);
			System.out.println("\nEscolha onde Marcar");
			System.out.println("Linha: ");
			int escolhaL = s.nextInt() - 1;
			System.out.println("Coluna: ");
			int escolhaC = s.nextInt() - 1;
			System.out.println("(1 para X e 2 para O)");
			int escolhaXO = s.nextInt();
			arei[escolhaL][escolhaC] = escolhaXO;
		}

	}

	public static void limpatela() {
		System.out.println(
				"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}

	public static void verifica(int[][] a) {
		int c=0;
		boolean b = false;
		if (a[0][0] == a[0][1] && a[0][1] == a[0][2] && a[0][0]!=3) {
			c = a[0][0];
			b = true;
		}
		if (a[1][0] == a[1][1] && a[1][1] == a[1][2] && a[1][0]!=3) {
			c = a[1][0];
			b = true;
		}
		if (a[2][0] == a[2][1] && a[2][1] == a[2][2] && a[2][0]!=3) {
			c = a[2][0];
			b = true;
		}

		if (a[0][0] == a[1][0] && a[1][0] == a[2][0] && a[0][0]!=3) {
			c = a[0][0];
			b = true;
		}
		if (a[0][1] == a[1][1] && a[1][1] == a[2][1] && a[0][1]!=3) {
			c = a[0][1];
			b = true;
		}
		if (a[0][2] == a[1][2] && a[1][2] == a[2][2] && a[0][2]!=3) {
			c = a[0][2];
			b = true;
		}

		if (a[0][0] == a[1][1] && a[1][1] == a[2][2] && a[0][0]!=3) {
			c = a[0][0];
			b = true;
		}
		if (a[0][2] == a[1][1] && a[1][1] == a[2][0] && a[0][2]!=3) {
			c = a[0][2];
			b = true;
		}

		if (b == true && c ==1) {
			System.out.println("\nAcabou, o jogador X ganhou");
			System.exit(0);
		}
		if (b == true && c ==2) {
			System.out.println("\nAcabou, o jogador O ganhou");
			System.exit(0);
		}

	}

}
