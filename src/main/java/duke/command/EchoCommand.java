package duke.command;

import duke.data.TaskList;
import duke.Ui.Ui;

/**
 * Command to echo user input.
 *  A <code>Echo</code> command can be called with the prefix 'echo' in Duke.
 */
public class EchoCommand extends Command {
    public EchoCommand() {
        super(CommandPrefix.ECHO);
    }

    @Override
    public void saveListAndPrintDone(TaskList tasks) {
        super.saveListAndPrintDone(tasks);
        System.out.println("echoing!");
    }

    public static void readInputAndEcho() {
        String command = Ui.readLine();
        System.out.println("    " + command);
    }

    @Override
    public void execute(TaskList tasks) {
        readInputAndEcho();
        saveListAndPrintDone(tasks);
    }
}
