package org.patterns.behaviour.state;

public class Context {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void prevState() {
        state.prev(this);
    }

    public void transition(State trargetState) {
        System.out.println(trargetState.getColor());
        this.setState(trargetState);
    }

    public void transition(State from, State to) {
        if(!state.getClass().equals(from.getClass())) {
            System.out.println("Исходное состояние не соотвествует ожидаемому");
            return;
        }
        System.out.println(from.getColor() + " -> " + to.getColor());
        this.setState(to);
    }
}
