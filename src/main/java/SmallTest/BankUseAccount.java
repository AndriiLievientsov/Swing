package SmallTest;

public class BankUseAccount {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();

        myAccount.setName("Барри Берд");
        myAccount.setAddress("222 Cyberspace Lane");
        myAccount.setBalance(24.02);

        yourAccount.setName("Джейн Смит");
        yourAccount.setAddress("111 Consumer Street");
        yourAccount.setBalance(55.63);

        System.out.print(myAccount.getName());
        System.out.print(" (");
        System.out.print(myAccount.getAddress());
        System.out.print(") имеет на счету $");
        System.out.print(myAccount.getBalance());
        System.out.println();

        System.out.print(yourAccount.getName());
        System.out.print(" (");
        System.out.print(yourAccount.getAddress());
        System.out.print(") имеет на счету $");
        System.out.print(yourAccount.getBalance());

    }

}
