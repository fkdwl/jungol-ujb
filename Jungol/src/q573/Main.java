package q573;

import java.util.Scanner;

public class Main {
	
	/* 방법1
	public static void rectange(int n) {
		int num = 1;
		for(int i=0; i<n; i++) {
			for(int j=0; i<n; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
		
	}
	*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		// 방법1.
		//rectange(n);
		
		int[] ar = new int[n * n];
		int sum = 1;
		
		//System.out.print(ar.length);
		
		for(int i=0; i<ar.length; i++) {
				ar[i] = sum;
				System.out.print(ar[i] + " ");
				if(ar[i] % n == 0) {
					System.out.println();
				}
				sum++;	
		}

	}

}
