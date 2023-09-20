package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		char[] ar = new char[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<ar.length; i++) {
			ar[i] = sc.next().charAt(0);
		}
		sc.close();
		
		String out = "";
		for(int i = 0; i <= 9; i++) {
			out += ar[i];
		}
		System.out.print(out);
		
		
		
		//다른 풀이 1
		//Scanner scanner = new Scanner(System.in);

	    //String[] strX = new String[10];
	    //int size = strX.length;

	    //for (int i = 0; i < size; i++) {
	      //strX[i] = scanner.next();
	      //System.out.print(strX[i]);
	    //}
	    //scanner.close();
		
		
		
		//다른 풀이 2
		//char[] ar = new char[10];
		//Scanner sc = new Scanner(System.in);
		
		//ar[0] = sc.next().charAt(0);
		//ar[1] = sc.next().charAt(0);
		//ar[2] = sc.next().charAt(0);
		//ar[3] = sc.next().charAt(0);
		//ar[4] = sc.next().charAt(0);
		//ar[5] = sc.next().charAt(0);
		//ar[6] = sc.next().charAt(0);
		//ar[7] = sc.next().charAt(0);
		//ar[8] = sc.next().charAt(0);
		//ar[9] = sc.next().charAt(0);
		//sc.close();
		
		//System.out.print(ar[0] + ar[1] + ar[2] + ar[3] + ar[4] + ar[5] + ar[6] + ar[7] + ar[8] + ar[9]);
		

	}

}
