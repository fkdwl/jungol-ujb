package q528;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);  // 변수명은 자유롭게 작성가능. scanner 아니어도 됨
		
		//System.out.println("정수 값 입력: ");
		String x = scanner.nextLine();  // 키보드로 입력된 내용을 문자열로 읽고 좌측 변수에 대입한다
		int y = Integer.parseInt(x);  // 키보드로 입력된 내용은 문자열이므로 문자열x를 int로 바꾸어서 y에 대입한다
		scanner.close();
		System.out.println(y);
		
		if(y < 0) {
			System.out.println("minus");
		}
		
		
		//다른 풀이 1
		//Scanner sc = new Scanner(System.in);
		//int inp = sc.nextInt();
		//sc.close(); 이렇게 써줘야 한다. Scanner을 써준 후 마지막에 닫아줘야 한다
		//System.out.println(inp);
		
		//if(y < 0) {
			//System.out.println("minus");
		//}

	}

}
