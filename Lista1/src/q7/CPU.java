package q7;

public class CPU {
	private double x;

	public double calc(double ipi, double v1, double q1, double v2, double q2) {

		x = ((v1 * q1) + (v2 * q2)) * ((ipi / 100) + 1);

		return x;
	}
}
