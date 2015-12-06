import java.util.Scanner;

public class compleanno {

	public static void main(String[] args) {
		
	Scanner tastiera = new Scanner(System.in);	
	
	int anno;
	
	System.out.println("inserisci l'anno di nascita");
	
	anno = tastiera.nextInt();
	
	System.out.println("festeggerai 50 anni nel:");
	System.out.println(anno + 50);
	
	tastiera.close();
	
	}

}
