package HeadFitst;

public class Dog {
    String name;
    public static void main(String[] args) {
        //создаем обьект Dog и получаем к нему доступ
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Барт";

        //Теперь создадим массив типа Dog
        Dog[] myDog = new Dog[3];
        //и помещаем в него несколько элементов
        myDog[0] = new Dog();
        myDog[1] = new Dog();
        myDog[2] = new Dog();
        //Теперь получаем доступ к обьектам Dog с помощью ссылок из массива
        myDog [0].name = "Фред";
        myDog [1].name = "Джордж";
        //Хммм какое имя у myDog[2]?
        System.out.print("Имя последней собаки - ");
        System.out.println(myDog[2].name);
        //Теперь переберем все элементы массива и вызовем для каждого метода bark ()
        int x = 0;
        while (x < myDog.length){
            myDog[x].bark(); // массивы содержат переменную length которая предоставляет..
            x = x + 1;       // количество хранимых элементов
        }

    }

    public void bark () {
        System.out.println(name + " сказал Гав");
    }
    public void eat () {};
    public void chaseCat () {};

}

