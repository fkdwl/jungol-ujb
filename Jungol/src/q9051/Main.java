package q9051;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		int cnt = 0;
		
		for(int i=0; i<10; i++) {

			arr[i] = sc.nextInt();
			
			if (arr[i] % 2 == 0) {
				cnt++;
			}
		}
		
		System.out.println("입력받은 짝수는 " + cnt + "개입니다.");
		
		sc.close();
		
		

	}

}
