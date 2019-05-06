package patterns.structural.facade.facade;

import patterns.structural.facade.subsystem.DVDRom;
import patterns.structural.facade.subsystem.HDD;
import patterns.structural.facade.subsystem.Power;

/**
 * Facade
 * */
public class Computer {
    private Power power = new Power();
    private DVDRom dvd = new DVDRom();
    private HDD hdd = new HDD();

    public void copy(){
        power.on();
        dvd.load();
        hdd.copyFromDVD(dvd);
    }

}
