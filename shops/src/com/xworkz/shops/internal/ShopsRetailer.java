package com.xworkz.shops.internal;

public class ShopsRetailer {
    String  shopsName;
    String shopsAddress;
    long shopsPhone;
public ShopsRetailer(String shopsName, String shopsAddress, long shopsPhone) {
    this.shopsName = shopsName;
    this.shopsAddress = shopsAddress;
    this.shopsPhone = shopsPhone;
    System.out.println(" shop name: "+shopsName);
    System.out.println(" shops address: "+shopsAddress);
    System.out.println(" shops phone: "+shopsPhone);

}
}

