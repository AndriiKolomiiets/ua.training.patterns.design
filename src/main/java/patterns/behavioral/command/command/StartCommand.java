package patterns.behavioral.command.command;

import patterns.behavioral.command.receiver.Computer;

/**
 * Concrete patterns.behavioral.command
 */
public class StartCommand implements Command {
    private Computer computer;

    public StartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.start();
    }

    public void undo() {
        computer.stop();
    }
}
