package q111;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] ar = new int[4];
		int sum = 0;

		for(int i=0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
			sum += ar[i];
		}
		
		System.out.println("sum " + sum);
		System.out.println("avg " + (sum / ar.length));
		
	}

}
