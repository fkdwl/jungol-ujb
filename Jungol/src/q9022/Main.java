package q9022;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d,e;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		sc.close();
		
		d = ++a;
		e = b--;
		c =	d + e;	

		System.out.println("a = " + d + ", b = " + b + ", c = " + c);
		
		
		/*
		a = sc.nextInt();
		b = sc.nextInt();
		c =	++a + b--;	

		System.out.println("a = " + d + ", b = " + b + ", c = " + c);
		*/
		

	}

}
