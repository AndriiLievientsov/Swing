package CollectionsStreams;
import java.util.ArrayList;

public class Save5Znacheniy {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        fillTheList(list);
        for (Integer n: list){
            System.out.println(n);
        }
    }

    public static void fillTheList (ArrayList<Integer> list) {
        list.add(85);
        list.add(19);
        list.add(0);
        list.add(103);
        list.add(13);
    }


}
