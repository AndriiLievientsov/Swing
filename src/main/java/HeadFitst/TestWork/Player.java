package HeadFitst.TestWork;

public class Player {
    int number = 0;//тут хранится вариант числа
    public void quess() {
        number = (int) (Math.random()* 10);
        System.out.println("Думаю число " + number);
    }
}
