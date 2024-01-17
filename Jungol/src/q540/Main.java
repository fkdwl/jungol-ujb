package q540;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			int a = sc.nextInt();
			
			/*이건 적어도 되고 안 적어도 됨
			if(a%3 !=  0 && a != -1) {
				
			}
			*/
			if(a%3 ==  0)  {
					System.out.println(a/3);
					
			}	
			if( a == -1) {
				break;
			}
		}
		sc.close();
		
	}
}
