package patterns.creational.factorymethod.watches;

import java.time.LocalDateTime;

public class DigitalWatch implements Watch {
    public void showTime() {
        System.out.println("Current time precisely: "+ LocalDateTime.now().toLocalTime());
        showMoonPhases();
    }
    public void showMoonPhases(){
        System.out.println("The moon is definitely in its phase!");
    }
}
