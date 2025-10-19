package com.xworkz.crackers.brigade;

import com.xworkz.crackers.internal.CrackersInfo;
import com.xworkz.crackers.internal.CrackersPots;
import com.xworkz.crackers.internal.Rockets;

public interface Crackers {
    String crackerName(CrackersInfo crackersInfo);
    Boolean isThere(CrackersPots crackersPots);
    Double range(Rockets rockets);



}

