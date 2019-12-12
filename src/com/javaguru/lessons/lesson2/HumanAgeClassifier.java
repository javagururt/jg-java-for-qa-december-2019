package com.javaguru.lessons.lesson2;

public class HumanAgeClassifier {

    public String classify(int age) {
        if (age >= 0 && age <= 2) {
            return "baby";
        } else if (age > 2 && age <= 10) {
            return "kid";
        } else if (age > 10 && age <= 16) {
            return "teenager";
        } else if (age > 16 && age <= 24) {
            return "student";
        } else if (age > 24 && age <= 65) {
            return "adult";
        } else if (age > 65 && age <= 110){
            return "senior";
        } else {
            return "Incorrect age";
        }
    }


}
