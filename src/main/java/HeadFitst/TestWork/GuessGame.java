package HeadFitst.TestWork;

public class GuessGame {
    Player p1; //GuessGame содержит три переменных экзепляра для трех обьектов
    Player p2;
    Player p3;

    public void startGame () {
        p1 = new Player(); //Создаем три обьекта Player и присваиваем их трем переменным
        p2 = new Player();
        p3 = new Player();

        int quessp1 = 0; //Обьеявляем три переменных для хранения вариантов от каждого игрока
        int quessp2 = 0;
        int quessp3 = 0;

        boolean p1isRight = false;//Обьявляет три переменных для хранения правильности
        boolean p2isRight = false;//или неправельности (true/false) ответов игроков
        boolean p3isRight = false;

        int targetNumber  = (int) (Math.random()* 10);//Создаем число которые должны угадать игроки
        System.out.println("Я загадываю число от 0 до 9...");

        while (true){
            System.out.println("Число которое нужно угадать, - " + targetNumber);
            p1.quess(); // Вызываем метод guess() из каждого обьекта Player
            p2.quess();
            p3.quess();

            quessp1 = p1.number;
            System.out.println("Первый игрок думает что это " + quessp1); // Извлекаем варианты каждого игрока
            //(результата работы их методово quess()) получая доступ к их переменным number
            quessp2 = p2.number;
            System.out.println("Первый игрок думает что это " + quessp2);

            quessp3 = p3.number;
            System.out.println("Первый игрок думает что это " + quessp3);

            if (quessp1 == targetNumber){ //Проверяем варианты каждого из игроков на соотвествие загаданному
                p1isRight = true;        //числу.Если игрок угадал то присваиваем соотвествубщей переменной значение true
            }                           //(помните что по дефолту оно стоит false)
            if (quessp2 == targetNumber){
                p2isRight = true;
            }
            if (quessp3 == targetNumber){
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) { //Если первый игрок ИЛИ второй игрок ИЛИ третий угалал (|| - или)
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал?" + p1isRight);
                System.out.println("Второй игрок угадал?" + p2isRight);
                System.out.println("Третий игрок угадал?" + p3isRight);
                break;
            }else {
                System.out.println("Игроки должны попробовать еще раз");//Иначе остаемся в цикле и просим попробовать еще.
            }


        }



    }
}
