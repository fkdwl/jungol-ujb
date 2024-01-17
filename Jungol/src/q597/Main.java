package q597;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		sc.close();
		
		int size = a.length();
		int size2 = b.length();
		
		int sum = 0;
		int sum2 = 0;
		
		for(int i=1; i <= size; i++) {
			sum ++;
		}
		
		for(int k=1; k <= size2; k++) {
			sum2 ++;
		}
		
		System.out.println(sum + sum2);

	}

}
