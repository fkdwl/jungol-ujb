package q105;

public class Main {

	public static void main(String[] args) {
		
		String a = "Seoul";
		String b = "10,312,545";
		String c = "+91,375";
		System.out.printf("%15s%15s%15s", a, b, c);
		System.out.println();
		
		String d = "Pusan";
		String e = "3,567,910";
		String f = "+5,868";
		System.out.printf("%15s%15s%15s", d, e, f);
		System.out.println();
		
		String g = "Incheon";
		String h = "2,758,296";
		String i = "+64,888";
		System.out.printf("%15s%15s%15s", g, h, i);
		System.out.println();
		
		String j = "Daegu";
		String k = "2,511,676";
		String l = "+17,230";
		System.out.printf("%15s%15s%15s", j, k, l);
		System.out.println();
		
		String m = "Gwangju";
		String n = "1,454,636";
		String o = "+29,774";
		System.out.printf("%15s%15s%15s", m, n, o);
		
		
		
		//다른 풀이1
		/*
	 	ArrayList<String> pop = new ArrayList<>(
        	Arrays.asList("Seoul", "10,312,545", "+91,375", 
                  "Pusan", "3,567,910", "+5,868", 
                  "Incheon", "2,758,296", "+64,888", 
                  "Daegu", "2,511,676", "+17,230", 
                  "Gwangju", "1,454,636", "+29,774"));

      	for (int i = 0; i < pop.size(); ++i) {
         	if (i % 3 == 0 && i != 0) {
            	System.out.println();
         	}
         	System.out.printf("%15s", pop.get(i));
      	}
		*/
		
		
		//다른 풀이2
		/*
		String [] A= {"Seoul", "10,312,545","+91,375", 
            "Pusan", "3,567,910", "+5,868", 
            "Incheon","2,758,296", "+64,888",
            "Daegu" ,"2,511,676","+17,230",
            "Gwangju","1,454,636" ,"+29,774"};
      
      	for(int i=0; i<15; i++) {
         	System.out.printf("%15s",A[i]);
         	if(i==2||i==5||i==8||i==11) {
         	System.out.print("\n");
        	}
      	}
		*/
		

	}

}
