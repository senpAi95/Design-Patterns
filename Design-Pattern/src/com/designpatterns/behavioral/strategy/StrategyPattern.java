package com.designpatterns.behavioral.strategy;

public class StrategyPattern {
    public static void main(String[] args) {
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("344936451095376");
        amexCard.setCvv("643");
        amexCard.setDate("04/2022");

        System.out.println("Is Amex valid: " + amexCard.isValid());

        CreditCard visaCard = new CreditCard(new VisaStrategy());

        visaCard.setNumber("4349364510953726");
        visaCard.setCvv("643");
        visaCard.setDate("04/2022");

        System.out.println("Is Visa valid: " + amexCard.isValid());

    }
}
