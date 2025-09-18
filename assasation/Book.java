class Book{
public String name;
public int price;
public Pen pen;
public Book(String name,int price,Pen pen){
this.name=name;
this.price=price;
this.pen=pen;
}
public void displayBook(){

System.out.println(name+price);
System.out.println(pen.totalItems+pen.productName);
}
}