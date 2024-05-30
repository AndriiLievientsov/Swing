package SmallTest;

public class BankAccount {
    private String name;
    private String address;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals("")) { // простая защита от ввода путого значения в поле name
            this.name = name;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
