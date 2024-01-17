package q596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		다른 풀이1
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int inp = sc.nextInt();
		sc.close();
		
		if(str.length()<inp) {
			for(int i=str.length()-1, c=0; i>=0; i--, c++); {
				System.out.print(str.charAt(i));
			} 
		}else {
			for(int i=str.length()-1, c=0; c<inp; i--, c++); {
				System.out.print(str.charAt(i));
			}
		}	
		*/
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int n = sc.nextInt();
		
		//System.out.println(str);
		//System.out.println(n);
		
		String[] ar = str.split("");
		
		if (n > ar.length-1) {
			for (int i=ar.length-1; i>=0; i--) {
				System.out.print(ar[i]);
			}
	
		} else {
			for (int i=ar.length-1; i>=ar.length-n; i--) {
				System.out.print(ar[i]);
			}
		}


	}

}
