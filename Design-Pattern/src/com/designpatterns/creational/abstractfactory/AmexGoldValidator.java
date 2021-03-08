package com.designpatterns.creational.abstractfactory;

public class AmexGoldValidator extends Validator{
    @Override
    public boolean isValid(CreditCard card) {

        return false;
    }
}
