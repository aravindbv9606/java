package com.xworkz.school.brigade;

import com.xworkz.school.Internal.SchoolMinStudents;

public class SchoolMin implements SchoolMinStudentsInterface {

    @Override
    public boolean isover(SchoolMinStudents schoolMinStudents) {
        if (schoolMinStudents.count) {
            return false;
        } else {
            return true;
        }
    }
}