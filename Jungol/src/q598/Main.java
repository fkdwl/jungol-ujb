package q598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		char a = 'A';
		char z = 'Z';
		char x = 'a';
		char y = 'z';
		
		System.out.printf("%d\n", (int) a);
		System.out.printf("%d\n", (int) z);
		System.out.printf("%d\n", (int) x);
		System.out.printf("%d\n", (int) y);
		*/
		
		while(true) {
			
			char str = sc.next().charAt(0);
			
			
			/* 이렇게도 가능
			if(Character.isAlphabetic(str)) {
				System.out.println(str);
			}else if (Character.isDigit(str)) {
				System.out.printf("%d\n", (int)str);
			} else {
				break;
			}
			*/
			
			
			if (str >= 65 & str <= 90 | str >= 97 & str <= 122) {
				System.out.println(str);
			} else if (str >= 48 & str <= 57 ) {
				System.out.printf("%d\n", (int)str);
			} else {
				break;
			}
			
		}
		sc.close();
		
			
	}

}
