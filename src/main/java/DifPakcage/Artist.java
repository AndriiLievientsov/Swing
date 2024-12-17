package DifPakcage;

import java.util.ArrayList;

public class Artist {
    private String name;
    private ArrayList<Item> items;

    public Artist(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Artist: " + name + "\nItems:\n");
        for (Item item : items) {
            sb.append("\t").append(item).append("\n");
        }
        return sb.toString();
    }
}