package com.example.demo.lambda;

interface PrintString {
    void showString(String str);
}
public class LambdaTest {

    public static void main(String[] args) {

        PrintString lambdaString = str -> System.out.println(str);

        lambdaString.showString("lambda test");

        showMyString(lambdaString);

        PrintString reStr = returnPrint();
        System.out.println(reStr.getClass());
        reStr.showString("Hello ");
    }

    public static void showMyString(PrintString s) {
        s.showString("test2");
    }

    public static PrintString returnPrint() {
        return s -> System.out.println(s + "world");
    }
}
