package questao6;

public class Main {
    public static void main(String[] args) {
    	args = new String[]{"5"}; // Define o valor diretamente
        try {
            // Verifica se foi passado algum argumento
            if (args.length == 0) {
                System.out.println("Erro: Nenhum argumento foi fornecido. Por favor, insira um número inteiro como argumento.");
                return; // Termina a execução do programa se nenhum argumento for passado
            }
            
            // Tenta converter o argumento para um número inteiro
            int n = Integer.parseInt(args[0]);
            
            // Exibe os números de 0 até n-1
            for (int i = 0; i < n; i++) {
                System.out.println(i);
            }
            
        } catch (NumberFormatException e) {
            // Tratamento para caso o argumento não seja um número inteiro válido
            System.out.println("Erro: O argumento fornecido não é um número inteiro válido.");
        } catch (Exception e) {
            // Tratamento genérico para qualquer outra exceção inesperada
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}

