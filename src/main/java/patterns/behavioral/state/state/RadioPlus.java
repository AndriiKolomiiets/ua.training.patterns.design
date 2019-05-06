package patterns.behavioral.state.state;

/**
 * This is a radio station.
 * */
public class RadioPlus implements Station {
    @Override
    public void play() {
        System.out.println(RadioPlus.class.getSimpleName() + " is playing...");
    }
}
