package gui;

public class MasivTestClass {
    int room;
    int guest;
    int[] guestAll = {1, 44, 55, 369, 2, 0, 11, 2, 41, 9, 15}; // Массив жильцов

    public MasivTestClass(int room) {
        this.room = room; // Переводим номер комнаты в индекс массива
        calculate(); // Вызываем calculate() при создании объекта
    }

    public int getRoom() {
        return room; // Возвращаем реальный номер комнаты (не индекс)
    }

    public int getGuest() {
        return guest;
    }

    public void calculate() {
        guest = guestAll[room];
    }
}
