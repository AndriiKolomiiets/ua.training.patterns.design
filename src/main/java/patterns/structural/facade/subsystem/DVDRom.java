package patterns.structural.facade.subsystem;

public class DVDRom {
    private boolean data = false;
    public boolean hasData(){
        return data;
    }
    public void load(){
        data = true;
    }
    public void unload(){
        data = false;
    }
}
