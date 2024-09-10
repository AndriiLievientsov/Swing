package Masiv;

public class ShowGuests2 {
    public static void main(String[] args) {
        int[] quests = {1,4,4,0,2,1,4,3,0,2};
        System.out.println("Комната\tКоличество постояльцев");
        for (int roomNun = 0; roomNun < 10; roomNun++) {
            System.out.print(roomNun);
            System.out.print("             \t");
            System.out.println(quests[roomNun]);
        }

    }
}
