package mainPack;

import java.util.Scanner;

public class Main {

	public static int randInt(int min, int max) {
		java.util.Random rand = new java.util.Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;

	}

	public static void main(String[] args) {

		int entrada, x;
		String sEntrada = "";
		String sX = "";

		Scanner s = new Scanner(System.in);

		System.out.println(
				"Pedra, Papel ou Tesoura!!\n" + "Insira o valor 1 para Pedra, 2 para Papel e 3 para Tesoura: ");
		entrada = s.nextInt();
		s.close();

		switch (entrada) {
		case 1:
			sEntrada = "Pedra";
			break;
		case 2:
			sEntrada = "Papel";
			break;
		case 3:
			sEntrada = "Tesoura";
			break;
		}

		x = randInt(1, 3);

		switch (x) {
		case 1:
			sX = "Pedra";
			break;
		case 2:
			sX = "Papel";
			break;
		case 3:
			sX = "Tesoura";
			break;
		}

		System.out.println("Você escolheu " + sEntrada + " e o computador escolheu " + sX);

		if (entrada == x) {
			System.out.println("Empatou!!");

		} else if ((entrada == 1 && x == 3) || (entrada == 2 && x == 1) || (entrada == 3 && x == 2)) {
			System.out.println("Você ganhou :)");

		} else
			System.out.println("Você Perdeu :(");

	}
}
