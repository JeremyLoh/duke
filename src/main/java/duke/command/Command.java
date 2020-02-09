package duke.command;

import duke.Storage;
import duke.Ui;
import duke.task.TaskList;

import java.util.Optional;

/**
 * Represents an action to be executed.
 */
public abstract class Command {
    protected boolean isExit;

    public abstract Optional<TaskList> execute(TaskList tasks, Ui ui, Storage storage);

    public Command(boolean isExit) {
        this.isExit = isExit;
    }

    public boolean isExit() {
        return isExit;
    }
}
