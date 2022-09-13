package lesson6;

public class Cat extends Animal{

    private int runMax = 200;
    private int swimMax = 0;

    private static int coin = 0;

    public Cat(){
        coin++;
    }


    @Override
    public void run(int n) {
        if(n <= runMax) {
            System.out.println("Cat run :" + n);
        } else {
            System.out.println("Cat no run");
        }
    }

    @Override
    public void swim(int n) {
        System.out.println("Cat no swim");
    }

    public static int getCoin(){
        return coin;
    }


}
