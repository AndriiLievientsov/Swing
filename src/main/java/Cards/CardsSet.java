package Cards;

public enum CardsSet {
    CLUBS("Трефы"),
    DIAMONDS("Бубны"),
    HEARTS("Черви"),
    SPADES("Пики");

    //вот это все создается для того что бы можно было в Константу выше вписать Стринг
    // и потом создать конструктор принимает это Стриг значени и присваивает его в Константу
    // без него оно вообще не работает
    // А Гетер для того что бы можно было вытянуть Присвоенное Стриг Значение и передать его в
    // свичер в классе CardsClass и потом уже в main выдаст красивое e.g. "Валет Пики"dddddddddddddddddddddddddddddddddddddddddddddddd
    private final String displayName;

    CardsSet(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
