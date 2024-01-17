package q562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		/*
		for(int i=0; i<10; i++) {	
			arr[i] = sc.nextInt();		
			
			if (arr[i] % 2 == 0) {
				num1 += arr[i];
			}
			if(arr[i] % 2 != 0) {
				num2 += arr[i];
				num3++;
			}
		}
		
		System.out.println("sum : " + num1);
		System.out.println("avg : " + (double)(num2 / num3));
		*/
		
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int odd = 0, even = 0;
		for(int i=0; i<arr.length; i++) {
			
			if(i % 2 == 0) {
				odd += arr[i];
			} else {
				even += arr[i];
				num3++;
			}
			
		}
		
		System.out.println("sum : " + even);
		System.out.println("avg : " + (((double)odd) / num3));
		
		
		
	}

}
