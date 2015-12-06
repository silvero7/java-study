public class Portafoglio {
	
	double conto;
	String proprietario;
	
	static int numPortafogli = 0;
	
	
	public Portafoglio(double c, String p){
		this.conto = c;
		this.proprietario = p;
		numPortafogli = numPortafogli + 1;
	}
	
	
	public void aumenta(double soldi){
		this.conto = conto + soldi;
	}
	
	public double getConto(){
		return this.conto;
	}
	
	
	public static int getNumPortafogli(){
		return numPortafogli;
	}
	
}
