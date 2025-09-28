class Electornics{
public int cost;
public String electornicsNames;
public Application application;

public Electornics(int cost,String electornicsNames,Application application){
this.cost=cost;
this.electornicsNames=electornicsNames;
this.application=application;


}
public void displayElectornics(){
System.out.println(cost+electornicsNames);
System.out.println(application.applicationName+application.isHaveItema);
}
}
