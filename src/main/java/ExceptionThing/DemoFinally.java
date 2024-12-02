package ExceptionThing;

public class DemoFinally {
    public static void main(String[] args) {

        try {
            doSomething();
        }catch (Exception e) {
            System.out.println("Исключение перехвачено в main");
        }
    }
    sta0tic void doSomething () {
        try {
            System.out.println(0 / 0);
        }catch (Exception e) {
            System.out.println("Исключение перехвачено в doSomething.");
            System.out.println(0 / 0);
        }finally {
            System.out.println("Выведено в блоке finally");
        }
        System.out.println("Это сообщение не будет выведено.");
    }
}
