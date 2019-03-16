package com.nanda.java8.practice;

public interface TestDefault {

    default public boolean isTest(){
        return true;
    }

    public  static void display(){
        System.out.print("nanda");
    }

    public static void main(String[] args) {

        display();
    }
}
