package q528;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//System.out.println("정수 값 입력: ");
		String x = scanner.nextLine();
		int y = Integer.parseInt(x);
		System.out.println(y);
		
		if(y < 0) {
			System.out.println("minus");
		}
		

	}

}
