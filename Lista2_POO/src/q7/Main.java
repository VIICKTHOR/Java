package q7;

public class Main {

	public static void main(String[] args) {

		metodo01();
		metodo02();
		metodo03();
	}

	public static void metodo01() {
		try {
			Class.forName("Classe que não existe");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}

	public static void metodo02() {
		try {
			java.io.File.createTempFile("pre", "suf");
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
	}

	public static void metodo03() {
		try {
			Integer.class.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			System.out.println(e);
		}
	}
}
