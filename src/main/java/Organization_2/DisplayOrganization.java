package Organization_2;

public class DisplayOrganization {
    public static void main(String[] args) {
        NonProfitOrganization n1 = new NonProfitOrganization();
        ProfitMakingOrganization p2 = new ProfitMakingOrganization();

        n1.setNamecompany("BMW");
        n1.setMoney(124);
        n1.setCommercial(false);
        n1.setProfit(5478);


        p2.setNamecompany("Rocket");
        p2.setMoney(985);
        p2.setCommercial(true);
        p2.setProfit(5);

        n1.display();
        System.out.println();
        p2.display();

    }
}
