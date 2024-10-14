package main;

import java.awt.EventQueue;

public class Main extends Thread{
	
	

    public static void main(String[] args) {
    	
    	
        System.out.println("Execu��o da Thread Iniciada");
        Main m = new Main();
        m.start();
        try {
        	
        m.join();      
        }
        catch(Exception e) {
        	System.out.println("Execu��o da Thread n�o foi inicializada");
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
