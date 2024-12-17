package DifPakcage;

public abstract class Item {
    private String name; // Имя элемента (песня или альбом)

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item name: " + name;
    }
}
