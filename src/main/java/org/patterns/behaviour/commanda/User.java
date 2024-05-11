package org.patterns.behaviour.commanda;

public class User {

    private final Command restartCommand;
    private final Command startCommand;
    private final Command stopCommand;

    public User(Command restartCommand, Command startCommand, Command stopCommand) {
        this.restartCommand = restartCommand;
        this.startCommand = startCommand;
        this.stopCommand = stopCommand;
    }

    public void startComputer(){
        startCommand.execute();
    }

    public void stopComputer(){
        stopCommand.execute();
    }

    public void restartComputer(){
        restartCommand.execute();
    }
}
