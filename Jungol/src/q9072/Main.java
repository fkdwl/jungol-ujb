package q9072;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int num = 0;
		
		for(int i=0; i<10; i++) {
			
			arr[i] = sc.nextInt();
			num = num + arr[i];
			
		}
		
		System.out.println("총점 = " + num);
		System.out.println("평균 = " + (double)(num / 10));

	}

}
