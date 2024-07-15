package Temperature;

public class TemperatureEvenNicer extends TemperatureNice{
   public TemperatureEvenNicer () {
       super();
   }

    public TemperatureEvenNicer(double number) {
        super(number);
    }

    public TemperatureEvenNicer(TempScale scale) {
        super(scale);
    }

    public TemperatureEvenNicer(double number, TempScale scale) {
        super(number, scale);
    }

    public void convertTo(TempScale newScale) {
        double number = getNumber();
        TempScale currentScale = getScale();

        if (currentScale == TempScale.CELSIUS && newScale == TempScale.FAHRENHEIT) {
            number = (number * 9.0 / 5.0) + 32;
        } else if (currentScale == TempScale.FAHRENHEIT && newScale == TempScale.CELSIUS) {
            number = (number - 32) * 5.0 / 9.0;
        } else if (currentScale == TempScale.CELSIUS && newScale == TempScale.KELVIN) {
            number = number + 273.15;
        } else if (currentScale == TempScale.KELVIN && newScale == TempScale.CELSIUS) {
            number = number - 273.15;
        } else if (currentScale == TempScale.FAHRENHEIT && newScale == TempScale.KELVIN) {
            number = (number - 32) * 5.0 / 9.0 + 273.15;
        } else if (currentScale == TempScale.KELVIN && newScale == TempScale.FAHRENHEIT) {
            number = (number - 273.15) * 9.0 / 5.0 + 32;
        }

        setNumber(number);
        setScale(newScale);
    }
}
