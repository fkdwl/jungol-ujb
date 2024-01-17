package q9117;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String[] ar = str.split("");
		
		int sum = 0;
		
		for (int i=0; i<ar.length; i++) {
			for (int k=0; k<ar.length; k++) {
				
				sum = k+1;
				if(sum < ar.length) {
					System.out.print(ar[sum]);
				} else if (sum >= ar.length) 
					
				}
				
				
			}
			System.out.println();
		}
		
		

	}

}
