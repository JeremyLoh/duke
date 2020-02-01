package duke.gui;

import duke.Duke;
import javafx.application.Application;

/**
 * A launcher class to workaround classpath issues.
 * Used for Duke GUI.
 */
public class Launcher {
    public static void main(String[] args) {
        Application.launch(Duke.class, args);
    }
}