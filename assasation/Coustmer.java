class Coustmer{
public String name;
public int price;
public Order order;
public Coustmer(String name,int price,Order order){
this.name=name;
this.price=price;
this.order=order;
}
public void displayCoustmer(){

System.out.println(name+price);
System.out.println(order.totalItems+order.productName);
}
}