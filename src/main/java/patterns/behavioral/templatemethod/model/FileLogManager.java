package patterns.behavioral.templatemethod.model;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogManager extends LogManager {
    @Override
    public void printLog(String log) {
        File file;
        try {
            file = File.createTempFile("log-file", "_txt", new File("D:\\Java\\temp"));

            PrintWriter writer = new PrintWriter(file);
            writer.print(log);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
