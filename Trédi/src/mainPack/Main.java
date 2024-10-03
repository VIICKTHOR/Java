package mainPack;

public class Main {
	public static void main(String[] args) {
		
		Thread[] t = new Thread[3];
		for(int i=0;i<t.length;i++) {
			
		t[i] = new Thread(new Runtime1());
		
		}
		
		for(int i = 0;i<t.length;i++) {
			t[i].run();
		}
		
	}
}
