public class esercizio4 {

	public static void main(String[] args) {
		
		int u = 2, v = 3, w = 5, x = 7, y = 11;
		int A, B, C;
		A = u + v * w + x;
		B = u + y % v * w + x;
		C = u++ / v + u++ * w;
		
		System.out.println(A + "\n" 
							+ B + "\n" 
								+ C);
		

	}

}
