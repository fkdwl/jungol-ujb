package q9055;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int sum = 0;
	
		sc.close();
		
		for(int i=0; i<=a; i++) {
			sum += i;
			if(i == 45) {
				System.out.printf("%d %d", i, sum);
				break;
			}
		}
		
		
		//System.out.print(sum);

	}

}
