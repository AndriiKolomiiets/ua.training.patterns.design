package patterns.behavioral.command.command;

import patterns.behavioral.command.receiver.Computer;

/**
 * Concrete patterns.behavioral.command
 * */
public class ResetCommand implements Command {
    private Computer computer;

    public ResetCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.reset();
    }

    public void undo() {
        computer.start();
    }
}
