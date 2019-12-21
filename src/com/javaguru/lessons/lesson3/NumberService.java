package com.javaguru.lessons.lesson3;

class NumberService {
    //a = 1
    //b = 10
    int sumInRange(int a, int b) {
        int sum = 0;
        while (a <= b) {
            sum = sum + a; //sum += a;
            a++;
        }
        return sum;
    }

    // a = 1
    // b = 10
    int getEvenNumberCount(int a, int b) {
        int evenNumberCounter = 0;
        while (a <= b) {
            if (a % 2 == 0) {
                evenNumberCounter++;
            }
            a++;
        }
        return evenNumberCounter;
    }
}
