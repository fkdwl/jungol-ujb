package q572;

import java.util.Scanner;

public class Main {
	
	private int a;

	double r (int a) {
		return a * a * 3.14;
	}
	
	/*
	public static double circle(int r) {
		double area = r * r * 3.14;
		return area;
	}
	*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		sc.close();
		
		Main m = new Main();
		double b = m.r(a);
		
		System.out.printf("%.2f", b);

		/*
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		
		//System.out.println(r);
		
		double b = circle(r);
		System.out.printf("%.2f", b);
		*/
		
	}

}
