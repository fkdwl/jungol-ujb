package q9070;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int max = -10000, min = 10000;
		

		for(int i=0; i<10; i++) {	
			arr[i] = sc.nextInt();		
			
			if(max < arr[i]) {
				max = arr[i];
			}
			
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println(max);
		
	}
}
