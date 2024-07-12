package AirplaneHW;

import java.time.LocalTime;

public class AirplaneFlight {
    int numberAirplane;
    AirportList airportStart;
    LocalTime timeStart;
    AirportList airportFish;
    LocalTime timeFinish;
    private String airportFinish;

    public AirplaneFlight(int numberAirplane, AirportList airportStart, LocalTime timeStart, AirportList airportFish, LocalTime timeFinish) {
        this.numberAirplane = numberAirplane;
        this.airportStart = airportStart;
        this.timeStart = timeStart;
        this.airportFish = airportFish;
        this.timeFinish = timeFinish;
    }


    public AirplaneFlight(int numberAirplane, AirportList airportStart, LocalTime timeStart, AirportList airportFish) {
        this.numberAirplane = numberAirplane;
        this.airportStart = airportStart;
        this.timeStart = timeStart;
        this.airportFish = airportFish;
    }


    public AirplaneFlight(int numberAirplane, AirportList airportStart, AirportList airportFish, LocalTime timeFinish) {
        this.numberAirplane = numberAirplane;
        this.airportStart = airportStart;
        this.airportFish = airportFish;
        this.timeFinish = timeFinish;
    }

    public int getNumberAirplane() {
        return numberAirplane;
    }

    public void setNumberAirplane(int numberAirplane) {
        this.numberAirplane = numberAirplane;
    }

    public AirportList getAirportStart() {
        return airportStart;
    }

    public void setAirportStart(AirportList airportStart) {
        this.airportStart = airportStart;
    }

    public LocalTime getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(LocalTime timeStart) {
        this.timeStart = timeStart;
    }

    public AirportList getAirportFish() {
        return airportFish;
    }

    public void setAirportFish(AirportList airportFish) {
        this.airportFish = airportFish;
    }

    public LocalTime getTimeFinish() {
        return timeFinish;
    }

    public void setTimeFinish(LocalTime timeFinish) {
        this.timeFinish = timeFinish;
    }

    public String getAirportFinish() {
        return airportFinish;
    }
}
