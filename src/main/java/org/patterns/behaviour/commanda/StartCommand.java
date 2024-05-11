package org.patterns.behaviour.commanda;

public class StartCommand implements Command {

    private final Computer computer;

    public StartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.start();
    }
}
