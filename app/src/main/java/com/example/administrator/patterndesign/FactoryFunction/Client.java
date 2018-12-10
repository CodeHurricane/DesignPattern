package com.example.administrator.patterndesign.FactoryFunction;


public class Client {
    public static void main(String[] args) {

        AbsProduct productA=new ProductAFactory().getProduct();
        productA.operation();
    }
}
