import java.util.Scanner;

public class CambiaMonete {

	public static void main(String[] args) {

		int quantita, quantitaIniziale;
		final int mon50 = 50, mon20 = 20, mon10 = 10, mon5 = 5, mon2 = 2, mon1 = 1;
		int quantMon50, quantMon20, quantMon10, quantMon5, quantMon2, quantMon1;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("inserisci moneta");
		quantita = tastiera.nextInt();
		
		quantitaIniziale = quantita;
		
		quantMon50 = quantita / mon50;
		quantita = quantita % mon50;
		quantMon20 = quantita / mon20;
		quantita = quantita % mon20;
		quantMon10 = quantita / mon10;
		quantita = quantita % mon10;
		quantMon5 = quantita / mon5;
		quantita = quantita % mon5;
		quantMon2 = quantita / mon2;
		quantita = quantita % mon2;
		quantMon1 = quantita / mon1;
		quantita = quantita % mon1;
		
		System.out.println(quantitaIniziale);
		System.out.println("mon50 = " + quantMon50);
		System.out.println("mon20 = " + quantMon20);
		System.out.println("mon10 = " + quantMon10);
		System.out.println("mon5 = " + quantMon5);
		System.out.println("mon2 = " + quantMon2);
		System.out.println("mon1 = " + quantMon1);
		
		System.out.println("resto = " + quantita);
		
		tastiera.close();
	}

}
