package main.java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

        checkSumSign1();
        printConsole(2);
        printConsole1(7);
        printConsolePerNTimes("like", 3);
        System.out.println(returnBoolean(2009)); // false
        System.out.println(returnBoolean(2012)); // true - 4
        System.out.println(returnBoolean(1900)); // false -  100
        System.out.println(returnBoolean(1600)); // true - 400
        System.out.println(Arrays.toString(printArray()));
        System.out.println(Arrays.toString(printArray1()));
        System.out.println(Arrays.toString(arrayCycle()));
        arrayDoubleCycle();
        System.out.println(Arrays.toString(returnArray(100, 2)));
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 10;
        int result = a + b;

        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a1 = 5;
        int b1 = 10;

        if (a1 >= b1) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    public static void checkSumSign1() {

        int a2 = 9;
        int b2 = 12;
        int sum = a2 + b2;
        if (sum >= 10 && sum <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public static void printConsole(int w) {
        if (w >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }

    }

    public static void printConsole1(int q) {
        if (q < 0) {
            System.out.println(true);
        } else if (q >= 0) {
            System.out.println(false);
        }
    }

    public static void printConsolePerNTimes(String a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(a);

        }
    }

    public static boolean returnBoolean(int year) {
        int year1 = year % 4;
        int year2 = year % 100;
        int year3 = year % 400;

        if (year1 == 0 && year2 != 0 || year3 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static int[] printArray() {
        int[] array = {0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
                continue;
            }
            if (array[i] == 0) {
                array[i] = 1;
            }
        }
        return array;
    }

    public static int[] printArray1() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;

        }
        return array;
    }

    public static int[] arrayCycle() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 6) {
                array[i] = array[i] * 2;
            }
        }

        return array;
    }

    public static int[][] arrayDoubleCycle() {
        int[][] array = new int[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }
        return array;
    }

    public static int[] returnArray(int len, int initialValue) {
        int[] array = new int[len];

        Arrays.fill(array, initialValue);

        return array;
    }
}



















