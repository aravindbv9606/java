class ElectonicItemsrunner{
public static void main(String [] args){

ElectonicItems electonicItemsone=new ElectonicItems(1,"ani");
ElectonicItems electonicItemstwo=new ElectonicItems(2,"vani");
ElectonicItems electonicItemsthree=new ElectonicItems(3,"raja");
ElectonicItems electonicItemsfour=new ElectonicItems(4,"rani");
ElectonicItems [] store={electonicItemsone,electonicItemstwo,electonicItemsthree,electonicItemsfour};
Items items=new Items();
items.displaydetials(store);
}
}