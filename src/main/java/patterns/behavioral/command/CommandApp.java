package patterns.behavioral.command;

import patterns.behavioral.command.command.ResetCommand;
import patterns.behavioral.command.command.StartCommand;
import patterns.behavioral.command.command.StopCommand;
import patterns.behavioral.command.invoker.User;
import patterns.behavioral.command.receiver.Computer;

/**
 * This pattern also known as Transaction or Action
 */
public class CommandApp {

    public static void main(String[] args) {
        Computer computer = new Computer();
        User user = new User(new StartCommand(computer), new StopCommand(computer), new ResetCommand(computer));
        user.startComputer();
        user.undoStartComputer();
        user.resetComputer();
        user.undoResetComputer();
        user.stopComputer();
        user.undoStopComputer();
        user.resetComputer();
    }

}
