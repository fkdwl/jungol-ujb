package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[]ar = new int[10];
	
		int min = Integer.MAX_VALUE; 
        int max = 0;
		
		for(int i=0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
			//System.out.println(ar[i]);
		}
		sc.close();
		
		for(int i=0; i<ar.length; i++) {
			if(ar[i] < 100) {
				if (ar[i]>max) {
					max = ar[i];
				}	
				//System.out.println(max);
			} else if (ar[i] >= 100) {
				 if (ar[i]<min) {
					min = ar[i];
				}
				//System.out.println(min);
			} 
			
		}
		
		if (max >= 1 && max < 10000) {
			System.out.print(max + " ");
		} else {
			System.out.print(100 + " ");
		}
		
		if (min >= 1 && min < 10000) {
			System.out.print(min);
		} else {
			System.out.print(100);
		}
		
		//System.out.print(max + " " + min);
		
		
		/* 다른 풀이
		int max = 0;
		int min = 10000;
		
		for(int i=0; i<ar.length; i++) {
			if (ar[i] >= 100) {
				min = (ar[i] < min) ? ar[i] : min;
			} else {
				if(ar[i] > max) {
				max = ar[i];
				}
			}
		}
		
		System.out.print(max + " " + min);
		
		*/

	}

}
