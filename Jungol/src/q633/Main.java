package q633;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String K = "Korea";
		String U = "USA";
		String J = "Japan";
		String C = "China";
		
		while(true) {
			System.out.print("1. " + K + "\n"
					         + "2. " + U + "\n"
					         + "3. " + J + "\n"
					         + "4. " + C + "\n"
					         +"number? ");
			
			int inp = sc.nextInt();
			System.out.println();
			
			if(inp == 1) {
				System.out.println("Seoul");
				System.out.println();
			}else if(inp == 2) {
				System.out.println("Washington");
				System.out.println();
			}else if(inp == 3) {
				System.out.println("Tokyo");
				System.out.println();
			}else if(inp == 4) {
				System.out.println("Beijing");
				System.out.println();
			}else {
				System.out.println("none");
				break;
			}
		}
		sc.close();
		
	}

}
