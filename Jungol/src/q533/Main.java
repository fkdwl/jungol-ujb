package q533;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		int b = sc.nextInt();
		sc.close();
		
		//System.out.println(a);
		//System.out.println(b);
		
		
		String q = "F";
		String w = "M";
		
		//System.out.println(a == q);
		//System.out.println(String.class.isInstance(a)); - type 알아보기
		
		
		if (a.equals(q) & b >= 18) {
			System.out.println("WOMAN");
		} else if (a.equals(q) & b <= 18) {
			System.out.println("GIRL");
		}
		
		if (a.equals(w) & b >= 18) {
			System.out.println("MAN");
		} else if (a.equals(w) & b <= 18) {
			System.out.println("BOY");
		}
		

	}

}
