package q6;

public class CPU {
	private double r;
	
	public void calculo(double x) {
		r=x;
		r=r+(x/100);
	}
	public double result() {
		return r;
	}
	
}
