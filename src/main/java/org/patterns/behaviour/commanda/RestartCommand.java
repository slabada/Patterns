package org.patterns.behaviour.commanda;

public class RestartCommand implements Command {

    private final Computer computer;

    public RestartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.restart();
    }
}
