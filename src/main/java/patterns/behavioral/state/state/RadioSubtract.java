package patterns.behavioral.state.state;

/**
 * This is a radio station.
 * */
public class RadioSubtract implements Station {
    @Override
    public void play() {
        System.out.println(RadioSubtract.class.getSimpleName() + " is playing...");
    }
}
