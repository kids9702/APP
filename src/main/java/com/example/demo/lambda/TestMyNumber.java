package com.example.demo.lambda;

public class TestMyNumber {

    public static void main(String[] args) {
        MyNumber maxNum = (x, y) -> (x >= y)? x: y;

        int max = maxNum.getMaxNumber(10, 20);

        maxNum.test();

        System.out.println(max);

        MyNumber testNum = new MyNumber() {
            @Override
            public int getMaxNumber(int num1, int num2) {
                return (num1 >= num2) ? num1 : num2;
            }
        };

        System.out.println(testNum.getMaxNumber(30, 40));
    }
}
