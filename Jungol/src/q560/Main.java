package q560;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[10];
		
		int size = numbers.length;
		
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}
		
		sc.close();
		
		int min = 1000; // 가질 수 있는 최대값을 넣어준다.
		//int min = Integer.MAX_VALUE;
		//int max = Integer.MIN_VALUE;
		
		for (int i : numbers) {
			min = Math.min(min, i);
		    //max = Math.max(max, i);
		}
		
		/* 이걸로 해도 됨
		for (int i = 0; i < size; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		*/
		
		System.out.println(min);
	
	}

}
