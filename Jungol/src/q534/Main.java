package q534;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		sc.close();
		
		switch(str1) {
		case "A":
			System.out.print("Excellent");
			break;
		case "B":
			System.out.print("Good");
			break;
		case "C":
			System.out.print("Usually");	
			break;
		case "D":
			System.out.print("Effort");
			break;
		case "F":
			System.out.print("Failure");
			break;
		default:
			System.out.print("error");
		}

		
		//1. if문으로 풀이
		//Scanner sc = new Scanner(System.in);
		//char inp = sc.next().charAt(0);
		//sc.close();
		
		//System.out.println(inp);
		
		//if(inp == 'A') {
			//System.out.print("Excellent");
		//}else if(inp == 'B') {
		   //System.out.print("Good");
		//}else if(inp == 'C') {
		   //System.out.print("Usually");
		//}else if(inp == 'D') {
		   //System.out.print("Effort");
		//}else if(inp == 'F') {
		   //System.out.print("Failure");
		//}
		
		
		//2.
		//Scanner sc = new Scanner(System.in);
		//String inp = sc.next();
		//sc.close();
		
		//System.out.println(inp);
		
		// 이건 오류
		//if(inp == 'A') {  / inp의 값인 A는 힙메모리에 저장되어 있어, inp에는 주소값이 저장되어 있기 때문에 A == A 가 아니라 주소값 == A가 되므로 오류가 난다 
			//System.out.println("Excellent")
		//} - 여기까지 오류
		
		//if(inp.equals('A')) {
			//System.out.println("Excellent")
		//}wlse if(inp.equals('B')) {
			//System.out.println("Good")
		//}  이렇게 문장이 구성됨. 
		
		
		
		
	}

}
