package com.nanda.java8.durga.lambda;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public interface FunctionInterfaceExample {

    public static void main(String args[]) {

        Function<Integer, Integer> sum = (a) -> {
            return a;
        };


        System.out.println(sum.apply(2));

        Function<String, Integer> length = (s) -> {
            return s.length();
        };

        Function<Integer, Integer> sqr = (n) -> {
            return n * n;
        };

        Arrays.asList(1, 2, 3, 4, 5, 6).stream().forEach(num -> System.out.println(sqr.apply(num)));

        Predicate<Integer> m80 = (m) -> m >= 80;
        Predicate<Integer> m60 = (m) -> m >= 60 && m < 80;
        Predicate<Integer> m40 = (m) -> m >= 40 && m < 60;

        Function<Integer, String> dist = (m) -> {

            if (m80.test(m)){
                return "Distinttion";
            } else if (m60.test(m)){
                return "First class";
            } else if (m40.test(m)){
                return "Second class";
            } else {
                return "Fail";
            }
        };


        Arrays.asList(30, 40, 50, 60, 80).stream().forEach(mark -> System.out.println(dist.apply(mark)));


    }


}
