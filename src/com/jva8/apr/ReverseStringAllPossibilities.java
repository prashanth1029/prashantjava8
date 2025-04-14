package com.jva8.apr;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringAllPossibilities {

    public static void main(String[] args) {

        String str="Lokesh";
        char[] array = str.toCharArray();

        String reversedLoki = IntStream.range(0,str.length())
                .mapToObj(i -> String.valueOf(array[array.length-i])).collect(Collectors.joining());


    }
}
