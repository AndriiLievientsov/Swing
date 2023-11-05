package Swimg.test;
import javax.swing.*;//Импортируем пакет Swing
public class SimpleGui1 {
    public static void main(String[] args) {
        //Создаем фрейм и кнопку
        JFrame frame = new JFrame();

        //Передаем конструктору кнопки текст,который будет на ней отображен
        JButton button = new JButton("Click me");

        /*Эта строка завершает работу программы при закрытии окна (если вы не добавите ее, то
        прилежение будет "висеть" на экране Вечно)*/
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Добавляем кнопку на панели фрейма
        frame.getContentPane().add(button);

        //Присваиваем фрейму размер (в пикселях)
        frame.setSize(300,300);

        /*Делаем фрейм видимым (если вы пропустите этот шаг то выполнимв данный
        код ничего не удивдет*/
        frame.setVisible(true);//
    }


}
