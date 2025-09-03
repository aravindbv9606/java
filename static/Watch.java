class Watch{
	
public static int price;
public static String name;
public static double size;
public static boolean isActive;
public static char grad;
public static float temp;
public static long count;
public static short value;
public static byte list;

  public static void printStatus(){
  
  System.out.println("Before call :"+ price);
  price=100;
  System.out.println("After call:"+ price);
  
  System.out.println("Before call:"+ name);
  name="titonic watch";
   System.out.println("After call:"+ name);
   
  System.out.println("Before status:"+ size);
   size=100;
   System.out.println("After status:"+ size);
   
  System.out.println(" Before status:"+ isActive);
   isActive=true;
    System.out.println(" After boolean status:"+ isActive);
   
  System.out.println(" Before char status:"+  grad);
   grad='a';
    System.out.println(" After char status:"+  grad);
   
  System.out.println(" Before float status:"+ temp);
  temp= 23.2345f;
  System.out.println(" After floatstatus:"+ temp);
  
  System.out.println(" Before long status:"+ count);
  count=2345678909l;
  System.out.println(" After long status:"+ temp);
  
  System.out.println(" Before short status:"+ value);
  value=456;
  System.out.println(" After short status:"+ value);
  
 System.out.println(" Before list status:"+ list);
  list=34;
   System.out.println(" After short status:"+ value);
  
}
}