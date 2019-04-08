package com.nanda.java8.durga.lambda;



import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String args[]){
        BiPredicate<Integer, Integer> numCheck = (a,b) -> {
            return a > b;
        } ;

        System.out.println(numCheck.test(10,11));
    }
}
