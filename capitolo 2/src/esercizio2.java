import java.util.Scanner;

public class esercizio2 {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		
		byte num3;
		int num2;
		double num1;
		
		System.out.println("inserisci il valore double di num1");
		num1 = tastiera.nextDouble();
		
		num2 = (int)num1;
	
		
		System.out.println("valore di num1: " + num1);
		System.out.println("valore di num2: " + num2);
		
		num3 = (byte)num1;
		
		System.out.println("valore di num1: " + num1);
		System.out.println("valore di num3: " + num3);
		
		tastiera.close();

	}

}
