package com.xworkz.school.Internal;

public class SchoolState {
    public String Board;
    int noOfSchools;
    public SchoolState(String Board, int noOfSchools){
        this.Board=Board;
        this.noOfSchools=noOfSchools;
        System.out.println("Board:"+Board);
        System.out.println("noOfSchools:"+noOfSchools);

    }
}
