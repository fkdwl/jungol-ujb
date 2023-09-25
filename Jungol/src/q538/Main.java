package q538;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* 오답
		while(true) {
			
				Scanner sc = new Scanner(System.in);
				System.out.print("number? ");
				int a = sc.nextInt();
			
				if(a>0) {
					System.out.println("positive integer");
				} else if(a<0) {
					System.out.println("negative number");
				} 
				
				
				if(a==0) {
					break;
				}
				
		}
		*/	
		
		
		//정답
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("number? ");
			int inp = sc.nextInt();
			
			if(inp > 0) {
				System.out.println("positive integer");
			}else if(inp < 0) {
				System.out.println("negative number");
			}else {
				break;
			}  
			
		}
		sc.close();
		
	}

}
