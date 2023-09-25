package q614;

import java.util.Scanner;

import q614.Student1;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		Student1 stu1 = new Student1(grade, school);
		stu1.print();
		
		
		
		//다른 풀이1
		//Scanner sc = new Scanner(System.in);
		//String school = sc.next();
		//int grade = sc.nextInt();
		//sc.close();
		
		//Student1 stu1 = new Student1(grade, school);
		//Student1 stu2 = new Student1(grade, school);
		
		
		//stu1.setVar(6, "Jejuelementary");
		//stu2.setVar(grade, school);
		
		//stu1.print();
		//stu2.print();
	
		
	}

}
