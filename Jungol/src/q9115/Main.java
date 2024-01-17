package q9115;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] ar = str.toCharArray();
		
		for (int i=0; i<ar.length; i++) {
			
			if(Character.isLowerCase(ar[i])) {
				String a = (String)(ar[i].toUpperCase());
				System.out.print(ar[i].toUpperCase());
			} else if (Character.isUpperCase(ar[i])) {
				System.out.print(ar[i].toLowerCase());
			}
			//System.out.print(ar[i]);
		}
		
		

	}

}
