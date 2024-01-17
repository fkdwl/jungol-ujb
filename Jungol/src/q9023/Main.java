package q9023;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a == b) {
			System.out.print(1 + " ");
		} else if (a != b) {
			System.out.print(0 + " ");
		}
		
		if (b == c) {
			System.out.print(1 + " ");
		} else if (b != c) {
			System.out.print(0 + " ");
		}

		
		if (a == b) {
			System.out.print(0 + " ");
		} else if (a != b) {
			System.out.print(1 + " ");
		}
		
		if (b == c) {
			System.out.print(0 + " ");
		} else if (b != c) {
			System.out.print(1 + " ");
		}
		
		
		
	}

}
