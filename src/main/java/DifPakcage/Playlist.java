package DifPakcage;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<Item> items;

    public Playlist() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Playlist:\n");
        for (Item item : items) {
            sb.append("\t").append(item).append("\n");
        }
        return sb.toString();
    }
}
