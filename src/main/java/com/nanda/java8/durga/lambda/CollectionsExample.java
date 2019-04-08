package com.nanda.java8.durga.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsExample {

    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(1,2,3,4);


        Collections.sort(numbers, (b,a) -> {
            return a - b ;
        });

        System.out.println(numbers);

        // print even numbers

        List<Integer> evenNumbers = numbers.stream().filter(n -> n%2 ==0).collect(Collectors.toList());

        evenNumbers.forEach(System.out::println);

    }
}


