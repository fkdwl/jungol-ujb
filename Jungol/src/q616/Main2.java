package q616;

import java.util.Scanner;

class Triangle {
	private Roint p1, p2, p3;
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		p1 = new Roint(x1, y1);
		p2 = new Roint(x2, y2);
		p3 = new Roint(x3, y3);
	}
	
	public double getCOGX() {
		double dx = (p1.getX() + p2.getX() + p3.getX()) / (double) 3;
		return dx;
	}
	
	public double getCOGY() {
		double dy = (p1.getY() + p2.getY() + p3.getY()) / (double) 3;
		return dy;
	}
	
	public void getCOG() {
		System.out.printf("(%.1f, %.1f)\n", getCOGX(), getCOGY());
	}
	
}

class Roint {
	private int x;
	private int y;
	
	public Roint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}

public class Main2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		sc.close();
		
		//Point p1 = new Point(x1, y1);
		//Point p2 = new Point(x2, y2);
		//Point p3 = new Point(x3, y3);
		
		Triangle tri = new Triangle(x1, y1, x2, y2, x3, y3);
		tri.getCOG();
		
		
	}

}
