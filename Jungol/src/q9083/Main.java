package q9083;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		System.out.println("10큰수 : " + (n + 10));
		System.out.println("10작은수 : " + (n - 10));

	}

}
