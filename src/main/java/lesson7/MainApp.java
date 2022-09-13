package lesson7;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Cat[] arr = {
                new Cat("Roma",5),
                new Cat("Bob",4),
                new Cat("Ted",7),
        };

        Plate plate = new Plate(15);
        printInfo(arr,plate);

        System.out.println("----Коты едят----");
        catsEting(arr,plate);
        printInfo(arr,plate);

        addFood(plate);

        System.out.println("---------Коты едят----------");
        catsEting(arr,plate);
        printInfo(arr,plate);



    }
    private static void addFood(Plate plate) {
        Scanner scanner = new Scanner(System.in);
        plate.addFood(scanner.nextInt());
    }

    private static void catsEting(Cat[] cats,Plate plate) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
    }
    private static void printInfo(Cat[] cats, Plate plate) {
        plate.info();

        for (int i = 0; i < cats.length; i++) {
            System.out.println("Кот: " + cats[i].getName() + " " + "Cытость: " + cats[i].getAppetite() + " " + "Сыт? :" + cats[i].getSatiety());
        }




    }
}
