package com.xworkz.school.brigade;

import com.xworkz.school.Internal.SchoolBoard;

public class SchoolBoardimplment implements SchoolBoardInterface {

    @Override
    public int noOfBoard(SchoolBoard schoolBoard) {
        if(schoolBoard.noOfSchools<12){
            return 13;
        }
        return 12;
    }
}
