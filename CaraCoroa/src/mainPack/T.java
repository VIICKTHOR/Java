package mainPack;

import java.util.Random;

public class T implements Runnable{
	private String nome;
	public static String ultimoPrint;
	
	public T(String nome) {
		this.nome=nome;
	}
	
	@Override
	public synchronized void run() {
		try {
			
			Thread.sleep((int)(Math.random()*300));
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(nome);
	}

}
