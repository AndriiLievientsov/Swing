package gui;

public class MasivTestGUI {
    public static void main(String[] args) {
        DummiesFrame frame = new DummiesFrame("Сколько жильцов в комнате?");
        frame.addRow("Введите о каком номере хотите знать. От 0 до 10");
        frame.setButtonText("Узнать");
        frame.go();
    }

    public static int calculate(int room) {
        MasivTestClass masivTestClass = new MasivTestClass(room);
        return masivTestClass.getGuest();
    }

}


/*      int[] quests = {1,4,4,0,2,1,4,3,0,2};
        System.out.println("Комната\tКоличество постояльцев");
        for (int roomNun = 0; roomNun < 10; roomNun++) {
            roomNun;
            System.out.print("             \t");
            System.out.println(quests[roomNun]);
        }*/
