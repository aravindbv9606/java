package com.xworkz.trip.External;

import com.xworkz.trip.classes.Family;

import static javax.swing.text.StyleConstants.Family;

public class FamilyRunner {
    public static void main(String[] args) {

        Family family = new Family();


        family.setFamilyAddress("Malode");
        family.setMembers(4);
        family.setNumber(98456787645L);
        family.setTravelDuration(5.5f);
        family.setTripBudget(34.999);
        family.setFamilyType('S');


        System.out.println(family);


        System.out.println("Family Address: " + family.getFamilyAddress());
        System.out.println("Members: " + family.getMembers());
        System.out.println("Number: " + family.getNumber());
        System.out.println("Travel Duration: " + family.getTravelDuration());
        System.out.println("Trip Budget: " + family.getTripBudget());
        System.out.println("Family Type: " + family.getFamilyType());
    }
}
