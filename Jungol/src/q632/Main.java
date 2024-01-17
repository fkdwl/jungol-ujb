package q632;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		//int big, middle, small;
		
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		sc.close();
		
		
		//이렇게도 가능
		//big = (num1>num2)&&(num1>num3)?num1:(num3>num2?num3:num2);
		//small = (num2>num1)&&(num3>num1)?num1:(num2>num3?num3:num2);
		//middle = (num1+num2+num3)-big-small;
		
		//System.out.println(small);
		
		if(num1 < num2 && num1 < num3 && (num2 < num3 | num3 < num2)) {
			System.out.println(num1);
		}else if(num2 < num1 && num2 < num3 && (num3 < num1 | num1 < num3)) {
			System.out.println(num2);
		}else if(num3 < num1 && num3 < num2 && (num2 < num1 | num1 < num2)) {
			System.out.println(num3);
		}
		
		
		
		//다른 풀이1
		//Scanner sc = new Scanner(System.in);
		//int[] ar = new[3];
		//for(int i=0)
		
		//for(int i=0l i<ar.length; i++) {
			//System.out.print(ar[i] + " ");
		//}
		
		//다른 풀이2
		//if(ar[0] > ar[1]) {
			//if(ar[1] > ar[2]) {
		//}
	}

}
