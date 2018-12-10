package com.example.administrator.patterndesign.BuilderPattern.food;

public class Burger extends Item {
    @Override
    Package createPackage() {
        return new Wrapper();
    }
}
