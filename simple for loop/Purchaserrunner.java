class Purchaserrunner{
public static void main(String [] args){

Coustmer coustmerone=new Coustmer(1,"nani");
Coustmer coustmertwo=new Coustmer(2,"prabhas");
Coustmer coustmerthree=new Coustmer(3,"raja");
Coustmer coustmerfour=new Coustmer(4,"veenu");
Coustmer [] store={coustmerone,coustmertwo,coustmerthree,coustmerfour};
Purchaser Purchaser=new Purchaser();
Purchaser.displaydetials(store);
}
}