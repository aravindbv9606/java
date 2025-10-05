class Furnature{
public int amount;
public String nameOfFurnature;
public Application application;

public Furnature(int amount,String nameOfFurnature,Application application){
this.amount=amount;
this.nameOfFurnature=nameOfFurnature;
this.application=application;


}
public void displayFurnature(){
System.out.println(amount+nameOfFurnature);
System.out.println(application.applicationName+application.isHaveItema);
}
}
