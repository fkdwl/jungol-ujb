package q550;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		sc.close();
		
		for(int k=1; k<=2; k++) {
			for(int i=a; i>=1; i--) {
				String b = "*";
				System.out.println(b.repeat(i));
			}
			
			if(k == 2) {
				for(int j=k; j<=1; j--) {
					String b = "*";
					System.out.println(b.repeat(j));
				}
			}
			
			
		}	

		
	}

}
