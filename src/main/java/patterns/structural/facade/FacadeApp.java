package patterns.structural.facade;

import patterns.structural.facade.facade.Computer;

public class FacadeApp {

    public static void main(String[] args) {
       /*
       >>Instead of all these code:
        Power power = new Power();
        power.on();
        DVDRom dvd = new DVDRom();
        dvd.load();
        HDD hdd = new HDD();
        hdd.copyFromDVD(dvd);

        >>Just code below.
        */

       Computer computer = new Computer();
       computer.copy();
    }
}
