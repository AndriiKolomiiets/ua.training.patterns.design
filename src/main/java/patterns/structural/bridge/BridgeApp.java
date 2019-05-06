package patterns.structural.bridge;

import patterns.structural.bridge.model.Sedan;
import patterns.structural.bridge.model.*;

public class BridgeApp {
    public static void main(String[] args) {

        Brand ford = new Ford();
        Brand audi = new Audi();
        Car hatchbackFord = new Hatchback(ford);
        Car sedanAudi = new Sedan(audi);
        Car sedanFord = new Sedan(ford);
        Car hatchbackAudi = new Hatchback(audi);
        hatchbackFord.showDetails();
        sedanAudi.showDetails();
        sedanFord.showDetails();
        hatchbackAudi.showDetails();
    }
}
