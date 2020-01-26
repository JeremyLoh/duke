/**
 * Deals with user interactions
 */
public class Ui {
    public static final String HORIZONTAL_BAR =
            "____________________________________________________________";
    public static final String NEWLINE = System.lineSeparator();
    public static final String INDENTATION = "    ";

    /**
     * Prints given text with indentation: specified in Duke class.
     * @param text used for formatting and printing
     */
    protected void printTextWithIndentation(String text) {
        System.out.println(INDENTATION + text);
    }

    /**
     * Prints greeting message.
     */
    protected void greet() {
        String logo = "  __  __        _____       _           _   " + NEWLINE +
                " |  \\/  |      |  __ \\     | |         | |  " + NEWLINE +
                " | \\  / |_ __  | |__) |___ | |__   ___ | |_ " + NEWLINE +
                " | |\\/| | '__| |  _  // _ \\| '_ \\ / _ \\| __|" + NEWLINE +
                " | |  | | |    | | \\ \\ (_) | |_) | (_) | |_ " + NEWLINE +
                " |_|  |_|_|    |_|  \\_\\___/|_.__/ \\___/ \\__|";
        System.out.println(logo);
        printTextWithIndentation(HORIZONTAL_BAR);
        printTextWithIndentation("Hello friend. Hello friend?");
        printTextWithIndentation("That's lame. Maybe I should give you a name.");
        printTextWithIndentation("But that's a slippery slope, you're only in my head,");
        printTextWithIndentation("we have to remember that.");
        printTextWithIndentation(HORIZONTAL_BAR);
    }

    /**
     * Prints out error when storage data cannot be loaded into program.
     */
    public void showLoadingError() {
        printTextWithIndentation(HORIZONTAL_BAR);
        printTextWithIndentation("Unable to load storage data...");
        printTextWithIndentation(HORIZONTAL_BAR);
    }

    /**
     * Prints out error message for invalid user input.
     */
    public void unableToReadUserInput() {
        printTextWithIndentation(HORIZONTAL_BAR);
        printTextWithIndentation("Unable to read user input...");
        printTextWithIndentation(HORIZONTAL_BAR);
    }

    /**
     * Prints out empty command error.
     */
    public void commandNotFound() {
        printTextWithIndentation(HORIZONTAL_BAR);
        printTextWithIndentation("404 Not Found... Are you there?");
        printTextWithIndentation(HORIZONTAL_BAR);
    }

    /**
     * Prints out all tasks present in given TaskList.
     * @param tasks for printing task information
     */
    public void listTasks(TaskList tasks) {
        printTextWithIndentation(HORIZONTAL_BAR);
        int taskCount = 1;
        printTextWithIndentation("Here are the tasks in your list:");
        for (Task task : tasks) {
            printTextWithIndentation("" + taskCount + "." + task.toString());
            taskCount++;
        }
        printTextWithIndentation(HORIZONTAL_BAR);
    }

    /**
     * Prints out exception message given to stdout.
     * @param exception error message to be printed out
     */
    public void showExceptionMessage(Exception exception) {
        printTextWithIndentation(HORIZONTAL_BAR);
        printTextWithIndentation(exception.getMessage());
        printTextWithIndentation(HORIZONTAL_BAR);
    }

    /**
     * Prints out newly added task information.
     * @param task used for printing information related to task
     */
    protected void printTaskAddition(Task task, int totalTasks) {
        printTextWithIndentation(HORIZONTAL_BAR);
        printTextWithIndentation("Got it. I've added this task:");
        // Add more indentation for task description
        printTextWithIndentation("  " + task.toString());
        printTextWithIndentation("Now you have " + totalTasks + " tasks in the list.");
        printTextWithIndentation(HORIZONTAL_BAR);
    }

    /**
     * Mark a given task as done and print out updated task information.
     * @param task to mark as done
     */
    protected void markTaskAsDone(Task task) {
        task.markAsDone();
        printTextWithIndentation(HORIZONTAL_BAR);
        printTextWithIndentation("Nice! I've marked this task as done:");
        printTextWithIndentation(task.toString());
        printTextWithIndentation(HORIZONTAL_BAR);
    }

    /**
     * Deletes a given task and prints information about deleted task.
     * @param task to be deleted
     */
    protected void printTaskDeletion(Task task, int totalTasks) {
        printTextWithIndentation(HORIZONTAL_BAR);
        printTextWithIndentation("Noted. I've removed this task:");
        printTextWithIndentation("  " + task.toString());
        printTextWithIndentation("Now you have " + totalTasks + " tasks in the list.");
        printTextWithIndentation(HORIZONTAL_BAR);
    }

    /**
     * Prints goodbye message.
     */
    protected void goodbye() {
        printTextWithIndentation(HORIZONTAL_BAR);
        printTextWithIndentation("Goodbye friend.");
        printTextWithIndentation(HORIZONTAL_BAR);
    }
}