package com.nanda.java8.durga.lambda;

import java.util.function.Consumer;

public interface MethodRefernceExample {

    public static void main(String args[]){

        MyInterface m = MethodRefernceExample::doSomeHing;
        m.m();

        MySum s = MethodRefernceExample::doSum;

        s.sum(10,12);
    }

    public static void doSomeHing(){
        System.out.println("Something");
    }

    public static int doSum(int a, int b){
        return a + b;
    }
}

interface MyInterface{
    public void m();
}

interface MySum{
    public int sum(int a, int b);
}
