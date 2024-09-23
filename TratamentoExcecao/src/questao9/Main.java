package questao9;

public class Main {
    public static void main(String[] args) {
        try {
            // C�digo que pode lan�ar exce��es
            int resultado = 10 / 0; // Isto lan�ar� uma ArithmeticException
            
        } catch (ArithmeticException a) {
            // Captura exce��o aritm�tica espec�fica
            System.out.println("Erro de divis�o por zero: " + a.getMessage());
        } catch (Exception e) {
            // Captura qualquer outra exce��o gen�rica
            System.out.println("Erro geral: " + e.getMessage());
        }
    }
}

