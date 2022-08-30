package lesson2;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

    }
    public static boolean leapYear (int year) {
        if (year % 4 == 0 ||  year % 400 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }
    public static void stringAndNumber(String st,int number) {
        for (int i = 0; i < number ; i++) {
            System.out.println(st);
        }
    }
    public static boolean checkNumberTwo(int number) {
        if (number >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    public static boolean checkTwoNumber(int one,int two) {
        int resul = one + two;
        if (resul >= 10 && resul <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
