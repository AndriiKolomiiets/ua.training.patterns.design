package patterns.behavioral.state.context;

import patterns.behavioral.state.state.RadioMinus;
import patterns.behavioral.state.state.RadioPlus;
import patterns.behavioral.state.state.RadioSubtract;
import patterns.behavioral.state.state.Station;

/**
 * Context
 */
public class Radio {
    private Station station;

    public void setStation(Station station) {
        this.station = station;
    }

    public void nextStation() {
        if (station instanceof RadioPlus){
            setStation(new RadioMinus());
        } else if (station instanceof RadioMinus){
            setStation(new RadioSubtract());
        } else {
            setStation(new RadioPlus());
        }
    }

    public void play(){
        station.play();
    }

}
