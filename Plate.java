package Hw6Java;

public class Plate {
    private double food;

    public Plate() {
        this(100);
    }

    public Plate(double food) {
        if (food < 0) {
            throw new IllegalArgumentException("food must be positive.");
        }
        this.food = food;
    }

    public void increaseFood(double food) {
        if (food > 0) {
            this.food += food;
        }
    }

    public double decreaseFood(double food) {
        if (this.food >= food) {
            this.food -= food;
            return food;
        }
        food = this.food;
        this.food = 0;
        return food;
    }

    public boolean isEmptyPlate() {
        if (food > 0) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "food: " + food;
    }
}
