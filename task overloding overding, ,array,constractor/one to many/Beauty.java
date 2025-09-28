class Beauty{
public int totalItems;
public String BeautyIitmsNames;
public Application application;

public Beauty(int totalItems,String BeautyIitmsNames,Application application){
this.totalItems=totalItems;
this.BeautyIitmsNames=BeautyIitmsNames;
this.application=application;

}

public void displayBeauty(){
System.out.println(totalItems+BeautyIitmsNames);
System.out.println(application.applicationName+application.isHaveItema);
}
}
