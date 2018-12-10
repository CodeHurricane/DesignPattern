package com.example.administrator.patterndesign.BuilderPattern.food;

public class Client {
    public static void main(String[] args) {
        FoodBuilder foodBuilder=new FoodBuilder();
        foodBuilder.addFood(new ChickBurger()).addFood(new CoolDrink()).getItems();

    }
}
