package org.patterns.behaviour.state;

public class RedState implements State {
    @Override
    public String getColor() {
        return "Красный";
    }

    @Override
    public void next(Context context) {
        System.out.println("Следующего состояния нет");
    }

    @Override
    public void prev(Context context) {
        System.out.println("Желтый");
        context.setState(new YellowState());
    }
}
