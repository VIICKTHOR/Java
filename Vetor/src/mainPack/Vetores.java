package mainPack;

public class Vetores {

	public void q1() {

		int[] A = { 1, 3, 4, 5, 7 };
		int[] B = new int[A.length];
		
		B=A;

		System.out.print("Vetor A: ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
		System.out.print("\nVetor B: ");
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i]+" ");
		}
		
	}
	public void q2() {

		int[] A = { 1, 3, 4, 5, 7, 2, 9, 6 };
		int[] B = new int[A.length];
		
		for(int i=0;i<A.length;i++) {
			B[i]=A[i]*2;
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
		System.out.print("\nVetor B: ");
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i]+" ");
		}
		
	}
	public void q3() {

		int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		int[] B = new int[A.length];
		
		for(int i=0;i<A.length;i++) {
			B[i]=A[i]*A[i];
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
		System.out.print("\nVetor B: ");
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i]+" ");
		}
		
	}
	public void q4() {

		double[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		double[] B = new double[A.length];
		
		for(int i=0;i<A.length;i++) {
			B[i]= Math.sqrt(A[i]);
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
		System.out.print("\nVetor B: ");
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i]+" ");
		}
		
	}
	public void q5() {

		int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] B = new int[A.length];
		
		for(int i=0;i<A.length;i++) {
			B[i]=A[i]*i;
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
		System.out.print("\nVetor B: ");
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i]+" ");
		}
		
	}
	public void q6() {

		int[] A = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int[] B = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		int[] C = new int[(A.length+B.length)/2];
		
		for(int i=0;i<C.length;i++) {
			C[i]=A[i]+B[i];
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
		System.out.print("\nVetor B: ");
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i]+" ");
		}
		System.out.print("\nVetor C: ");
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i]+" ");
		}
		
	}
	public void q7() {

		int[] A = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int[] B = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		int[] C = new int[(A.length+B.length)/2];
		
		for(int i=0;i<C.length;i++) {
			C[i]=A[i]-B[i];
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
		System.out.print("\nVetor B: ");
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i]+" ");
		}
		System.out.print("\nVetor C: ");
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i]+" ");
		}
		
	}
	public void q8() {

		int[] A = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int[] B = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		int[] C = new int[(A.length+B.length)/2];
		
		for(int i=0;i<C.length;i++) {
			C[i]=A[i]*B[i];
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
		System.out.print("\nVetor B: ");
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i]+" ");
		}
		System.out.print("\nVetor C: ");
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i]+" ");
		}
		
	}
}
