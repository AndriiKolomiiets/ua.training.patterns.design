package patterns.creational.factorymethod.watches;

import java.time.LocalDateTime;

public class AnalogWatch implements Watch {
    public void showTime() {
        System.out.println(LocalDateTime.now().toLocalTime()+ " - But this time it is analogue...");
    }
}
