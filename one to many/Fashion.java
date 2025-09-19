class Fashion{
public int price;
public String nameOfSarees;
public Application application;

public Fashion(int price,String nameOfSarees,Application application){
this.price=price;
this.nameOfSarees=nameOfSarees;
this.application=application;

}

public void displayFashion(){
System.out.println(nameOfSarees+price);
System.out.println(application.applicationName+application.isHaveItema);
}
}
