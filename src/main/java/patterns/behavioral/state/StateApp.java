package patterns.behavioral.state;

import patterns.behavioral.state.context.Radio;
import patterns.behavioral.state.state.RadioPlus;

public class StateApp {

    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.setStation(new RadioPlus());
        radio.play();
        radio.nextStation();
        radio.play();
        radio.nextStation();
        radio.play();
    }
}
