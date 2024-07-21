package gui3;

public enum MensFear {
    shirts("Shirt"),
    pants("Pant"),
    jackets("Jacket"),
    coats("Coat"),
    ties("Tie"),
    shoes("Shoe");

    private final String item;

    MensFear(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }
}
