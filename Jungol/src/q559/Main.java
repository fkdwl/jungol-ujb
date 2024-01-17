package q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		double [] ar = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
	
			int q = sc.nextInt();	
			int w = sc.nextInt();	
			
			sc.close();
			
			System.out.println(ar[q - 1] + ar[w - 1]);
	
	}

}
