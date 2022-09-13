package lesson6;

public abstract class Animal {

    protected int runMax;
    protected int swimMax;
    protected String name;

    protected static int coin;

    protected  Animal() {
        coin++;
    }

    public abstract void run(int n);

    public abstract void swim(int n);

    public static int getCoin() {
        return coin;
    }

}
