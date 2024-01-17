package q9057;

public class Main {

	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++) {
			String b = "*";
			System.out.println(b.repeat(i));
			
			if (i == 3) {
				for(int k=i; k>=1; k--) {
					System.out.println(b.repeat(k));
				}
			break;
			}
		}

	}

}
