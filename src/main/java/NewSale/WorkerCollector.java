package NewSale;

import java.util.ArrayList;

public class WorkerCollector {
    public static void main(String[] args) {
        ArrayList <Worker> workers = new ArrayList<>();
        fillTheList (workers);
        int bonus = 100;

        workers.stream()
                .filter((worker) -> worker.getEffect() >= 3) // Отбираем работников с effect 3 или больше
                .forEach(worker -> worker.setBonus(bonus)); // Устанавливаем бонус 100 для каждого отобранного работника

             // Проверим результат, напечатаем всех работников и их бонусы
                workers.forEach(worker -> System.out.println(worker.getName()
                        + " - Бонус: " + worker.getBonus()));


    }


    static void fillTheList (ArrayList <Worker> workers) {
        workers.add(new Worker("Jon",2));
        workers.add(new Worker("Tom",1));
        workers.add(new Worker("Oleg",3));
        workers.add(new Worker("Alex",3));
        workers.add(new Worker("Kendra",5));
        workers.add(new Worker("Jec",23));
        workers.add(new Worker("Frank",3));
    }
}
/*

Задача:
Каждому сотруднику соответствуют имя и показатель эффективности.
Подсчитайте общую сумму, выплачиваемую в виде бонусов,
если каждый сотрудник получает бонус в размере $1 00 в случае,
когда его показатель эффективности равен 3 или выше.


Пояснение
int bonus = 100; — Здесь мы создаем переменную bonus и присваиваем ей значение 100.

.filter(worker -> worker.getEffect() >= 3) — Этот фильтр выбирает только работников, у которых effect равен 3 или больше.

.forEach(worker -> worker.setBonus(bonus)) — Для каждого отобранного работника устанавливаем бонус,
используя метод setBonus(bonus).
После выполнения этого кода, все работники с effect >= 3 будут иметь бонус 100.
* */