package com.nanda.java8.durga.lambda;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public interface IntPredicateExample {

    public static void main(String args[]){
        IntPredicate i = (a) -> {
            return a % 2 == 0;
        };

        Arrays.asList(3,4,5,6,7).stream().filter(item -> i.test(item)).collect(Collectors.toList()).forEach(System.out::println);
    }
}
