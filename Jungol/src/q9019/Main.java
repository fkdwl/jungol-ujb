package q9019;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("5개의 수를 입력하시오. ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		sc.close();
		
		System.out.print(a + 3 + " ");
		System.out.print(b - 3 + " ");
		System.out.print(c * 3 + " ");
		System.out.print(d / 3 + " ");
		System.out.print(e % 3);
		
		
		
		/* 다른 풀이1
		 Scanner sc = new Scanner(System.in);
		 
		 int[] ar = new int[5];
		 
		 System.out.print("5개의 수를 입력하시오. ");
		 
		 for(int i=0; i<ar.length; i++) {
		 	ar[i] = sc.nextInt();
		 }
		 sc.close();
		 
		 ar[0] = ar[0] + 3;
		 ar[1] -= 3;
		 ar[2] *= 3;
		 ar[3] /= 3;
		 ar[4] %= 3;
		 
		 for(int i=0; i<ar.length; i++) {
		 	System.out.print(ar[i] + " ");
		 }
		 		
		 */

	}

}
