package q4;

public class Main {

	public static void main(String[] args) {
		Saida s = new Saida();
		
		double num[] = {8,9,7,4,5,6}; // criando os valores para contas
		
		double media1 = (num[0]+num[1]+num[2])/3; //primeira media
		String s1 = String.valueOf(media1); // tranformação das mesmas pra string para prdoublear no JOption
		
		s.imprimir("A média de 8,9,7 é "+s1, "Média 1"); //prdouble na janela
		
		double media2 = (num[3]+num[4]+num[5])/3;  //mesmo processo porem com outros números
		String s2 = String.valueOf(media2);
		
		s.imprimir("A média de 4,5,6 é "+s2, "Média 2");
		
		double somaMedia= media1+media2;					//somando as medias
		String sSoma = String.valueOf(somaMedia);		//transformando em string para o JOption
		
		s.imprimir("A soma das médias é "+sSoma, "Soma das Médias");
		
		double mediaMedias= somaMedia/2;
		String mMedia = String.valueOf(mediaMedias);
		
		s.imprimir("A média das médias é "+mMedia, "Média das Médias");
	}

}
