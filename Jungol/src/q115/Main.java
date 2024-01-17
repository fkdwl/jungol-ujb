package q115;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] ar1 = new int[2];
		int[] ar2 = new int[2];
		
		for (int i=0; i<ar1.length; i++) {
			ar1[i] = sc.nextInt();
		}
		
		for (int i=0; i<ar2.length; i++) {
			ar2[i] = sc.nextInt();
		}
		
		/*
		System.out.println(ar1[0]);
		System.out.println(ar1[1]);
		System.out.println(ar2[0]);
		System.out.println(ar2[1]);
		*/
		
		if (ar1[0] > ar2[0] && ar1[1] > ar2[1]) {
			System.out.println("1");
		} else if (ar1[0] <= ar2[0] || ar1[1] <= ar2[1]) {
			System.out.println("0");
		}
		sc.close();
		
		
		
	}

}
