package org.example;

public class MethodExample {
    public static double getSum(int a, int b) {
        return a + b;
    }

    public static double getDiv(int a, int b) {
        return a / b;
    }


    public static void main(String[] args) {
        MethodExample.getSum(1, 2);
        MethodExample.getSum(3, 4);
        MethodExample.getSum(2, 2);
        MethodExample.getSum(-1, -2);
    }
}
