package q126;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int sum = 0;
		int sum2 = 0;
		
		for(; ;) {
			int a = sc.nextInt();
			
			if(a == 0) {   // 0이 입력되면 반복문을 종료하기 때문에 이 조건을 첫번째로 제시해줘야 하고 그 후에 나머지 조건을 적어야 한다.
				break;
			} else if(a % 2 != 0) {
				sum++;
			} else {
				sum2++;
			}
		}
		System.out.println("odd : " + sum);
		System.out.println("even : " + sum2);
		
		sc.close();

	}

}
