package duke.task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;


class TaskListTest {
    TaskList tasks;
    static final String doneStatusIcon = "\u2713";
    static final String incompleteStatusIcon = "\u2718";

    @BeforeEach
    void init() {
        tasks = new TaskList();
    }

    @Test
    void addTask_validTask_success() {
        EventStub eventTask = new EventStub("project meeting", "2020-01-01",
                false, "event,0,project meeting,2020-01-01",
                doneStatusIcon, incompleteStatusIcon,
                "[E][" + incompleteStatusIcon + "] project meeting " + "(at: Jan 1 2020)");
        assertEquals(0, tasks.size());
        tasks.addTask(eventTask);
        assertEquals(1, tasks.size());
        Task storedTask = tasks.get(0);
        assertEquals(eventTask.getDescription(), storedTask.getDescription());
        assertEquals(eventTask.getTaskCompletionStatus(), storedTask.getTaskCompletionStatus());
    }

    @Test
    void addTask_null_notAdded() {
        assertEquals(0, tasks.size());
        assertFalse(tasks.addTask(null));
        assertEquals(0, tasks.size());
    }

    @ParameterizedTest
    @ValueSource(ints = {20, -5, 5})
    void remove_invalidIndex_IndexOutOfBoundsException(int index) {
        assertEquals(0, tasks.size());
        assertThrows(IndexOutOfBoundsException.class, () -> tasks.remove(index));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1})
    void remove_validIndex_removeTask(int index) {
        // Add two tasks
        EventStub eventTask = new EventStub("project meeting", "2020-01-01",
                false, "event,0,project meeting,2020-01-01",
                doneStatusIcon, incompleteStatusIcon,
                "[E][" + incompleteStatusIcon + "] project meeting " + "(at: Jan 1 2020)");
        tasks.addTask(eventTask);
        tasks.addTask(eventTask);
        // Remove one task
        tasks.remove(index);
        assertEquals(1, tasks.size());
    }

    @Test
    void get() {
    }

    @Test
    void size() {
    }

    @Test
    void addTodoTask() {
    }

    @Test
    void addEventTask() {
    }

    @Test
    void addDeadlineTask() {
    }
}