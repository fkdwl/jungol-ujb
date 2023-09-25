package q613;

import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] str = new String[3];
		int size = str.length;
		
		//System.out.println(str);
		
		for(int i=0; i<size; i++) {
			str[i] = sc.next();
			if(i == 0) {
				System.out.println("Name : " + str[i]);
			}else if(i == 1) {
				System.out.println("School : " + str[i]);
			}else if(i == 2) {
				System.out.println("Grade : " + str[i]);
			}
		}
		
		sc.close();
		
		
		//다른 풀이1
		//Scanner sc = new Scanner(System.in);
		
		//String name = sc.next();
		//String school = sc.next();
		//int grade = sc.nextInt();
		//sc.close();
		
		//Student stu1 = new Student(name, school, grade);
		//stu1.print();

	}

}
