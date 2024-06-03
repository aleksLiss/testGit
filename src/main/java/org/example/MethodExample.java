package org.example;

public class MethodExample {

    public static double calc(int a, int b) {
        return a + b;

    public static double getDiv(int a, int b) {
        return a / b;
    }

    public static double getMinus(int a, int b) {
        return a - b;
    }


    public static void main(String[] args) {
        MethodExample.calc(1, 2);
        MethodExample.calc(3, 4);
        MethodExample.calc(2, 2);
        MethodExample.calc(-1, -2);
    }
}
