package q634;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=a; i++) {
			String b = "*";
			System.out.println(b.repeat(i));
		}

	}

}
