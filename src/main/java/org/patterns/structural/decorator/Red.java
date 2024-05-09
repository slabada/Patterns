package org.patterns.structural.decorator;

public class Red extends Decorator {

    public Red(Shape shapeDecorator) {
        super(shapeDecorator);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("Сообщение от RedShapeDecorator");
    }
}
