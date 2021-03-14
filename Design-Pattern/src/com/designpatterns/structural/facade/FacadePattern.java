package com.designpatterns.structural.facade;

public class FacadePattern {
    public static void main(String[] args) {
        Demo facadeDemo = new Demo();
        facadeDemo.someComplexLogic1();
        facadeDemo.someComplexLogic2();
    }


    //without facade
//    public static void main(String[] args) {
//        /**
//         * Without facade
//         * execute some complex logic 1
//         * execute some complex logic 2
//         * return;
//         */
//
//
//    }
}
