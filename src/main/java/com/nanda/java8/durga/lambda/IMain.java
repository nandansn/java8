package com.nanda.java8.durga.lambda;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public interface IMain {

    public static void main(String args[]) {


        Predicate<String> name = n -> n.length() > 6;
        Predicate<String> nameAnd = n -> n.endsWith("thi");

        Arrays.asList("Nanda", "Kumar", "Super", "Sanmathi", "Namathi","abcdefgh").stream().filter(name).
                collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("And predicate");
        Arrays.asList("Nanda", "Kumar", "Super", "Sanmathi", "Namathi","abcdefgh").stream().filter(name.and(nameAnd)).
                collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("OR predicate");
        Arrays.asList("Nanda", "Kumar", "Super", "Sanmathi", "Namathi","abcdefgh").stream().filter(name.or(nameAnd)).
                collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Negate predicate");
        Arrays.asList("Nanda", "Kumar", "Super", "Sanmathi", "Namathi","abcdefgh").stream().filter(name.and(nameAnd).negate()).
                collect(Collectors.toList()).forEach(System.out::println);
    }
}
