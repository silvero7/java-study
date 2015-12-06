import java.util.Scanner;


public class hello {

	public static void main(String[] args) {
		
		String i = "ciao";
		System.out.println(i);
		
		int eta;
		eta = 32;
		System.out.println("La mia età è:");
		System.out.println(eta);
		System.out.println("3");
		System.out.println("2");
		System.out.println("1");
		
		Scanner tastiera = new Scanner(System.in);
		
		int eco1, eco2;
		
		System.out.println("inserisci eco1");

		eco1 = tastiera.nextInt();
		
		System.out.println("inserisci eco2");

		
		eco2 = tastiera.nextInt();
		
		System.out.println("Questa è la somma di eco1 + eco2");
		System.out.println(eco1 + eco2);
		
		tastiera.close();
		
	}

}
