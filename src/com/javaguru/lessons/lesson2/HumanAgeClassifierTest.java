package com.javaguru.lessons.lesson2;

class HumanAgeClassifierTest {

    public static void main(String[] args) {
//        // Создаем объект HumanAgeClassifier
//        HumanAgeClassifier classifier = new HumanAgeClassifier();
//        // вызываем метод classify; записываем результат работы метода в переменную classifyResult
//        String classifyResult = classifier.classify(110);
//        // Выводим значение classifyResult на консоль
//        System.out.println(classifyResult);

        HumanAgeClassifierTest testRunner = new HumanAgeClassifierTest();
        testRunner.shouldReturnBabyWhenAgeLessThan2();
    }

    // should return baby when age less than 2
    void shouldReturnBabyWhenAgeLessThan2() {
        HumanAgeClassifier classifier = new HumanAgeClassifier();

        String expectedResult = "baby";

        String actualResult = classifier.classify(2);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }


    }


}
