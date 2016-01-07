import java.util.Scanner;

public class esercizio1 {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		
		double numero1, numero2, prodotto, prodottoMeno;
		
		System.out.println("Digita il primo numero in virgola mobile.");
		numero1 = tastiera.nextDouble();
		
		numero2 = 1.0 / numero1;
		
		prodotto = numero1 * numero2;
		System.out.println("Il primo numero digitato è " + numero1 + "\n" 
				+ "Il secondo è " + numero2 + "\n"
				+"Il loro prodotto è " + prodotto);
		
		prodottoMeno = numero1 - prodotto;
		
		System.out.println("il risultato del primo numero meno il prodotto è " + prodottoMeno);
		
		tastiera.close();

	}

}
