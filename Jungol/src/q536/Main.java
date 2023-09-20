package q536;

public class Main {

	public static void main(String[] args) {
		
		//for문 사용
		for(int i=1; i<=15; i++) {
			System.out.print(i + " ");
		}	
		System.out.println();
		
		
		//while문 사용
		int x = 1;
		while (x<=15) {
			System.out.print(x + " ");
			x++;
		}
		System.out.println();
		
		
		//do-while문 사용	(참과 거짓 상관없이 최소 한번은 실행한다)
		int e = 1;
		do {
			System.out.print(e + " ");
			e++;
			//System.out.print(e++ + " "); 이렇게 e++를 따로 밑에 안 써주고 안에 써줘도 된다
		    //↑연산자 우선순위가 적용되었다. ++가 +보다 더 우선순위이므로 ++가 먼저 실행된다
		}while(e<=15);
	}

}


// 연산자 우선순위 대입연산자(=)가 가장 순위가 낮다
