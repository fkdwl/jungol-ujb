package q525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int[] ar = new int[3];
		int sum = 0;
		int sum1 = 0;
		
		for(int i=0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		
		for(int k=0; k<ar.length; k++) {
				if (ar[0] > ar[k]) {
					sum++;
					//System.out.println(sum);
				}
		}
		
		for(int k=0; k<ar.length; k++) {
			for(int h=0; h<ar.length; h++) {
				if (ar[k] == ar[h]) {
					sum1 ++;
				}
			}
		}
		
		
		//System.out.println(sum);
		//System.out.println(sum1);
		
		if (sum == ar.length - 1) {
			System.out.print(1 + " ");
		} else {
			System.out.print(0 + " ");
		}

		if (sum1 == 9) {
			System.out.print(1 + " ");
		} else {
			System.out.print(0 + " ");
		}
		
		
	}

}
