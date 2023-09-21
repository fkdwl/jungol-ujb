package q594;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		sc.close();
		
		System.out.print(str1 + str1);

		
		//다른 풀이1
		//Scanner sc = new Scanner(System.in);
		
		//String str1 = sc.next();
		//sc.close();
		
		//StringBuilder a = new StringBuilder();
		
		//System.out.print(str1.repeat(2));
		
		
		//다른 풀이2
		//Scanner sc = new Scanner(System.in);
		
		//String str2 = sc.next();
		//sc.close();
		
		//for(int i=0; i<2; i++) {
			//System.out.print(str2);
	    //}

	}
}
