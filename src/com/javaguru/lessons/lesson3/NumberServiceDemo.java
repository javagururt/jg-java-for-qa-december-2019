package com.javaguru.lessons.lesson3;

class NumberServiceDemo {

    public static void main(String[] args) {
        NumberService service = new NumberService();
        int actualResult = service.sumInRange(-1, -5);
        int expectedResult = -1;
        if (actualResult == expectedResult) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAILURE, expected = " + expectedResult + ", actual = " + actualResult);
        }
    }
}
