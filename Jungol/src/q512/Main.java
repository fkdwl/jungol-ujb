package q512;

public class Main {

	public static void main(String[] args) {
		
		int a = 49;
		double b = 0.268300;
		double num = a * b;
		
		String result1 = String.format("%.6f", b);
		String result2 = String.format("%.6f", num);
		
		System.out.println(a + " * " + result1 + " = " + result2);

	}

}
