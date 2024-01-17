package q9112;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println("입력받은 문자열의 길이는 " + str.length() + "입니다.");
		
		//String[] ar = new String[str.length()];
		String[] ar = str.split("");
		
		/*
		for (int i=0; i<ar.length; i++) {
			System.out.print(ar[i]);
		}
		*/

		for (int i=ar.length-1; i>=0; i--) {
			System.out.print(ar[i]);
		}
		
	}

}
