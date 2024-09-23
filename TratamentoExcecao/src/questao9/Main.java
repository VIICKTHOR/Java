package questao9;

public class Main {
    public static void main(String[] args) {
        try {
            // Código que pode lançar exceções
            int resultado = 10 / 0; // Isto lançará uma ArithmeticException
            
        } catch (ArithmeticException a) {
            // Captura exceção aritmética específica
            System.out.println("Erro de divisão por zero: " + a.getMessage());
        } catch (Exception e) {
            // Captura qualquer outra exceção genérica
            System.out.println("Erro geral: " + e.getMessage());
        }
    }
}

