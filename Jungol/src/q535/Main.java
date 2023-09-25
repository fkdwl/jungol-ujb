package q535;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		sc.close();
		
		
		switch((int)a) {
			 case 4:
				 System.out.println("scholarship");
			 	 break;
			 case 3:
				 System.out.println("next semester");
			 	 break;
			 case 2:
				 System.out.println("seasonal semester");
			 	 break;
			 case 1:  // 이거 2개 안 적어도 default 적어주면 된다
			 case 0:
			 //default	 
				 System.out.println("retake");
			 	 break;
		}
		
		
		//다른 풀이 1 - if - else문
		//Scanner sc = new Scanner(System.in);
		//double inp = sc.nextDouble();
		//sc.close();
		
		//if(inp >= 4.0) {
			//System.out.println("scholarship");
		//}else if(inp >= 3.0) {
			//System.out.println("next semester");
		//}else if(inp >= 2.0) {
			//System.out.println("seasonal semester");
		//}else {
			//System.out.println("retake");
		//}
		
		
		//다른 풀이 2 - switch - case문
		//
		
	
	}

}
