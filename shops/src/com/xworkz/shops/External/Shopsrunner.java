package com.xworkz.shops.External;

import com.xworkz.shops.Brigade.*;
import com.xworkz.shops.internal.*;

public class Shopsrunner{
    public static void main(String[] args) {
        ShopsInfo shopsInfo=new ShopsInfo("rudhra","good shop this area",45);
        ShopsInterface shopsInterface=new shopsImp();
        int noOfShops=shopsInterface.noOfShops(shopsInfo);
        System.out.println(noOfShops);

        ShopsRetailer shopsRetailer=new ShopsRetailer("raja","good shop this area",454909876);
        ShopsRetilerinter shopsRetilerinter=new ShopsRetilerimp();
        boolean pricelist= shopsRetilerinter.isactive(shopsRetailer);
        System.out.println(pricelist);

        ShopsWholSeller shopsWholSeller=new ShopsWholSeller("gani",12.1,13);
        ShopsWholSellerinter shopsWholSellerinter=new ShopsWholSellerInmp();
        double result= shopsWholSellerinter.pricelist(shopsWholSeller);
        System.out.println(result);

        ShopsGoodWill shopsGoodWill=new ShopsGoodWill("harsh","this shop is good reginable price",12f,'a');
        ShopsgoodWilllInter shopsgoodWilllInter=new ShopsgoodwillImpl();
        float pricelists= shopsgoodWilllInter.pricelist(shopsGoodWill);
        System.out.println(pricelists);

        ShopsStock shopsStock=new ShopsStock(12,"shankar",123f);
        ShopsStockInter shopsStockInter=new ShopsStockimp();
        long store= shopsStockInter.getId(shopsStock);
        System.out.println(store);


    }
}
