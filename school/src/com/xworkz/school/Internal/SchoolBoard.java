package com.xworkz.school.Internal;

public class SchoolBoard {


    public String boardName;
    public String schoolName;
    public int noOfSchools;

    public SchoolBoard(String boardName, String schoolName, int noOfSchools) {
        this.boardName = boardName;
        this.schoolName = schoolName;
        this.noOfSchools = noOfSchools;
        System.out.println(" board name: "+boardName + " School name" + schoolName + " no fo schools" + noOfSchools);
        System.out.println();

    }
}
