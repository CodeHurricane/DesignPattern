package com.example.administrator.patterndesign.BuilderPattern.food;

public class Drink extends Item {
    @Override
    Package createPackage() {
        return new Bottom();
    }
}
