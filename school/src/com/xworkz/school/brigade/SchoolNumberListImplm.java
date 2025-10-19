package com.xworkz.school.brigade;

import com.xworkz.school.Internal.SchoolNumberList;

public class SchoolNumberListImplm implements SchoolNumberListInter {

    @Override
    public int noOfList(SchoolNumberList schoolNumberList) {
        if (schoolNumberList.list < 25) {

            return 15;
        }else
            return 13;
    }
}