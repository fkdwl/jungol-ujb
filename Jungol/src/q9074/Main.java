package q9074;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;
		int sum6 = 0;
		int sum7 = 0;
		int sum8 = 0;
		int sum9 = 0;
		int sum10 = 0;
		
		while (true) {
			
			int a = sc.nextInt();
			
			if (a == 1) {
				sum1++;
			} else if (a == 2) {
				sum2++;
			} else if (a == 3) {
				sum3++;
			} else if (a == 4) {
				sum4++;
			} else if (a == 5) {
				sum5++;
			} else if (a == 6) {
				sum6++;
			} else if (a == 7) {
				sum7++;
			} else if (a == 8) {
				sum8++;
			} else if (a == 9) {
				sum9++;
			} else if (a == 10) {
				sum10++;
			}
			
			if (a < 1 || a > 10) {
				break;
			}
			
		}
		
		if (sum1 != 0) {
			System.out.println("1 : " + sum1 + "개");
		} 
		if (sum2 != 0) {
			System.out.println("2 : " + sum2 + "개");
		} 
		if (sum3 != 0) {
			System.out.println("3 : " + sum3 + "개");
		} 
		if (sum4 != 0) {
			System.out.println("4 : " + sum4 + "개");
		} 
		if (sum5 != 0) {
			System.out.println("5 : " + sum5 + "개");
		} 
		if (sum6 != 0) {
			System.out.println("6 : " + sum6 + "개");
		} 
		if (sum7 != 0) {
			System.out.println("7 : " + sum7 + "개");
		} 
		if (sum8 != 0) {
			System.out.println("8 : " + sum8 + "개");
		} 
		if (sum9 != 0) {
			System.out.println("9 : " + sum9 + "개");
		} 
		if (sum10 != 0) {
			System.out.println("10 : " + sum10 + "개");
		} 
		
		
	}

}
