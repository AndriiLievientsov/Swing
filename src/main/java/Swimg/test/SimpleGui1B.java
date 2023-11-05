package Swimg.test;
import javax.swing.*;

/*Новый оператор импорта для пакета в котором хранятся
ActionListener и ActionEvent*/
import  java.awt.event.*;

/*Реализуем интерфейс. Когда говорит:Экзепляр SimpleGuiB реализует интерфейс ActionListener
Кнопка будет передавать события только тем кто реализует ActionListener*/
public class SimpleGui1B implements ActionListener {
    JButton button;
    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }
    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");

        /*Регестрируем нашу заинтересованость в кнопке. Код говорит кнопке:
        "Добавь меня к своему списку слушателей". Передаваемый аргумент ДОЛДЕН быть обьектом
        класса реализуемого ActionListener*/
        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    /*Реализуем метод actionPerformed (Интерфейса ActionListener).
    Это фактически метод обработки событий*/
    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I have been clicked");
    }
    /*Кнопка вызывает этот метод чтобы известить о настплении события Она отправляет обьект ActionEvent
    как аргумент но он нам не нужен. Достаточно знать что событие произошло*/
}
