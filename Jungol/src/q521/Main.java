package q521;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a++;
		int d = --b;
		
		int e = c * d;
		
		System.out.print(a + " ");
		System.out.print(d + " ");
		System.out.print(e + " ");

	}

}
