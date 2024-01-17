package q9114;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			char str = sc.next().charAt(0);
			
			if (Character.isLowerCase(str)) {
				System.out.println("소문자입니다.");
			} else if (Character.isUpperCase(str)) {
				System.out.println("대문자입니다.");
			} else if (Character.isLetterOrDigit(str) == true) {
				System.out.println("숫자문자입니다.");
			} else {
				System.out.println("영문, 숫자 이외의 문자입니다.");
				break;
			}
			
		}

	}


}
