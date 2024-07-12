package AirplaneHW;

import java.time.LocalTime;

public class PlaneMaker {
    public static void main(String[] args) {
        AirplaneFlight  a1 = new AirplaneFlight(147,AirportList.TXT, LocalTime.now(),AirportList.OOP);
        AirplaneFlight  a2 = new AirplaneFlight(111,AirportList.RPG,LocalTime.of(14,44),AirportList.XYZ,LocalTime.now());
        AirplaneFlight  a3 = new AirplaneFlight(010,AirportList.PDF,AirportList.OOP, LocalTime.of(17,12));

        displayInfo(a1);
        displayInfo(a2);
        displayInfo(a3);


    }

    public static void  displayInfo (AirplaneFlight a) {
        System.out.println("Номер Рейса - " + a.getNumberAirplane() +"\n" +
                "Откуда вылетел - " + a.getAirportStart() + "\n" +
                "Восколько вылетел - " + (a.getTimeStart() != null ? a.getTimeStart() : "Времям не указано") + "\n" +
                "Куда прелетел - " + (a.getAirportFinish() != null ? a.getAirportFinish() : "Аэоропорт не указан") + "\n" +
                "Восколько приелет - " + (a.getTimeFinish() != null ? a.getTimeFinish() : "Не указано"));
        System.out.println("------------------");
    }
}
