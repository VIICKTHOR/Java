package questao7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        boolean entradaValida = false;
        double x = 0;
        double y = 0;

        System.out.println("Eu sei somar!");

        // Leitura e validação do primeiro valor
        while (!entradaValida) {
            try {
                System.out.print("Informe o primeiro valor: ");
                x = Double.parseDouble(teclado.readLine());
                entradaValida = true; // Valor válido, sai do loop
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número válido.");
            } catch (IOException e) {
                System.out.println("Erro de entrada/saída. Tente novamente.");
            }
        }

        entradaValida = false; // Reset para o segundo valor

        // Leitura e validação do segundo valor
        while (!entradaValida) {
            try {
                System.out.print("Informe o segundo valor: ");
                y = Double.parseDouble(teclado.readLine());
                entradaValida = true; // Valor válido, sai do loop
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número válido.");
            } catch (IOException e) {
                System.out.println("Erro de entrada/saída. Tente novamente.");
            }
        }

        // Exibe o resultado da soma
        System.out.println("O resultado da soma é " + (x + y));
    }
}

