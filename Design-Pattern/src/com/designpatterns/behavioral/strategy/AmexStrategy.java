package com.designpatterns.behavioral.strategy;

public class AmexStrategy implements ValidationStrategy{
    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = true;

        isValid = creditCard.getNumber().startsWith("34") || creditCard.getNumber().startsWith("35");

        if(isValid) {
            isValid = creditCard.getNumber().length() == 15;
        }

        if(isValid) {
            isValid = passesLuhn(creditCard.getNumber());
        }
        return isValid;
    }
}
