package q615;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String B = sc.next();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		System.out.println(A + " " + a + " " + b);
		System.out.println(B + " " + c + " " + d);
		System.out.println("avg " + ((a + c)/2) + " " + ((b + d)/2));
		

	}

	

}
