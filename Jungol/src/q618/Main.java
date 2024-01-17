package q618;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
class Name {
	
	private String name;
	private String a;
	private String b;
	
	public Name(String name, String a, String b) {
		
		this.name = name;
		this.a = a;
		this.b = b;
	
	}
	
	public void print() {
		System.out.println("name");
		
		for(int i=0; i<15; i++) {
			System.out.print(name + " " + a + " " + b);
			
		}
	}
	
	public String getName() {
		return name;
	}
	
	public String getA() {
		return a;
	}
	
	public String getB() {
		return b;
	}
		
}

class Height {
	
	private String name;
	private String a;
	private String b;
	
	public Name(String name, String a, String b) {
		this.name = name;
		this.a = a;
		this.b = b;
	}
	
	public void print() {
		System.out.println("weight");
		
		for(int i=0; i<15; i++) {
			System.out.print(name + " " + a + " " + b);
		}
	}
	
	public String getName() {
		return name;
	}
	
	public String getA() {
		return a;
	}
	
	public String getB() {
		return b;
	}
	
}
*/

class Person {
	private String name;
	private int height;
	private double weight;
	
	public Person(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void print() {
		System.out.println(name + " " + height + " " + weight);
	}
	
	public double getWeight() {
	   return weight;
	}
	   
	public String getName() {
	   return name;
	}
	
}

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		String[] arr = new String[15];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next();
		}
		 
		Name min = new Name(name, a, b);
		Height max = new Height(name, a, b);
		
		min.print();
		*/
		
		
		// 풀이
		Person[] parr = new Person[5];
		
		for(int i=0; i<parr.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();
			parr[i] = new Person(name, height, weight);
		}
		
		/*
		for(int i=0; i<parr.length; i++) {
			parr[i].print();
		}
		*/
		System.out.println("name");
	    Arrays.sort(parr, new Comparator<Person>() {
	       @Override
	       public int compare(Person o1, Person o2) {
	          String w1 = o1.getName();
	          String w2 = o2.getName();
	            
	          return w1.compareTo(w2);
	       }
	    });
	    
	    for (int i = 0; i < parr.length; i++) {
	         parr[i].print();
	    }

		
		System.out.println("\nweight");
		Arrays.sort(parr, new Comparator<Person>() {
	         @Override
	         public int compare(Person o1, Person o2) {
	            double w1 = o1.getWeight();
	            double w2 = o2.getWeight();
	            
	            if(w1 - w2 > 0) return -1;
	            else if(w1 - w2 == 0) return 0;
	            else return 1;
	         }
	      });
	      
	      for (int i = 0; i < parr.length; i++) {
	         parr[i].print();
	      }

	}
}
