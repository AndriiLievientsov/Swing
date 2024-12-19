package AbstractClass;

public abstract class HousePet extends Animal{
    String name;

    public HousePet(String name, double weight, String sound) {
        super(weight, sound);
        this.name = name;
    }


    abstract public void howToCareFor();

    public void about () {
        System.out.print(name + " весит " + weight + " кг");
        System.out.print(sound !=null ? (" и издает '" + sound + "'") : "");

        System.out.println(".");

    }

}
