package q557;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] str = new String[10];
		int size = str.length;

		for(int i=0; i<size; i++) {
			str[i] = sc.next();
			if(i == 0 | i % 3 == 0 && i < 9) {
				System.out.print(str[i] + " ");
			}	
		}
		sc.close();
		
		
		//다른 풀이1
		//Scanner sc = new Scanner(System.in);
		//char[] inp = new char[10];
		//for(int i =0; i < inp.length; i++) {
			//inp[i] = sc.next().charAt(0);
		//}
		//sc.close();
		
		//for(int i=0; i<inp.length; i++) {
			//System.out.print(inp[i] + " ");
		//}
		//System.out.println();
		
		//System.out.println(inp[0] + " " + inp[3] + " " + in[[6]);
		
	}

}
