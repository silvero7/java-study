import java.util.Scanner;

public class CestiniUova2 {

	public static void main(String[] args) {
		
		int numeroDiCestini, uovaPerCestino, totaleUova;
		
		Scanner tastiera = new Scanner(System.in);
		System.out.println("inserisci il numero uova per ogni cestino:");
		uovaPerCestino = tastiera.nextInt();
		System.out.println("Inserisci il numero di cestini:");
		numeroDiCestini = tastiera.nextInt();
		
		totaleUova = uovaPerCestino * numeroDiCestini;
		
		System.out.println("Se hai");
		System.out.println(uovaPerCestino + " uova per cestino e");
		System.out.println(numeroDiCestini + " cestini");
		System.out.println("il numero totale di uova è " + totaleUova + ".");
		
		System.out.println("Rimuoviamo ora due uova da ciascun cestino.");
		
		uovaPerCestino = uovaPerCestino - 2;
		totaleUova = uovaPerCestino * numeroDiCestini;
		
		System.out.println("Ora hai");
		System.out.println(uovaPerCestino + " uova per cestino e");
		System.out.println(numeroDiCestini + " cestini.");
		System.out.println("Il nuovo numero di uova per cestino è " + totaleUova);
		
		tastiera.close();
		
	}

}
