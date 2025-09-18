class Dna{
public String name;
public int cellCount;
public Rna rna;
public Dna(String name,int cellCount,Rna rna){
this.name=name;
this.cellCount=cellCount;
this.rna=rna;
}
public void displayDna(){

System.out.println(name+cellCount);
System.out.println(rna.bloodCount+rna.aciodName);
}
}
