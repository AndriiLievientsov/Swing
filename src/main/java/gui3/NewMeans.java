package gui3;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class NewMeans extends JFrame {
    public NewMeans() {
        setTitle("Ох Бля что-то делают с Мужицкой одеждой");
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Устанавливаем цвет через класс Designer
        Designer.setColor(Color.GREEN);

        // Создаем панель для элементов одежды
        JPanel clothingPanel = new JPanel(new GridLayout(8, 2, 20, 10)); // Увеличьте количество строк в GridLayout

        MensClothingItem mensClothingItem;
        for (int i = 0; i < 7; i++) {
            mensClothingItem = new MensClothingItem(MensFear.shirts.getItem(), MensFear.pants.getItem(),
                    MensFear.jackets.getItem(), MensFear.coats.getItem(), MensFear.ties.getItem(), MensFear.shoes.getItem());
            addClothingItemInfo(clothingPanel, mensClothingItem);
        }

        // Добавляем панель с элементами одежды в центр основного окна
        add(clothingPanel, BorderLayout.CENTER);

        // Создаем панель для итоговой суммы
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(new JLabel("Итоговая сумма: " + Designer.totalPrice(), SwingConstants.CENTER), BorderLayout.CENTER);

        // Добавляем панель с итоговой суммой в нижнюю часть основного окна
        add(bottomPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    private void addClothingItemInfo(JPanel panel, MensClothingItem mensClothingItem) {
        panel.add(new JLabel("Shirt: " + mensClothingItem.getShirt()));
        panel.add(new JLabel("Pant: " + mensClothingItem.getPant()));
        panel.add(new JLabel("Jacket: " + mensClothingItem.getJacket()));
        panel.add(new JLabel("Coat: " + mensClothingItem.getCoat()));
        panel.add(new JLabel("Tie: " + mensClothingItem.getTie()));
        panel.add(new JLabel("Shoe: " + mensClothingItem.getShoe()));
        panel.add(new JLabel("Color: " + Designer.getColorName()));
    }

}
