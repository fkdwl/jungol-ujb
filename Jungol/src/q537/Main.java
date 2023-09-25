package q537;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/* 오답
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		int sum = 0;
		int i = 1;

		while (i <= a) {

			sum += i;
			i++;
			System.out.print(sum);
	 	}
			
		*/
		
		//정답
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		int sum = 0;
		int i = 1;
			
			while (i <= a) {
				sum = sum + i; //sum += i;
				i++;
			}
			System.out.print(sum);

		
	}

}
