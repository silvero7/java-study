import java.util.Scanner;

public class intervallo {

	public static void main(String[] args) {
		
		int n, nn;
		Scanner tastiera = new Scanner(System.in);
		System.out.println("inserisci due num interi in ordine crescente");
		n = tastiera.nextInt();
		nn = tastiera.nextInt();
		System.out.println(nn - n - 1);
		tastiera.close();
	}

}
