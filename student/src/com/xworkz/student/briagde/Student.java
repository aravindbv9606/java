package com.xworkz.student.briagde;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int score;
    private boolean isPass;


    public Student(String name, int age, int score, boolean isPass) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.isPass = isPass;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setPass(boolean isPass) {
        this.isPass = isPass;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    public boolean isPass() {
        return isPass;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", isPass=" + isPass +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return age == student.age && score == student.score && isPass == student.isPass && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, score, isPass);
    }
}
