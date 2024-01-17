package q601;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
	
		//String[] arr = new String[str.length()];
		
		String[] arr = str.split("");
		
		/*
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		*/
		
		int num = arr.length;
		int num1 = 0;
		
		for(int i=arr.length-1; i>=0; i--) {
			if(i == num-1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + arr[i+1]);
			}
			
			for(int  k=0; k<arr.length; k++) {
				if (arr[i] == arr[k]) {
					System.out.print("");
					//num--;
					//System.out.println("num " + num);
				} else {
					System.out.print(arr[k]);
				}
				//System.out.print(arr[k]);
				if(k == arr.length-1) {
					System.out.println();
				}
			}
			
		}
		
		/*  다른 풀이
		Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        sc.close();
		
		String inp2 = inp + inp;
        for (int i = inp.length() - 1; i >= 0; i--) {
            System.out.println(inp2.substring(i, i + inp.length()));
		*/
		
		
	}

}
