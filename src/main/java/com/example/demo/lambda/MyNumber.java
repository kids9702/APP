package com.example.demo.lambda;

@FunctionalInterface
public interface MyNumber {
    default int test(){
        System.out.println("default test");
        return 1;
    }
    int getMaxNumber(int num1, int num2);

}
