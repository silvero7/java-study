import java.util.Scanner;

public class progetto1 {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		System.out.println("inserisci tre numeri interi");
		int primo = tastiera.nextInt();
		int secondo = tastiera.nextInt();
		int terzo = tastiera.nextInt();
		int media = (primo + secondo + terzo) / 3;
		System.out.println("la media dei tre numeri inseriti è: " + media);
		tastiera.close();
		
	}

}
