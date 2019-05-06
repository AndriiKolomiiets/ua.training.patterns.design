package patterns.behavioral.memento.memento;

public class Save {
    private final String level;
    private final int milliSeconds;

    public Save(String level, int miliSeconds) {
        this.level = level;
        this.milliSeconds = miliSeconds;
    }

    public String getLevel() {
        return level;
    }

    public int getMilliSeconds() {
        return milliSeconds;
    }
}
