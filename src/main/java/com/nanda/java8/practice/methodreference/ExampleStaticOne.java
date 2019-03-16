package com.nanda.java8.practice.methodreference;

import java.util.Arrays;
import java.util.function.BiFunction;

public class ExampleStaticOne {

    public static void main(String[] args) {

        String[] names ={"nanda","nivrithi","sanmathi","valar"};

        Arrays.asList(names).forEach(NandaHelper::greetWithName);

        NandaHelper helper = new NandaHelper();
        BiFunction<Integer,Integer,Integer> bi = helper::sum;

        System.out.print(bi.apply(1,2));
    }
}
