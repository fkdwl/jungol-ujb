package q616;

import java.util.Scanner;

class Triangl {
	private Toint[] p;
	
	public Triangl(int x1, int y1, int x2, int y2, int x3, int y3) {
		p = new Toint[3];
		p[0] = new Toint(x1, y1);
		p[1] = new Toint(x1, y1);
		p[2] = new Toint(x1, y1);
		
	}
	
	public void getCOG() {
		double dx = 0.0, dy = 0.0;
		for(int i=0; i<p.length; i++) {
			dx += p[i].getX();
			dy += p[i].getY();
		}
		System.out.printf("(%.1f, %.1f)\n", dx / p.length, dy / p.length);
	}
	
}

class Toint {
	private int x;
	private int y;
	
	public Toint(int x, int y) {
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

public class Main3 {
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
		
		Triangl tri = new Triangl(x1, y1, x2, y2, x3, y3);
		tri.getCOG();
		
		
	}

}
