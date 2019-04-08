package com.nanda.java8.durga.lambda;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String args[]) {
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> {
            return a + b;
        };

        System.out.println(sum.apply(10, 11));
    }

}
