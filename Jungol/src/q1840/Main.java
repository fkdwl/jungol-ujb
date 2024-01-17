package q1840;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum1 = sc.nextInt();  // 가로길이
		int sum2 = sc.nextInt();  // 세로길이
		
		//System.out.println(sum1);
		//System.out.println(sum2);
		
		//int q = 0;  // 치즈가 없는 칸
		//int c = 1;  // 치즈가 있는 칸
			
		//int[] x = new int[sum1];  // 가로 최대 길이
		//int[] y = new int[sum2];  // 세로 최대 길이
		
		int[] h = new int[sum1 * sum2];  // 전체 칸 수
		
		/*
		// 출력
		for(int i=0; i<h.length; i++) {
			h[i] = sc.nextInt();
			if(i == h.length-1) {
				for(int p = 1; p<sum1; p++) {
					for(int k=0; k<h.length; k++) {
					
						System.out.print(h[k] + " ");
				
						if(k == sum1 - 1) {
							System.out.println();
						} 
						if (k > sum1 - 1) {
								if(k % (sum1 * p) == sum1 - 1) {
									System.out.println();
								}	
								
						}
						
					}	
				}
								
			}
		}
		*/
		
		
		
		for(int i=0; i<h.length; i++) {
			h[i] = sc.nextInt();
			if(i == h.length-1) {
					for(int k=0; k<h.length; k++) {
					
						System.out.print(h[k] + " ");
				
						if(i == h.length-1) {
							if(k == sum1 - 1) {
								System.out.println();
							
								if(h[k] == 1 && (h[k-1] == 0 | h[k+1] == 0 | h[k - (sum1-1)] == 0)) {
									h[k] = 3;
									System.out.println(h[k]);
								}						
							} 
						}	
						if(k == sum1 +2) {
							System.out.println();
							
							if(h[k] == 1 && (h[k-1] == 0 | h[k+1] == 0 | h[k - (sum1-1)] == 0)) {
								h[k] = 3;
								System.out.println(h[k]);
						}
						
					}	
				
								
			}
		}
		
		
		
		
		
		
		
	}
}
