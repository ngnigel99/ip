package duke.command;

public class ByeCommand extends Command{
    public ByeCommand() {
        super("bye");
    }
    @Override
    public void printDone() {
        System.out.println("bye!");
    }
}
