package q9111;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String str;
		str = "jungol olympiad";
		
		Scanner sc = new Scanner(System.in);
		
		int[] ar = new int[5];
		String[] ar3 = new String[5];
		String[] ar2 = new String[15];
		
		ar2 = str.split("");
		
		/*
		for(int i=0; i<ar2.length; i++) { //출력
		    System.out.print(ar2[i] + " ");
		}
		*/
		
		for (int i=0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
			//System.out.print(ar[i] + " ");
			ar3[i] = ar2[ar[i]];
			//System.out.print(ar3[i] + " ");
		}
		
		for (int i=0; i<ar3.length; i++) {
			System.out.print(ar3[i]);
		}
		
		
		
	}

}
