class Mobile{
public int value;
public String mobileBrandName;
public Application application;

public Mobile(int value,String mobileBrandName,Application application){
this.value=value;
this.mobileBrandName=mobileBrandName;
this.application=application;

}

public void displayMobile(){
System.out.println(value+mobileBrandName);
System.out.println(application.applicationName+application.isHaveItema);
}
}
