package org.patterns.behaviour.state;

public class GreenState implements State {
    @Override
    public String getColor() {
        return "Зеленный";
    }

    @Override
    public void next(Context context) {
        System.out.println("Желтый");
        context.setState(new YellowState());
    }

    @Override
    public void prev(Context context) {
        System.out.println("Предыдущего состояния нет");
    }
}
