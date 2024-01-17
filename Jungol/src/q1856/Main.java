package q1856;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		/*
		int[] ar = new int[n*m];
		
		int sum = 1;
		
		for(int i=0; i<ar.length; i++) {
		
			ar[i] = sum;
			System.out.print(ar[i] + " ");
			
			
			if(i >= m && i <= (m*2-1)) {
				for(int k=m; k>=1; k--) {
					System.out.print((ar[i] + k) + " ");
				}
			}
				
			if (ar[i] % m == 0) {
				System.out.println();
			}

			sum++;
		}
		
		System.out.print(n + " " + m);
		*/
		
		int[][] ar = new int[n][m];
		
		int num=1;
		for (int i =0; i < ar.length; i++) {
			if(i % 2 == 0) {
				for (int j = 0; j < ar[i].length; j++) {
					ar[i][j] = num++;
				}
			} else {
				for (int j = m-1; j>=0; j--) {
					ar[i][j] = num++;
				}
			}
		}
		
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar.length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

	}
}
