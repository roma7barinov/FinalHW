package lesson1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

    }
    public static void compareNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pleas enter A: ");
        int a = scanner.nextInt();
        System.out.println("pleas enter B: ");
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static void  printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        int c = a + b;
        if ( c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100 ) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

}
