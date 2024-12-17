package InterfaceStuff;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {21.7,68.3,5.5};
        ColumnOfNumbers column = new ColumnOfNumbers(numbers);

        displayMe(column);
        summarizeMe(column);

        Table table = new Table("C:\\Users\\Apafios\\IdeaProjects\\Swing-HeadFirst\\src\\main\\java\\InterfaceStuff\\MyTable.txt");

        displayMe(table);
        summarizeMe(table);
        delateMy(table);
    }

    static void displayMe (Displayable displayable) {
        displayable.display();
        System.out.println();
    }

    static void summarizeMe (Summarizable summarizable) {
        System.out.println(summarizable.summarize());
        System.out.println();
    }

    static  void  delateMy (Deletable deletable) {
        deletable.deletable();
        System.out.println();
    }



}
/*тут реализация дай бог на Тройку. чисто игрался*/
