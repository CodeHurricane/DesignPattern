package com.example.administrator.patterndesign.StrategyPattern;

public class ContextPrice {
    private Strategy strategy;
    public ContextPrice(Strategy strategy) {
        this.strategy = strategy;
    }
    public void price(){
        System.out.println(strategy.calculatePrice()+"");
    }
}
