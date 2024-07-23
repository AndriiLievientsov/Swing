package Cards;

public class CardsMaker {
    public static void main(String[] args) {
        CardsClass cardsClass1 = new CardsClass(1, CardsSet.CLUBS);
        CardsClass cardsClass2 = new CardsClass(11, CardsSet.SPADES);
        CardsClass cardsClass3 = new CardsClass(12, CardsSet.DIAMONDS);
        CardsClass cardsClass4 = new CardsClass(13, CardsSet.HEARTS);

        System.out.println( cardsClass1 + "\n" +
                            cardsClass2 + "\n" +
                            cardsClass3 + "\n" +
                            cardsClass4);
    }
}
