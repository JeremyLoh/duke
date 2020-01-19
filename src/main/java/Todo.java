/**
 * Represents tasks without any date/time attached to it e.g., visit new theme park.
 */
public class Todo implements Task {
    protected String description;
    protected boolean isDone;
    protected TaskType taskType = TaskType.TODO;

    public Todo(String description) {
        this(description, false);
    }

    public Todo(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    /**
     * Mark task as done.
     */
    @Override
    public void markAsDone() {
        this.isDone = true;
    }

    /**
     * Mark task as incomplete.
     */
    @Override
    public void markAsIncomplete() {
        this.isDone = false;
    }

    /**
     * Returns a String (Unicode Character) based on Task completion status.
     * @return String representing Unicode character for check mark or cross
     */
    @Override
    public String getStatusIcon() {
        if (isDone) {
            return "\u2713";
        } else {
            return "\u2718";
        }
    }

    @Override
    public TaskType getTaskType() {
        return taskType;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        // e.g. format: [T][✗] borrow book
        return String.format("[T][%s] %s", getStatusIcon(), description);
    }
}