package Temperature;

public class NewUserTemperature {
    public static void main(String[] args) {
        TemperatureEvenNicer temp = new TemperatureEvenNicer(100, TempScale.FAHRENHEIT);
        temp.display();
        temp.convertTo(TempScale.CELSIUS);
        temp.display();

        temp = new TemperatureEvenNicer(0, TempScale.CELSIUS);
        temp.display();
        temp.convertTo(TempScale.KELVIN);
        temp.display();

        temp = new TemperatureEvenNicer(273.15, TempScale.KELVIN);
        temp.display();
        temp.convertTo(TempScale.FAHRENHEIT);
        temp.display();
    }
}
