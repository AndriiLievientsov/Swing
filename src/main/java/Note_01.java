import static jdk.internal.org.jline.utils.Colors.s;

public class Note_01 {
    public static void main(String[]  args) throws InterruptedException {
//    //класс реализующий интрефейс Runnable
//        class MyThreadClass implements Runnable {
//           //описание метода run
//            @Override
//            public void run() {
//                Thread thr;
//                thr = Thread.currentThread();
//                for (int i = 1; i < 5 ; i++) {
//            // получаем имя текущего потока
//            // и выводим на печать имя и значение счетчика
//                    System.out.println(thr.getName() +": "+i);
//                    try {
//                        Thread.sleep(2500);
//                    }catch (InterruptedException e) {
//                        System.out.println("Прерывания дочернего потока");
//                    }
//                }
//            }
//        }
//
//        // создаем несколько объектов дочерних потоков
//        Thread thr1 = new Thread(new MyThreadClass(),"Поток 1");
//        Thread thr2 = new Thread(new MyThreadClass(),"Поток 2");
//        Thread thr3 = new Thread(new MyThreadClass(),"Поток 3");
//        // запускаем дочерние потоки
//        thr1.setPriority(1);
//        thr2.setPriority(10);
//        thr3.setPriority(5);
//
//
//        thr1.start();
//        thr2.start();
//        thr3.start();
//        // цикл главного потока
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Главный поток: "+i);
//            Thread.sleep(1500);
//           }
//        // проверяем, работает ли дочерний поток
//        // если хотя бы один работает, то ждем, пока он завершит работу
//        if(thr1.isAlive() || thr2.isAlive() || thr3.isAlive()) {
//            System.out.println("ждем завершение дочерних потоков");
//            thr1.join();
//            thr2.join();
//            thr3.join();
//        }
//        System.out.println("Все процессы завершены");

//        class MyThreadClass implements Runnable {
//
//            @Override
//            public void run() {
//                int i = 0;
//                while (true) {
//                    System.out.println(i);
//                    i++;
//                    try{
//                        Thread.sleep(500);
//                    }catch (InterruptedException e){
//                        System.out.println("Прерывание дочернего потока");
//                    }
//                }
//            }
//
//        }
//
//        Thread thr = new Thread(new MyThreadClass());
//        thr.setDaemon(true);
//        thr.start();
//        JOptionPane.showConfirmDialog(null, "Остановить программу?",
//                "Пример потока демона", JOptionPane.DEFAULT_OPTION);
//        System.exit(0);

        // класс для создания объекта общего ресурса
//            class CommonResClass {
//                int x = 0;
//            }
//        // класс для создания потоков
//        class  CountClass implements Runnable{
//          CommonResClass res;
//          //конструктор класса
//          CountClass(CommonResClass res){
//              this.res=res;
//          }
//            @Override
//            public void run() {
//            // объявляем ресурс res как синхронизированный
//                synchronized (res) {
//                    //присваиваем полю обьекта начальное значение
//                    res.x = 1; //из за того что CommonResClass задано что X это int, в run мы уже не пишем
//                    // int x = 1. мы сразу ссылаемся на res
//                    for (int i = 1; i <=5; i++) {
//                        System.out.println(»%s %d \n», Thread.currentThread().getName (), res. x);
//                    }
//
//
//                }
//            }

//        }


//--------------Пример синхронизации потоков через синхронизированный объект----------------
        /*
        public class Counter {
            private int count;

            public Counter() {
                count = 0;
            }

            public void increment() {
                synchronized (this) {
                    count++;
                }
            }

            public int getCount() {
                synchronized (this) {
                    return count;
                }
            }
        }

        public class IncrementThread implements Runnable {
            private Counter counter;

            public IncrementThread(Counter counter) {
                this.counter = counter;
            }

            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        }

        public class Main {
            public static void main(String[] args) throws InterruptedException {
                Counter counter = new Counter();

                Thread thread1 = new Thread(new IncrementThread(counter));
                Thread thread2 = new Thread(new IncrementThread(counter));

                thread1.start();
                thread2.start();

                thread1.join();
                thread2.join();

                System.out.println("Результат: " + counter.getCount());
            }
        }
*/

//--------------Пример синхронизации потоков через синхронизированный метод----------------
        /*
         class Counter {
            private int count;

            public Counter() {
                count = 0;
            }

            public synchronized void increment() {
                count++;
            }

            public synchronized int getCount() {
                return count;
            }
        }

         class IncrementThread implements Runnable {
            private Counter counter;

            public IncrementThread(Counter counter) {
                this.counter = counter;
            }

            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        }

                Counter counter = new Counter();

                Thread thread1 = new Thread(new IncrementThread(counter));
                Thread thread2 = new Thread(new IncrementThread(counter));

                thread1.start();
                thread2.start();

                thread1.join();
                thread2.join();

                System.out.println("Результат: " + counter.getCount());
*/

        /*----------// объявляем функциональный интерфейс------------*/
//        // объявляем функциональный интерфейс
//        interface MyFunction {
//            // метод по умолчанию
//            default void doit (int n) {
//                System.out.println ("Результат: "+calc (n));
//            }
//        // абстрактный метод
//        double calc (int n);
//        }
//
//// присваиваем лямбда-выражение
//// (возведение в куб)
//                MyFunction Cube= (int n) -> {
//                    return Math. pow (n,3);
//                };
//// (возведение в квадрат)
//                MyFunction Square= (int n) -> {
//                    return Math. pow (n,2);
//                };
//// (умножение на 5)
//                MyFunction Mult= (int n) -> {
//                    return n*5;
//                };
//// отправляем код выражения Cube
//                Cube.doit (3);
//// отправляем код выражения Square
//                Square.doit (12);
//// отправляем код выражения Mult
//                Mult.doit (5);
//// переопределяем код выражения Mult
//                Mult=n-> n*10;
//// повторно отправляем код выражения Mult
//                Mult.doit (5);






    }
}
