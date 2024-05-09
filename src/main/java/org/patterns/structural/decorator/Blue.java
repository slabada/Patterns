package org.patterns.structural.decorator;

public class Blue extends Decorator {

    public Blue(Shape shapeDecorator) {
        super(shapeDecorator);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("Сообщение от BlueShapeDecorator");
    }
}
