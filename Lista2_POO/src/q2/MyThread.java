package q2;

public class MyThread implements Runnable {

	private int x;
	private int contDivisor = 0;

	public MyThread(int x) {
		this.x = x;
	}

	@Override
	public void run() {

		for (int i = 0; i < 1000; i++) {
			contDivisor = 0;

			for (int j = 1; j <= (x + i); j++) {

				if ((x + i) % j == 0) {
					contDivisor++;
				}
			}

			if (contDivisor == 2) {
				System.out.println(x + i);
			}
		}

	}

}
