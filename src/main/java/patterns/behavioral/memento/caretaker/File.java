package patterns.behavioral.memento.caretaker;

import patterns.behavioral.memento.memento.Save;

public class File {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
