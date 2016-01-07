import java.util.Scanner;

public class esercizio3 {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		
		int num3, num4;
		double num1, num2;
		
		System.out.println("inserisci il valore double di num1: ");
		num1 = tastiera.nextDouble();
		
		num2 = num1 % 2.0;
		
		System.out.println("il valore di num1 è: " + num1 + "\n" +
							"il valore di num2 è: " + num2);
		
		num3 = (int)num1;
		num4 = num3 % 2;
		
		System.out.println("il valore di num1 è: " + num1 + "\n"
							+ "il valore di num3 è: " + num3 + "\n" 
							+ "il valore di num4 è: " + num4);
		
		tastiera.close();

	}

}
