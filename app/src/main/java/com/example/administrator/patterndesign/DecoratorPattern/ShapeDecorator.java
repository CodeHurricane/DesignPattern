package com.example.administrator.patterndesign.DecoratorPattern;

public abstract class ShapeDecorator  implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
     }

    public void draw(){
        operation();
        decoratedShape.draw();
    }

    abstract void  operation();
}
