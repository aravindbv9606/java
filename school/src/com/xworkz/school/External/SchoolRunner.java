package com.xworkz.school.External;

import com.xworkz.school.Internal.*;
import com.xworkz.school.brigade.*;

public class SchoolRunner {
    public static void main(String[] args) {
        SchoolInfo school = new SchoolInfo("Sharada",123,"banglore",1234567898,"dayandashrama@gmail.com");
        SchoolInt schoolInt=new SchoolImpl();
        String store=schoolInt.getSchoolName(school);
        System.out.println(store);

        SchoolNumberList schoolNumberList=new SchoolNumberList(25,"newHorizon");
        SchoolNumberListInter schoolNumberListInter=new SchoolNumberListImplm();
        int total=schoolNumberListInter.noOfList(schoolNumberList);
        System.out.println(total);

        SchoolBoard schoolBoard=new SchoolBoard("karantaka","Sharada mahila samasthi",35);
        SchoolBoardInterface schoolBoardInterface=new SchoolBoardimplment();
        int totals=schoolBoardInterface.noOfBoard(schoolBoard);
        System.out.println(totals);

        SchoolState schoolState=new SchoolState("madarsUniversity",12);
        SchoolStateInterface schoolStateInterface=new SchoolStateImpl();
        String noOfBords=(schoolStateInterface.schoolStateDetails(schoolState));
        System.out.println(noOfBords);

        SchoolMinStudents schoolMinStudents=new SchoolMinStudents(true,12.5);
        SchoolMinStudentsInterface schoolMinStudentsInterface=new SchoolMin();
        boolean isWait= schoolMinStudentsInterface.isover(schoolMinStudents);
        System.out.println(isWait);



        }
    }

