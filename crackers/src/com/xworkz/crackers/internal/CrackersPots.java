package com.xworkz.crackers.internal;

public class CrackersPots {
   public String crackerName;
   Boolean isThere;
   public CrackersPots(String crackerName, Boolean isThere) {
       this.crackerName = crackerName;
       this.isThere = isThere;
       System.out.println(" crackerName: " + crackerName
       + " pots: " + isThere);

   }

}
