package com.xworkz.school.brigade;

import com.xworkz.school.Internal.SchoolInfo;

public class SchoolImpl implements SchoolInt{

    @Override
    public String getSchoolName(SchoolInfo schoolInfo) {
        if (schoolInfo.schoolName.isEmpty()) {
            return "sharada";
        }else
            return "mahila";

        }
    }



