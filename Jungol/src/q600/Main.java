package q600;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		sc.close();
		
		String[] stChange1 = str.split("\\s");
	
		System.out.println(stChange1.length);
		 
		 
		 
		 /*
		 // 다른 방법
		 String inp = sc.nextLine();
			
			int cnt = 1;
			for (int i=0; i<inp.length(); i++) {
				if (inp.charAt(i) == ' ') {
					cnt++;
				}
			}
			System.out.println(cnt);
			*/
		
	}

}
