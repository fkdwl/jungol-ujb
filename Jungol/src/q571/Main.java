package q571;

import java.util.Scanner;

public class Main {
	
	/*다른 풀이1
	public void print() {
		System.out.println("~!@#$^&*()_+|");
	}	
	*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = "~!@#$^&*()_+|";
		int b = sc.nextInt();
		
		for(int i=1; i<=b; i++) {
			System.out.println(a);
		}
		sc.close();
		
		
		/*
		//다른 풀이1
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		System.out.println(num);
		
		Main m = new Main()_;
		for(int i=0; i<num; i++) {
			//방법 1
			m.print();
			Main.print();
			//방법 2
			print();
		}
		*/
		
	}

}
