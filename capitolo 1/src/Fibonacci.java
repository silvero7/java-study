import java.util.Scanner;

public class Fibonacci {
	
	public static int fibonacci(int n){
		
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	
	
	public static void main(String[] args){
		
		System.out.println(fibonacci(5));
		
		
		Scanner in = new Scanner (System.in);
		int primo = in.nextInt();
		
		if (primo % 2 == 0){
			System.out.println("PARI");
		}else{
			System.out.println("DISPARI");
		}
		in.close();
		
	}
	
}
