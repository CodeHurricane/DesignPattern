package com.example.administrator.patterndesign.BuilderPattern.food;

public abstract class Item {
    protected  String name ;
    protected  int price;
    protected Package aPackage=createPackage();

    abstract Package createPackage();

}
