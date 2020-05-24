package com.ydy.listtest;

class Student{
    String id = "";
    String name = "";
    int age;
    String sex = "";
    double score;

    Student(){
        ;
    }
    public void inputID(String newID){
        id = newID;
    }
    public void inputAge(int newAge){
        age = newAge;
    }
    public void inputName(String newName){
        name = newName;
    }
    public void inputSex(String newSex){
        sex = newSex;
    }
    public void inputScore(double newScore){
        score = newScore;
    }
}
