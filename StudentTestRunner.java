class StudentTestRunner  {
    public static void main(String[] args) {
		System.out.println("students are working");
        double [] price = {100.56, 20670.75, 34500.0,23456};  
        double [] result = StudentTest.work(price);
        System.out.println("          double");
        for (int item = 0; item < result.length; item++) {
            System.out.println(result[item]);
   }
    
        int[] name = {1,2,3,4,5,56,456};  
        int[] rang= StudentTest.display(name);
        System.out.println("          int");
        for (int free = 0; free < rang.length; free++) {
            System.out.println(rang[free]);
   }
        
		String[] names = {"amoxicillin","antibiotic","ibpurofen(pain reliver)","aspirin","WHO"};  
        String [] list = StudentTest.name(names);
        System.out.println("          String");
        for (int item = 0; item < list.length; item++) {
            System.out.println(list[item]);
   }
	    long[] littel = {2345678998l,34567876l,983456876l,457812345l};  
        long [] yellow = StudentTest.capcity(littel);
		System.out.println("          long");
       
        for (int type = 0; type<yellow.length; type++) {
            System.out.println(yellow[type]);
  }
		float[] size = {2345f,3456f,9834f,457f,3456f};  
        float [] color= StudentTest.dise(size);
        System.out.println("          float");
        for (int ltr = 0; ltr<color.length; ltr++) {
            System.out.println(color[ltr]);
  }
		
		boolean[] isTrue = {true,false,true};  
        boolean [] worth= StudentTest.iswork(isTrue);
        System.out.println("          boolean");
        for (int zero = 0; zero<worth.length; zero++) {
            System.out.println(worth[zero]);
	}
	
		char[] grade = {'a','b','c'};  
        char [] averge= StudentTest.dis(grade);
        System.out.println("          char");
        for (int range = 0; range<averge.length; range++) {
            System.out.println(averge[range]);
	}
	}
}