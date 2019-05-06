
package patterns.behavioral.state.state;

/**
 * This is a radio station.
 * */
public class RadioMinus implements Station {
    @Override
    public void play() {
        System.out.println(RadioMinus.class.getSimpleName() + " is playing...");
    }
}
