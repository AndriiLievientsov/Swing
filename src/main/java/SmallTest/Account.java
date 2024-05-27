package SmallTest;

public class Account {
    String name;
    String address;
    double balance;


    public void display() {
        System.out.print(name);
        System.out.print(" (");
        System.out.print(address);
        System.out.print(") имеет значение $");
        System.out.print(balance);
    }

    public double getInterest (double percentageRate) {
        return balance * percentageRate / 100;
    }

}
