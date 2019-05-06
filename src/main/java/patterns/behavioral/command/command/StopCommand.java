package patterns.behavioral.command.command;

import patterns.behavioral.command.receiver.Computer;

/**
 * Concrete patterns.behavioral.command
 * */
public class StopCommand implements Command {
    private Computer computer;

    public StopCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }

    public void undo() {
        computer.start();
    }
}
