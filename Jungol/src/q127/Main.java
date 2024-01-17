package q127;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		double cnt = 0;
		
		for( ; ; ) {
			int a = sc.nextInt();
			
			if( a < 0 | a > 100) {
				break;
			} else {
				sum += a;
				cnt++;
			}
		}
		
		//double avg = sum / (double) cnt; 이것도 가능
		double avg = sum / cnt;
		//정수 / 정수의 결과는 정수이다. 하나를 double 타입으로 해줘야 한다
		
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);
		//cnt를 int 타입으로 선언하고 앞에 (double)를 붙여줘도 된다.
		//System.out.printf("avg : %.1f", sum /(double)cnt); 이것도 가능
		
		sc.close();
		
		
		
		/* 이렇게도 가능
		boolean b = true;
		
		while(b) {
			inp = sc.nextInt();
			
			if(0 <= inp && inp <= 100) {
				cnt++;
				sum += inp;
			} else {
				b = false;
			}
		}
		*/
	
		
	}

}
