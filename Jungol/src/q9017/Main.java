package q9017;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 개의 실수를 입력하시오. ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		sc.close();
		
		System.out.println(String.format("x = %.2f", a));
		System.out.println(String.format("y = %.2f", b));
		
		

	}

}
