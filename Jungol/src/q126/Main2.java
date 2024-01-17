package q126;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
	
		int sum = 0;
		int sum2 = 0;
		int cnt = 1;
		int cnt2 = 1;
		
		for(; ;) {
			int a = sc.nextInt();
			
			if(a == 0) {
				break;
			} else if(a % 2 != 0) {
				sum2 += cnt;
			} else {
				sum += cnt2;
			}
		}
		System.out.println("odd : " + sum2);
		System.out.println("even : " + sum);
		
		sc.close();
		
		


	}

}
