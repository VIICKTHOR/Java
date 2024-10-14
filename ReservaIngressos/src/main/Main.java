package main;

import java.awt.EventQueue;

public class Main extends Thread{
	
	

    public static void main(String[] args) {
    	
    	
        System.out.println("Execução da Thread Iniciada");
        Main m = new Main();
        m.start();
        try {
        	
        m.join();      
        }
        catch(Exception e) {
        	System.out.println("Execução da Thread não foi inicializada");
        }
        
    }
    
    @Override
    public void run() {
    	EventQueue.invokeLater(() -> {
            try {
                TelaInicial frame = new TelaInicial();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    
    public static void fim() {
    	System.out.println("Compra Realizada!!");
    }
}
