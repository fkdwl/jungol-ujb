package q9020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("5개의 수를 입력하시오. ");
		
		int[] ar = new int[5];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			
			if (i == 0) {
				System.out.print(ar[i] + 3 + " ");
			} else if (i == 1) {
				System.out.print(ar[i] - 3 + " ");
			} else if (i == 2) {
				System.out.print(ar[i] * 3 + " ");
			} else if (i == 3) {
				System.out.print(ar[i] / 3 + " ");
			} else if (i == 4) {
				System.out.print(ar[i] % 3 + " ");
			}
		}
		sc.close();
		
		/* 다른 풀이 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String inp = ""; 
		try {
			System.out.print("5개의 수를 입력하시오. ");
			inp = br.readLine();
			System.out.println(inp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		StringTokenizer st = new StringTokenizer(inp);
		int[] num = new int[5];
		int i = 0;
		while (st.hasMoreTokens() ) {
			num[i++] = Integer.parseInt(st.nextToken());
		}
		
		num[0] += 3;
		num[1] -= 3;
		num[2] *= 3;
		num[3] /= 3;
		num[4] %= 3;
		num[0] += 3;
		
		for(int j = 0; j < num.length; j++) {
			System.out.print(num[j] + " ");
		}
		*/
		
	}

}
