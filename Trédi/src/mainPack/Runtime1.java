package mainPack;

import java.util.Iterator;

public class Runtime1 extends Thread implements Runnable{
	int a=0;
	
	@Override
	public void run() {
		Thread t = new Thread();
		
		for(int i=0;i<1000;i++) {
			
			System.out.println(i+" - "+a);
			a = a+i;
		}	
	}
	
}
