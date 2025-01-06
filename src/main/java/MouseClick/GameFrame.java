package MouseClick;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serial;
import java.util.Random;

public class GameFrame extends JFrame implements ActionListener {
   @Serial
   private static final long serialVersionUID = 1L;

   int randomNumber = new Random().nextInt(10) + 1;
   int numGuesses = 0;

   JTextField textField = new JTextField(15);
   JButton button = new JButton("Сделать попытку");
   JLabel label = new JLabel(numGuesses + " попыток");
   

   public GameFrame () {
       setSize(400, 300);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new FlowLayout());
       add(textField);
       add(button);
       add(label);
       button.addActionListener(this);
       pack();
       setVisible(true);
       
   }


    @Override
    public void actionPerformed(ActionEvent e) {
        String textFieldText = textField.getText();

        if (Integer.parseInt(textFieldText) == randomNumber) {
            button.setEnabled(false);
            textField.setText(textField.getText() + "Ура! Угадал!");
            textField.setEnabled(false);
        }else {
            textField.setText("");
            textField.requestFocus();
        }

        numGuesses++;
        String guessWord = (numGuesses == 1) ? " попытка" : " попыток";
        label.setText(numGuesses + guessWord);


    }
}
