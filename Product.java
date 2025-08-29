class Product{
public static int stock(int goods){
System.out.println("stock");
int items=0;
if(goods==1){
items=100;
}
int iron =10;
int silver =9;
int[]metrilas={iron,silver};
System.out.println("list of products");
for( int weight=0; weight<metrilas.length; weight++){
System.out.println( "goods"+metrilas[weight]);
}
return items;


}
}















