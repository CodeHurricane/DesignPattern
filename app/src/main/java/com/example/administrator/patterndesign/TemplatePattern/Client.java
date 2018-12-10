package com.example.administrator.patterndesign.TemplatePattern;

public class Client {

    public static void main(String[] args) {
        AbsClass absClass=new SonClass();
        System.out.println(absClass.content);

    }
}
