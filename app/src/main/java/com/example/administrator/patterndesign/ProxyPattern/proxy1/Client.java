package com.example.administrator.patterndesign.ProxyPattern.proxy1;

public class Client {

    public static void main(String[] args) {
        Image image=new ProxyImage("");
        image.display();
    }
}
