class Textbook{
public static int price=10;

public static void amount(){

System.out.println( "static variable:"+ price);
}

Textbook(){

System.out.println("defult constrcuter");
}
 
Textbook(int value){

System.out.println("argument constrcuter");
System.out.println(value);
}
Textbook(String name,int value){

System.out.println("argument constrcuter");
}
Textbook(double copy, String name,int value){

System.out.println("argument constrcuter");
}
Textbook(float page,double  copy,String name,int value){

System.out.println("argument constrcuter");
}
Textbook( long count,float page,double  copy,String name,int value){

System.out.println("argument constrcuter");
}
Textbook( char section,long count,float page,double  copy,String name,int value){

System.out.println("argument constrcuter");
}
Textbook(boolean isWorth, char section,long count,float page,double  copy,String name,int value){

System.out.println("argument constrcuter");
}
}