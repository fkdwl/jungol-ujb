package q9071;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		int max = -10000, min = 10000;
		
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = sc.nextInt();
			
			if(arr[i] % 2 == 0) {  // 홀수, 가장 작은 값 구하기
				//System.out.println("a");
				if(max < arr[i]) {
					max = arr[i];
				}
			} else{  // 짝수, 가장 큰 값 구하기
				//System.out.println("b");
				if(min > arr[i]) {
					min = arr[i];
				}
			}
			
		}
		
		System.out.print(min + " ");
		System.out.print(max);
		
		sc.close();

	}

}
