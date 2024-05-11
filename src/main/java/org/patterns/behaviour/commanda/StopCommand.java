package org.patterns.behaviour.commanda;

public class StopCommand implements Command {

    public final Computer computer;

    public StopCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }
}
