package q112;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int d = a / b;
		int e = a % b;
		
		System.out.println(a + " / " + b + " = " + d + "..." + e);

	}

}
