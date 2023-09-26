package q632;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		int big, middle, small;
		
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		sc.close();
		
		big = (num1>num2)&&(num1>num3)?num1:(num3>num2?num3:num2);
		small = (num2>num1)&&(num3>num1)?num1:(num2>num3?num3:num2);
		middle = (num1+num2+num3)-big-small;
		
		System.out.println(small);
		
		
	}

}
