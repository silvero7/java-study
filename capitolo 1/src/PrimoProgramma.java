import java.util.Scanner;

public class PrimoProgramma {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		
		int eco1, eco2, eco3;
		
		System.out.println("inserisci eco1:");
		eco1 = tastiera.nextInt();
		
		System.out.println("inserisci eco2:");
		eco2 = tastiera.nextInt();
		
		System.out.println("inserisci eco3:");
		eco3 = tastiera.nextInt();
		
		System.out.println("questa è la somma dei tre eco");
		System.out.println(eco1 + eco2 + eco3);		
		
		tastiera.close();

	}

}
