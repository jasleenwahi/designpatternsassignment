package singleton;

import java.io.FileWriter;
import java.io.IOException;

// The Logger class is a Singleton class that is used to write logs to a file.
public class Logger {
    // eager initialization.
    private static final Logger INSTANCE = new Logger();

    private FileWriter fileWriter;

    private Logger() {
        try {
            fileWriter = new FileWriter("log.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Returns the Singleton instance of the Logger class.
    public static Logger getInstance() {
        return INSTANCE;
    }
    // Writes the provided message to the log file.
    public void log(String message) {
        try {
            fileWriter.write(message + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Closes the FileWriter object used by the Logger class.
    public void close() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
