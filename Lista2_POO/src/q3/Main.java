package q3;

public class Main {
	public static void main(String[] args) {

		int[][] matriz = new int[((int) (Math.random() * 5))+1][((int) (Math.random() * 5))+1]; // gera uma matriz de até 5 linhas e  5 colunas de forma aleatoria

		for (int line = 0; line < matriz.length; line++) { //gera valores pra  matriz aleatoria

			for (int col = 0; col < matriz[line].length; col++) {
				
				matriz[line][col]=(int)(Math.random()*20);
			}	
		}

		for (int line = 0; line < matriz.length; line++) {

			Thread t = new Thread(new SomaLinhas(matriz[line]));
			t.start();
		}

	}
}
