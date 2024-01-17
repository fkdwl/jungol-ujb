package q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// 방법1.
		String str = sc.next();
		int size = str.length();
		
		for(int i=0; i<size; i++) {
			char c = str.charAt(i);
			if ('A' <= c && c <= 'Z') {
				System.out.print(c);
			} else if ('a' <= c && c <= 'z') {
				System.out.print((char)(c - 32));
			}
		}
		
		// 방법2.
		for (int i=0; i<size; i++) {
			char c = str.charAt(i);
			if(Character.isAlphabetic(c)) {
				System.out.print(Character.toUpperCase(c));
			}
		}
		System.out.print(false);

		sc.close();
	}

}
