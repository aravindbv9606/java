class StockMarketRunner{
public static void main(String [] args){
double [] value={1123,2234,334,4234,43};
double [] gani =StockMarket.stock(value);
  
for(int item=0; item<gani.length; item++){
System.out.println(gani[item]);
}
}
} 
