package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("Plate :" + food);
    }

    public void decreacFood(int appetity) {
        this.food -= appetity;
    }

    public void addFood(int food) {
        this.food += food;
    }

    public boolean isFoodEnogh(int food) {
        return getFood() >= food;
    }
}
