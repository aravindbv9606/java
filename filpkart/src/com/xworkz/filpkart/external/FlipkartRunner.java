package com.xworkz.filpkart.external;

import com.xworkz.filpkart.internal.Beauty;
import com.xworkz.filpkart.internal.Fashion;

public class FlipkartRunner {
    public static void main(String[] args) {
        Fashion fashion = new Fashion(10,"raja");
        Beauty beauty = new Beauty(20,"powder",fashion);
        beauty.displayFlipkart();

    }
}
