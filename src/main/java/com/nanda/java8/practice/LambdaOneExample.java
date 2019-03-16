package com.nanda.java8.practice;

public class LambdaOneExample  {



    static Runnable r = () -> System.out.print("nanda");




    public static void main(String[] args) {

        r.run();

    }
}
