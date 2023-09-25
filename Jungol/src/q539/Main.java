package q539;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
			
		//int sum = 0, cnt = 0;
		
		//while(true) {
			//int a = sc.nextInt();
			
			//if(a<=100) {
				
				//sum += a;
				//cnt ++;
				
			//} else if(a>=100) {
				
				//double sum1 = sum / cnt;
				
				//System.out.println(sum);
				//System.out.println(sum1);
				
				//break;
			//}
			
		//}
		//sc.close();
		
		
		Scanner sc = new Scanner(System.in);
		int sum = 0, cnt = 0;
		
		for(;;) {
			int inp = sc.nextInt();
			
			 sum += inp;
			 cnt ++;
			 
			 if(inp >= 100) {
				 sc.close();
				 break;
			 }
		}
		System.out.println(sum);
		System.out.printf("%.1f\n", (double)sum / cnt);
		
	}

}
