package q123;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number? ");

		int a = sc.nextInt();
		sc.close();
		
		if(a == 1) {
			System.out.println("dog");
		} else if(a == 2) {
			System.out.println("cat");
		} else if(a == 3) {
			System.out.println("chick");
		} else {
			System.out.println("I don't know.");
		}
		

	}

}
