class Agriculture{
	
public static int price;
public static String name;
public static double no;
public static boolean isActive;
public static char grad;
public static float weather;
public static long count;
public static short value;
public static byte list;

  public static void proprite(){
  
  System.out.println("Before call :"+ price);
  price=1000;
  System.out.println("After call:"+ price);
  
  System.out.println("Before call:"+ name);
  name="dayanada";
   System.out.println("After call:"+ name);
   
  System.out.println("Before status:"+ no);
   no=100;
   System.out.println("After status:"+ no);
   
  System.out.println(" Before status:"+ isActive);
   isActive=true;
    System.out.println(" After boolean status:"+ isActive);
   
  System.out.println(" Before char status:"+  grad);
   grad='a';
    System.out.println(" After char status:"+  grad);
   
  System.out.println(" Before float status:"+ weather);
 weather= 23.2345f;
  System.out.println(" After floatstatus:"+weather);
  
  System.out.println(" Before long status:"+ count);
  count=2345678909l;
  System.out.println(" After long status:"+ count);
  
  System.out.println(" Before short status:"+ value);
  value=456;
  System.out.println(" After short status:"+ value);
  
 System.out.println(" Before list status:"+ list);
  list=34;
   System.out.println(" After short status:"+ value);
  
}
}