package com.xworkz.car.extrenal;

import com.xworkz.car.internal.CarDetails;
import com.xworkz.car.internal.Engine;


public class CarRunner {
    public static void main(String[] args) {
        Engine engine = new Engine(150, 258.75);
        CarDetails car = new CarDetails(4, "Petrole", engine);
        car.displayCar();
}
}








