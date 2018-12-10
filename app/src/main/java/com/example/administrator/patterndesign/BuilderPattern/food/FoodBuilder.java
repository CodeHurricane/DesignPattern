package com.example.administrator.patterndesign.BuilderPattern.food;

import java.util.ArrayList;

public class FoodBuilder {
    ArrayList<Item> items=new ArrayList<>();
   private static   FoodBuilder foodBuilder=new FoodBuilder();


    public FoodBuilder addFood(Item item){
      items.add(item);
      return this;
   }

    public ArrayList<Item> getItems() {
        return items;
    }
}
