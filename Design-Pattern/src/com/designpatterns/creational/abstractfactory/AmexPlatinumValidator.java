package com.designpatterns.creational.abstractfactory;

public class AmexPlatinumValidator extends Validator{
    @Override
    public boolean isValid(CreditCard card) {

        return false;
    }
}
