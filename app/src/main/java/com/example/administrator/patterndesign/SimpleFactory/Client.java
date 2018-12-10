package com.example.administrator.patterndesign.SimpleFactory;

public class Client {
    public static void main(String[] args) {
        Factory.getProduct("productA").operation();
    }
}
