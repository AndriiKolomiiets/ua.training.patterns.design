package patterns.structural.proxy.service;

public class RealImage implements Image {
    private String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    private void load(){
        System.out.println("Downloading " + file + "...");
    }
    @Override
    public void display() {
        System.out.println("Displaying " + file);
    }
}
