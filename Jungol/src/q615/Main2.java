package q615;

import java.util.Scanner;

public class Main2 {
	
	private String name;
	private int math;
	private int hangle;
	
	public void s(String name, int math, int hangle) {
		
		System.out.println(name + " " + math + " " + hangle);
		
		return;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] ar1 = new String[3];
		String[] ar2 = new String[3];
		
		for (int i=0; i <3; i++) {
			ar1[i] = sc.next();
			ar2[i] = sc.next();
			
		}
		
		Main2 m = new Main2();
		String p = m.s(ar1);
		System.out.println(p);
		
		Main2 n = new Main2();
		String y = m.s(ar2);
		System.out.println(n);
		

	}

	private String s(String[] ar2) {
		// TODO Auto-generated method stub
		return null;
	}


}
