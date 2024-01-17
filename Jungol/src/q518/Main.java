package q518;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		System.out.println("sum : " + (a + b + c));
		System.out.println("avg : " + ((a + b + c)/3));
		
		
		/* 다른 풀이1
		int[] inp = new int[3];
		
		for (int i=0; i<inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();
		
		int sum = 0;
		for (int i=0; i<inp.length; i++) {
			sum += inp[i];
		}
		
		System.out.println("sum : " + sum);
		int avg = sum / 3;
		System.out.println("avg : " + avg);
		*/
	}

}
