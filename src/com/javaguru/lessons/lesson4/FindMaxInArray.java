package com.javaguru.lessons.lesson4;

import java.util.Arrays;
import java.util.Random;

class FindMaxInArray {

    //1. Create array

    //2. fill array with random numbers

    //3. find max in array
    public static void main(String[] args) {
        int[] randomNumbers = new int[5];
        System.out.println(Arrays.toString(randomNumbers));

        Random randomGenerator = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = randomGenerator.nextInt(101);
        }

        System.out.println(Arrays.toString(randomNumbers));

        int max = randomNumbers[0];

        for (int randomNumber : randomNumbers) {
            if (randomNumber > max) {
                max = randomNumber;
            }
        }
        /*
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > max) {
                max = randomNumbers[i];
            }
        }
         */

        System.out.println("Max = " + max);

    }
}
