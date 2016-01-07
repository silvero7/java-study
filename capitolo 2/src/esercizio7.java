
public class esercizio7 {

	public static void main(String[] args) {
		//esercizi 7-8
		String ciao = "Ciao, mio caro!", prima, seconda;
		
		 int ciaoIntPrima = ciao.indexOf("Ciao");
		 
		 int ciaoIntSeconda = ciao.indexOf("mio");
		 
		 prima = ciao.substring(ciaoIntPrima, 4);
		 
		 seconda = ciao.substring(ciaoIntSeconda, 9);
		 
		 System.out.println(prima + " " + seconda);
		 System.out.println(ciaoIntPrima + " " + ciaoIntSeconda);
		 
		 //esecizi 9
		 System.out.println("\"\tTest\\\\\rIt\'");
		 System.out.println("\"\tTest\\\\\nIt\'");
		 
		 //esercizio 10
		 System.out.println("\"uno\"\n\"due\"\n\"tre\"");		

	}

}
