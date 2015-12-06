
public class Test {

	public static void main(String[] args) {
		
		Portafoglio chrisPortafoglio = new Portafoglio(5, "Chris");
		Portafoglio feliPortafoglio = new Portafoglio(10, "Feliciano");
		System.out.println(feliPortafoglio.conto);
		
		feliPortafoglio.aumenta(10);
		System.out.println(feliPortafoglio.getConto());
		
		System.out.println(Portafoglio.getNumPortafogli());
		
	}

}
