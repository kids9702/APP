package com.example.demo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassTest {

    public static void main(String[] args) {
        LambdaClassTest classTest = (s1, s2) -> s1 + s2;
        System.out.println(classTest.strClass("Test", " World"));

        List<String> str = new ArrayList<>();
        str.add("1");
        str.add("2");
        str.add("3");

        Stream<String> strStream = str.stream();
        List<Integer> nums = new ArrayList<>();
        strStream.forEach(s -> {nums.add(Integer.parseInt(s));});

        Stream<Integer> integerStream = nums.stream();
        integerStream.forEach(b -> System.out.println(b.getClass()));

        Stream<String> strStream2 = str.stream();
        strStream2.map(s -> Integer.parseInt(s)).forEach(integer -> System.out.println(integer.getClass()));

        Integer[] intArr = createIntArr(str);

        for (int i : intArr) {
            System.out.println(i);
        }

        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        List<String> text = createStrArr(num);

        for (String s: text) {
            System.out.println(s);
        }

        for (Integer i: num) {
            System.out.println(i);
        }

    }

    public static Integer[] createIntArr(List<String> strArr) {
        return strArr.stream().map(s -> Integer.parseInt(s)).toArray(Integer[]::new);
    }

    public static List<String> createStrArr(List<Integer> intArr) {
        return intArr.stream().filter(integer -> integer >= 2).map(integer -> integer.toString()).collect(Collectors.toList());
    }

}
