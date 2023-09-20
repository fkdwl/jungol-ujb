package q9006;

public class Main {

	public static void main(String[] args) {
		
		String a = "수를 출력할 때는 따옴표를 생략합니다";
		int b = 123;
		double c = 6.500000;
		
		System.out.println(a);
		System.out.println(b);
		System.out.printf("%.6f\n", c);
		
		
		//다른 풀이1
		System.out.println("수를 출력할 때는 따옴표를 생략합니다");
		System.out.println("123");
		System.out.println("6.500000");
		
		// %d : 정수
		// %f : 실수
		// %s : 문자열
		// %c : 문자
		
		
	}

}
