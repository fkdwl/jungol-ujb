package q9013;

public class Main {

	public static void main(String[] args) {
		
		double x, y;
		//String q, w;
		
		x = 1.2340;
		y = 10.3459;
		
		System.out.println("전체 7자리로 맞추고 소수 4자리까지 출력");
		System.out.printf("x = %7.4f", x);
		System.out.println();
		System.out.printf("y = %7.4f", y);
		System.out.println();
		System.out.println();
		
		System.out.println("소수 2자리까지 출력(반올림)");
		System.out.println(String.format("x = " + "%.2f", x));
		System.out.println(String.format("y = " + "%.2f", y));

	}

}
