package Masiv;

public class ShowGuests3 {
    public static void main(String[] args) {
        int [] guests = {1,4,2,0,2,1,4,3,0,2};
        int room = 0;

        System.out.println("Комната\t   Количество постояльцев");
        for (int numGuest : guests) {
            System.out.print(room++);
            System.out.print("                \t");
            System.out.println(numGuest);
        }
    }
}
