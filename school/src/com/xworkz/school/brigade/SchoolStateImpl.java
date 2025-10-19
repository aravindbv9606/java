package com.xworkz.school.brigade;

import com.xworkz.school.Internal.SchoolState;

public class SchoolStateImpl implements SchoolStateInterface{

    @Override
    public String schoolStateDetails(SchoolState schoolState) {
        if(schoolState.Board.isEmpty()){
          return "madrasUnvirsity";
        }else
            return "karantakaBoard";
    }
}
