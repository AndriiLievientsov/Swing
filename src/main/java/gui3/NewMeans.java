package gui3;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class NewMeans extends JFrame {
    public NewMeans() {
        setTitle("Ох Бля что-то делают с Мужицкой одеждой");
        setLayout(new GridLayout(7, 2, 20, 3));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        MensClothingItem mensClothingItem;
        for (int i = 0; i < 7; i++) { // Изменил диапазон цикла, чтобы избежать IndexOutOfBoundsException
            mensClothingItem = new MensClothingItem(MensFear.shirts.getItem(), MensFear.pants.getItem(),
                    MensFear.jackets.getItem(), MensFear.coats.getItem(), MensFear.ties.getItem(), MensFear.shoes.getItem());
            addClothingItemInfo(mensClothingItem);
        }

        pack();
        setVisible(true);
    }

    private void addClothingItemInfo(MensClothingItem mensClothingItem) {
        add(new JLabel("Shirt: " + mensClothingItem.getShirt()));
        add(new JLabel("Pant: " + mensClothingItem.getPant()));
        add(new JLabel("Jacket: " + mensClothingItem.getJacket()));
        add(new JLabel("Coat: " + mensClothingItem.getCoat()));
        add(new JLabel("Tie: " + mensClothingItem.getTie()));
        add(new JLabel("Shoe: " + mensClothingItem.getShoe()));
    }

}
