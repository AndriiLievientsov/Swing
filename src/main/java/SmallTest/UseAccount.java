package SmallTest;

public class UseAccount {
    public static void main(String[] args) {
        Account myAccount = new Account();
        Account yourAccount = new Account();

        myAccount.name = "Барри Берд";
        myAccount.address = "222 Cyberspace Lane";
        myAccount.balance = 24.02;

        yourAccount.name = "Джейм Смит";
        yourAccount.address = "111 Consumer Street";
        yourAccount.balance = 55.63;

        myAccount.display();


        System.out.print(" плюс $");
        System.out.print(myAccount.getInterest(5.00));
        System.out.print(" дохода" + "\n");

        yourAccount.display();

        double yourInterestRate = 7.00;
        System.out.print(" плюс $");
        double yourInterestAmount =
                yourAccount.getInterest(yourInterestRate);
        System.out.print(yourInterestAmount);
        System.out.print(" дохода ");
    }
}
