package com.nanda.java8.durga.lambda;

import java.util.function.Function;

public class LambdaChapterOne {

    static Calc sum = (a,b) -> a +b;
    static Calc sub = (a,b) -> a -b;
    static Calc div = (a,b) -> a /b;
    static Calc mul = (a,b) -> a *b;
    static Calc mod = (a,b) -> a %b;
    static nanda s = (a) -> System.out.println(a);


    public static void main(String[] args) {

        System.out.println(sum.calc(1,2));
        System.out.println(sub.calc(1,2));
        System.out.println(div.calc(2,2));
        System.out.println(mul.calc(2,2));
        s.display("nanda");

    }

}

@FunctionalInterface
interface  Calc {

    int calc(int a,int b);


}

@FunctionalInterface
interface Sum extends Calc{
    int calc(int a, int b);
}

interface Sub extends Sum {
    int sub(int a, int b);
}

interface nanda {
    void display(String name);
    default void nodisplay(){

    }
}