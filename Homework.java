package Hw6Java;

import java.util.ArrayList;
import java.util.List;

public class Homework {

    /**
     * Добавить в кота следующее. Пусть голод кота оценивается не true\false, а по
     * шкале (1, 2, ..., 10).
     * Кот хочет съесть то количество еды, каков его текущий голод. Например, если
     * аппетит кота = 100, а голод 5, то он съест 50.
     * Кот съедает все, что есть в тарелке. Например, в тарелке 50, коту нужно 70,
     * он съест 50.
     *
     * Пример.
     * Кот, его аппетит = 100
     * Пусть кот сыт наполовину, то есть его голод = 5. То есть, ему нужно 50 единиц
     * еды.
     * Пусть в тарелке 25 единиц еды.
     * После обеда, сытость кота будет равна 7, а еда в тарелке закончится.
     */
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Vasya", 30, 25));
        cats.add(new Cat("Grey"));
        cats.add(new Cat("Bob", 10));
        cats.add(new Cat());
        Plate plate = new Plate();
        for (Cat cat : cats) {
            if (plate.isEmptyPlate()) {
                plate.increaseFood(240);
                System.out.println("Plate is empty. Add " + plate);
            }
            System.out.println(cat.getName() + " start eat.");
            cat.eat(plate);
            System.out.println(
                    cat.getName() + " end eat. Satiety: " + cat.getSatiety());
            System.out.println(plate);
        }
    }

}
