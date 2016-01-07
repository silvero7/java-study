import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Digita due numeri interi \n"
				+ "separati da uno o più spazi");
		
		int n1, n2;
		n1 = tastiera.nextInt();
		n2 = tastiera.nextInt();
		System.out.println("Hai digitato " + n1 + " e " + n2);
		
		System.out.println("Ora digita altri due numeri. \n"
				+ "E' ammesso anche il separatore decimale.");
		
		double d1, d2;
		d1 = tastiera.nextDouble();
		d2 = tastiera.nextDouble();
		System.out.println("Hai digitato " + d1 + " e " + d2);
		
		System.out.println("Ora digita due parole.");
		
		String s1, s2;
		s1 = tastiera.next();
		s2 = tastiera.nextLine();
		System.out.println("Hai digitato " + s1 + " e " + s2);
		
		String ss1,ss2;
		ss1 = tastiera.next();
		ss2 = tastiera.next();
		System.out.println("Hai digitato \"" +
			ss1 + "\" e " + ss2);
		tastiera.close();
	}

}
