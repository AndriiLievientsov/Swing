package AirplaneHW;

import java.time.LocalTime;

public class NewPlaneMaker {
    public static void main(String[] args) {
        NewAirplaneFlight newAirplaneFlight = new NewAirplaneFlight(111,AirportList.RPG, LocalTime.of(14,44),AirportList.XYZ,LocalTime.now());
        NewAirplaneFlight newAirplaneFlight1 = new NewAirplaneFlight(99,AirportList.OOP,LocalTime.now(),AirportList.XYZ,LocalTime.of(12,12));

        newAirplaneFlight.duration();
        System.out.println("------------");
        newAirplaneFlight1.duration();
    }
}
