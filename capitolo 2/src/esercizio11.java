import java.util.Scanner;

public class esercizio11 {

	public static void main(String[] args) {
		
		//esercizio 11 senza il problema di nextInt \n
		
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci un intero");
		int n = tastiera.nextInt();
		tastiera.nextLine();
		System.out.println("Inserisci una stringa");
		String s = tastiera.nextLine();
		System.out.println("n è " + n);
		System.out.println("s è " + s);
		tastiera.close();
		
	}

}
