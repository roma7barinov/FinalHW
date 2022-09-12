package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private final static String X = "X";
    private final static String O = "0";
    private final static String NULL = "•";
    private final static int SIZE = 3;
    private final static String[][] arr = new String[SIZE][SIZE];

    private final static Scanner scanner = new Scanner(System.in);
    private final static Random rand = new Random();

    public static void main(String[] args) {

        game();

    }

    private static void game() {
        creatArr();
        printArr();

        while (true) {
            humanHod();
            if (cheakWin(X)) {
                System.out.println("You winner!");
                break;
            }
            if (ifFullTable()) {
                System.out.println("Таблица заполнена");
                break;
            }
            printArr();
            robotHod();
            if (cheakWin(O)) {
                System.out.println("Winner ROBOT");
                printArr();
                break;
            }
            if (ifFullTable()) {
                System.out.println("ТАблица заполнена");
                break;
            }
            printArr();


        }
        System.out.println("Игра закончена");
    }

    public static boolean ifFullTable() {
        for (int i = 0; i < SIZE ; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (arr[i][j] == NULL) {
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean cheakWin (String s){
        boolean res = false;
        //проверка по строкам
        for (int i = 0; i < SIZE ; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(arr[i][0] == s && arr[i][1] == s && arr[i][2] == s) {
                    res = true;
                    break;
                }
            }
        }
        //проверка по столбцам
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(arr[0][i] == s && arr[1][i] == s && arr[2][i] == s) {
                    res = true;
                    break;
                }
            }
        }
        //по горизлнтали
        if(arr[0][0] == s && arr[1][1] == s && arr[2][2] == s){
            res = true;

        }

        //по обратная горизонталь
        if(arr[0][2] == s && arr[1][1] == s && arr[2][0] == s) {
            res = true;
        }

        return res;

    }

    public static boolean cheackNum(int x, int y) {
        //если true = свободна false = занята
        boolean rell = false;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (arr[x - 1][y - 1] == NULL) {
                    rell = true;
                    break;
                } else {
                    rell = false;
                }
            }
        }
        return rell;
    }

    private static void robotHod() {
        System.out.println("----------Ход компьютера--------");

        while (true) {
            int x = (int) (Math.random() * 3 + 1);
            int y = (int) (Math.random() * 3) + 1;


            if (diapozonNum(x,y)) {
                if (cheackNum(x,y)) {
                    for (int i = 0; i < SIZE; i++) {
                        for (int j = 0; j < SIZE; j++) {
                            arr[x - 1][y - 1] = O;

                        }
                    }
                    break;
                }
            }
        }
    }
    private static boolean diapozonNum(int x,int y) {
        if (x <= 3 && x > 0 && y <= 3 && y > 0) {
            return true;
        }
        return false;
    }

    private static void humanHod() {

        while (true) {
            System.out.println("---------Ход человека-----------");
            System.out.println("Укажите координаты X :");
            int x = scanner.nextInt();
            System.out.println("Укажите координаты Y :");
            int y = scanner.nextInt();

            if (cheackNum(x, y) == true) {
                if (x <= 3 && x > 0 && y <= 3 && y > 0) {
                    for (int i = 0; i < SIZE; i++) {
                        for (int j = 0; j < SIZE; j++) {
                            arr[x - 1][y - 1] = X;
                        }
                    }
                    break;
                } else {
                    System.out.println("!!!!Вы ввели не правильные координаты !!!!!");
                    System.out.println("!!!!Побробуй ещё раз!!!!!");
                }
            } else {
                System.out.println("Ваша позиция занята");
            }


        }
    }

    private static void printArr() {
        for (int i = 0; i < SIZE + 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void creatArr() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                arr[i][j] = NULL;
            }
        }
    }
}
