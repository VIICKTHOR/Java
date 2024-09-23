package questao8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        
        try {
            // Tenta abrir o arquivo para leitura
            reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha;
            
            // Lê o arquivo linha por linha
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
            
        } catch (IOException e) {
            // Captura e trata exceções de I/O, como o arquivo não encontrado
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            // Fecha o arquivo se foi aberto
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Erro ao fechar o arquivo: " + e.getMessage());
                }
            }
        }
    }
}

