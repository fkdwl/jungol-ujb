package q9033;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요. ");

		int a = sc.nextInt();
		sc.close();
		
		if (a>=90) {
			System.out.println("A");
		} else if (a>=80) {
			System.out.println("B");
		} else if (a>=70) {
			System.out.println("C");
		} else if (a>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
