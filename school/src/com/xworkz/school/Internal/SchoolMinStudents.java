package com.xworkz.school.Internal;

public class SchoolMinStudents {
    public Boolean count;
    double total;
    public SchoolMinStudents(Boolean count, double total) {
        this.count = count;
        this.total = total;
        System.out.println("SchoolMinStudents: isThere = " + count + ", total = " + total);

    }
}
