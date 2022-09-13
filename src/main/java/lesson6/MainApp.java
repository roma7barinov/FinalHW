package lesson6;

public class MainApp {
    public static void main(String[] args) {


        Animal[] arr = new Animal[4];
        arr[0] = new Cat();
        arr[1] = new Dog();
        arr[2] = new Cat();
        arr[3] = new Dog();

        for (int i = 0; i < arr.length ; i++) {
            arr[i].run(250);
            arr[i].swim(9);
            System.out.println("_____________");
        }




        System.out.println(Cat.getCoin());
        System.out.println(Dog.getCoin());
        System.out.println(Animal.getCoin());
    }
}
