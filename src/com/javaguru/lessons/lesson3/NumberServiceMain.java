package com.javaguru.lessons.lesson3;

class NumberServiceMain {

    public static void main(String[] args) {
        int a = 1;
        int b = 10;

        int evenNumberCounter = 0;

        while (a <= b) {
            if (a % 2 == 0) {
                evenNumberCounter++;
            }
            a++;
        }
        System.out.println("Even number counter = " + evenNumberCounter);
    }
}
