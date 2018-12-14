package com.example.administrator.patterndesign.DecoratorPattern;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    void operation() {
        System.out.println("RedShapeDecorator");
    }
}
