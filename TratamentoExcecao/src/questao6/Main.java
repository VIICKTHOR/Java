package questao6;

public class Main {
    public static void main(String[] args) {
    	args = new String[]{"5"}; // Define o valor diretamente
        try {
            // Verifica se foi passado algum argumento
            if (args.length == 0) {
                System.out.println("Erro: Nenhum argumento foi fornecido. Por favor, insira um n�mero inteiro como argumento.");
                return; // Termina a execu��o do programa se nenhum argumento for passado
            }
            
            // Tenta converter o argumento para um n�mero inteiro
            int n = Integer.parseInt(args[0]);
            
            // Exibe os n�meros de 0 at� n-1
            for (int i = 0; i < n; i++) {
                System.out.println(i);
            }
            
        } catch (NumberFormatException e) {
            // Tratamento para caso o argumento n�o seja um n�mero inteiro v�lido
            System.out.println("Erro: O argumento fornecido n�o � um n�mero inteiro v�lido.");
        } catch (Exception e) {
            // Tratamento gen�rico para qualquer outra exce��o inesperada
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}

