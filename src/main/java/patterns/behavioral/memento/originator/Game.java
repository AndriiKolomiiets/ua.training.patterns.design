package patterns.behavioral.memento.originator;

import patterns.behavioral.memento.memento.Save;

public class Game {
    private String level;
    private int milliSeconds;

    public Save save(){
        return new Save(level, milliSeconds);
    }

    public void load(Save save){
        level = save.getLevel();
        milliSeconds = save.getMilliSeconds();
    }

    public void setGame(String level, int milliSeconds) {
        this.level = level;
        this.milliSeconds = milliSeconds;
    }

    @Override
    public String toString(){
        return "[Level: " + level + " >>Time in game: " + milliSeconds + "]";
    }
}
