package Hw6Java;

import java.util.Objects;

public class Cat {

    private String name;
    private double appetite;
    private double satiety;

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public Cat() {
        this("Street cat");
    }

    public Cat(String name) {
        this(name, 100);
    }

    public Cat(String name, int appetite) {
        this(name, appetite, 0);
    }

    public String getName() {
        return name;
    }

    public Double getSatiety() {
        return satiety;
    }

    public void eat(Plate plate) {
        double eatTillFull = (appetite * (100 - satiety)) / 100;
        double howMuchEat = plate.decreaseFood(eatTillFull);
        if (howMuchEat == eatTillFull) {
            this.satiety = 100;
        } else {
            this.satiety = (this.appetite - eatTillFull + howMuchEat) / (this.appetite / 100);
        }
    }

    @Override
    public String toString() {
        return (name + " appetite: " + appetite + " satiety: " + satiety);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj instanceof Cat anotherCat) {
            return name.equals(anotherCat.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
