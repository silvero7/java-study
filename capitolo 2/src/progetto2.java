import java.util.Scanner;

public class progetto2 {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci due stringhe");
		String prima = tastiera.nextLine();
		String seconda = tastiera.next();
		int lung_prima = prima.length();
		int lung_seconda = seconda.length();
		
		System.out.println("la prima stringa di " + lung_prima + " caratteri è: " + prima + 
				"\n" + "la seconda stringa di " + lung_seconda + " caratteri è: " + seconda);
		
		String spazio = " ";
		String unione1 = prima.concat(spazio);
		String unione2 = unione1.concat(seconda);
		int lung_unione2 = unione2.length();
		
		System.out.println("La terza stringa unione di caratteri " + lung_unione2 + " è: " + unione2);
		
		tastiera.close();
		
	}

}
