package q1291;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int sum1 = sc.nextInt();
			int sum2 = sc.nextInt();
			
			if ( sum1 >= 2 && sum1 <= 9 && sum2 >= 2 && sum2 <= 9)	{
				
				if (sum1 > sum2) {
					
					for(int j = 1; j <= 9; j++) {
						for(int i = sum1; i >= sum2; i--) {
							
							//System.out.println( i + " * " + j + " = " + (i * j) + "   ");
							System.out.printf("%d * %d = %2d   ", i, j, i*j);
						}
						System.out.println();
					} 
					break;
					
					
				} else if (sum2 > sum1) {
					
					for(int j = 1; j <= 9; j++) {
						for(int i = sum1; i <= sum2; i++) {
							//System.out.println( i + " * " + j + " = " + (i * j) + "   ");
							System.out.printf("%d * %d = %2d   ", i, j, i*j);
						}
						System.out.println();
					}
					break;
					
				} 
				
				
			} else {
				System.out.println("INPUT ERROR!");
			}
			
		}
		
	
		
	}

}
