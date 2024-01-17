package q549;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		int sum = 0;
		int cnt = 0;
		
		for(int i=1; i<=a; i++) {
			
			if(i % 2 != 0) {
				sum += i;
				cnt++;
			}
			
			if(sum >= a) {
				System.out.printf("%d %d", cnt, sum);
				break;
			}
		}
		
	}

}
