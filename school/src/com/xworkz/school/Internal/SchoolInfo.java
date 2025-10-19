package com.xworkz.school.Internal;

public class SchoolInfo {

    public String schoolName;
    public int schoolCode;
    String schoolAddress;
    long schoolPhone;
    String schoolEmail;
    public SchoolInfo(String schoolName, int schoolCode, String schoolAddress, long schoolPhone, String schoolEmail) {
    this.schoolName = schoolName;
    this.schoolCode = schoolCode;
    this.schoolAddress = schoolAddress;
    this.schoolPhone = schoolPhone;
    this.schoolEmail = schoolEmail;
        System.out.println(" school name :"+schoolName);
        System.out.println(" school code :"+schoolCode);
        System.out.println(" school address :"+schoolAddress);
        System.out.println(" school phone :"+schoolPhone);
        System.out.println(" school email :"+schoolEmail);


    }
}
