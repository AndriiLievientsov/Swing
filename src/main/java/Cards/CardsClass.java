package Cards;

public class CardsClass {
    private final int number;
    private final CardsSet CardsSet;

    public CardsClass(int number, Cards.CardsSet cardsSet) {
//        if (number < 1 || number > 13) {
//            throw new IllegalArgumentException("Номер карты должен быть от 1 до 13");
//        }  доп проверка но не обязательно в данном случае

        this.number = number;
        CardsSet = cardsSet;
    }

    @Override
    public String toString() {
        String numberStr;
        switch (number) {
            case 1:
                numberStr = "Туз";
                break;
            case 11:
                numberStr = "Валет";
                break;
            case 12:
                numberStr = "Дамма";
                break;
            case 13:
                numberStr = "Король";
                break;
            default:
                numberStr = String.valueOf(number);
                break;
        }
        return numberStr + " " + CardsSet.getDisplayName();
    }



}

        
