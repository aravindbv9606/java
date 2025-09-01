class Gadsets{
public static int price(String name,int value){
int amount=0;
if(name=="cloth" || value==200){
amount=100;
System.out.println("best cloth in brand");
}
else{
System.out.println("not good in brand");

}


return amount;
}
}

