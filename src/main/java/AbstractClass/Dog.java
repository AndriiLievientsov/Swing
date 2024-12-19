package AbstractClass;

public class Dog extends  HousePet{
    int  walksPerDay;

    public Dog (String name, double weight, int walksPerDay) {
        super(name, weight, "Гав");
        this.walksPerDay = walksPerDay;
    }

    @Override
    public void howToCareFor() {
        System.out.print("Выгуливать " + name);
        System.out.print(" " + walksPerDay + " раз в день.");
    }

}
