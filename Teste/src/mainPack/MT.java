package mainPack;

public class MT implements Runnable {
	String ms = "S ";

	public void run() {
		this.ms = "N ";
	}

	public static void main(String[] args) {
		MT t = new MT();
		new Thread(t).start();
		for (int i = 0; i < 10; i++)
			System.out.print(t.ms);
	}
}
