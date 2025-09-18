class DnaRunner{

public static void main(String []args){
Rna rna=new Rna(1000,"cells");
Dna dna=new Dna("blood",12000,rna);
dna.displayDna();



}
}