package q7;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Entrada entry = new Entrada();
		CPU c = new CPU();

		double[] cod, valor, quant;// vetores para salvar os dados
		cod = new double[2];
		valor = new double[2];
		quant = new double[2];

		double ipi = entry.entrada("Insira o valor do IPI");

		cod[0] = entry.entrada("Digite o Código do Produto 1");
		valor[0] = entry.entrada("Qual o valor do produto 1");
		quant[0] = entry.entrada("Quantas unidades do produto 1");

		cod[1] = entry.entrada("Digite o Código do Produto 2");
		valor[1] = entry.entrada("Qual o valor do produto 2");
		quant[1] = entry.entrada("Quantas unidades do produto 2");

		entry.saida(c.calc(ipi, valor[0], quant[0], valor[1], quant[1])); // saida com o codigo de processamento da
																			// classe CPU

	}
}
