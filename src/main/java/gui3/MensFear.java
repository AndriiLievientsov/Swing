package gui3;

public enum MensFear {
    shirts("Рубаха"),
    pants("Штанци"),
    jackets("Куртяк"),
    coats("Кофта"),
    ties("Ремень"),
    shoes("Боты");

    private final String item;

    MensFear(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }
}
