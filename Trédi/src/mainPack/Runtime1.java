package mainPack;

import java.util.Iterator;

public class Runtime1 implements Runnable{
	int a=0;
	
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			
			System.out.println(i+" - "+a);
			a = a+i;
		}	
	}
	
}
