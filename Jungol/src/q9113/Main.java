package q9113;

public class Main {

	public static void main(String[] args) {
		
		String str = "우리나라 대한민국! 위 문자열의 길이는 입니다.";
		String[] ar = str.split("");
		
		for (int i=0; i<10; i++) {
			System.out.print(ar[i]);
			
		}
		
		System.out.println();
		
		System.out.println("위 문자열의 길이는 " + ar.length + "입니다.");

	}

}
