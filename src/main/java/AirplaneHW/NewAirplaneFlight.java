package AirplaneHW;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class NewAirplaneFlight extends AirplaneFlight{
    public NewAirplaneFlight(int numberAirplane, AirportList airportStart, LocalTime timeStart, AirportList airportFish, LocalTime timeFinish) {
        super(numberAirplane, airportStart, timeStart, airportFish, timeFinish);
    }

    public void duration () {
        long hours = ChronoUnit.HOURS.between (timeStart,timeFinish);
        System.out.println("Прошлол "  + hours + " часов" + "\n");

        long minutes = ChronoUnit.MINUTES.between (timeStart,timeFinish);
        System.out.println("Прошло " + minutes + " минут");
    }
}

