package com.nanda.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ObtainStream {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add("nanda");
        names.add("kumar");

        Stream<? extends Object> nameStreams = names.stream();
    }
}
