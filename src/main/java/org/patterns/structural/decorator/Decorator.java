package org.patterns.structural.decorator;

public abstract class Decorator implements Shape {

    protected Shape shapeDecorator;

    public Decorator(Shape shapeDecorator) {
        this.shapeDecorator = shapeDecorator;
    }

    @Override
    public void draw() {
        shapeDecorator.draw();
    }
}
