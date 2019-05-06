package patterns.behavioral.observer.observer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileObserver implements Observer {
    File file;

    @Override
    public void handleEvent(int temp, int pressure) {
        try {
            if (file == null) {
                file = File.createTempFile("TempPressure", "_txt", new File("D:\\Java\\temp"));
            }
            PrintWriter writer = new PrintWriter(file);
            writer.print("The weather has changed.\nTemperature: " + temp + "; pressure: " + pressure + "\n");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
