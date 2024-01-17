package q120;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		if (a > b) {
			System.out.println(a - b);
		} else {
			System.out.println(b - a);
		}

		
		//다른 풀이 1
		//System.out.println(Math.abs(a - b));
		
		//다른 풀이 2
		//System.out.println(Math.max(a, b) - Math.min(a, b));
		
	}

}
