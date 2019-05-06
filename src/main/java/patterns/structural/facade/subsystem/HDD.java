package patterns.structural.facade.subsystem;

public class HDD {
    public void copyFromDVD(DVDRom dvd){
        if (dvd.hasData()){
            System.out.println("Copying...");
        } else {
            System.out.println("Insert CD.");
        }
    }
}
