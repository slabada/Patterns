package org.patterns.behaviour.state;

public class YellowState implements State {
    @Override
    public String getColor() {
        return "Желтый";
    }

    @Override
    public void next(Context context) {
        System.out.println("Красный");
        context.setState(new RedState());
    }

    @Override
    public void prev(Context context) {
        System.out.println("Зеленный");
        context.setState(new GreenState());
    }
}
