package lesson6;

public class Dog extends Animal{

    private int runMax = 500;
    private int swimMax = 10;

    private static int coin = 0;

    public Dog(){
        coin++;
    }
    public static int getCoin(){
        return coin;
    }

    @Override
    public void run(int n) {
        if(n <= runMax) {
            System.out.println("Dog run :" + n);
        } else {
            System.out.println("Dog no run");
        }
    }

    @Override
    public void swim(int n) {
        if(n <= swimMax) {
            System.out.println("Dog swim :" + n);
        } else {
            System.out.println("Dog no run");
        }
    }
}
