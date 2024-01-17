package q9012;

public class Main {

	public static void main(String[] args) {
		
		int r, l;
		double x, num1, num2;
		
		r = 5;
		l = 2;
		x = 3.140000;
		num1  = r * l * x;
		num2 = r * r * x;
		
		String result1 = String.format("%.6f", num1);
		String result2 = String.format("%.6f", num2);
		String result3 = String.format("%.6f", x);
		
		System.out.printf("원주 = " + r + " * " + l +  " * " + result3 + " = " + result1);
		System.out.println();
		System.out.printf("넓이 = " + r + " * " + r +  " * " + result3 + " = " + result2);

	}

}
