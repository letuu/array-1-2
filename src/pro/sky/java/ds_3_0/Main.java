package pro.sky.java.ds_3_0;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание Массивы-1");
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1 *******************************************************************");
        //Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new
//        int[] arr0 = new int[] {1, 2, 3};
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        System.out.println(arr1[0] + "\n" + arr1[1] + "\n" + arr1[2] + "\n");

        //Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями
        double[] arr2 = {1.57, 7.654, 9.986};
        System.out.println(arr2[0] + "\n" + arr2[1] + "\n" + arr2[2] + "\n");

        //Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
        //с помощью ключевого слова или сразу заполненный элементами.
        float[] arr3 = {1.22f, 5.56f, 10.9f, 658146.56f};
        System.out.println(arr3[0] + "\n" + arr3[1] + "\n" + arr3[2] + "\n" + arr3[3] + "\n");
//        char[] arr4 = {'a', 's', 'd', 'f'};
    }

    public static void task2() {
        System.out.println("Задача 2 *******************************************************************");
        int[] arr1 = {1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        float[] arr3 = {1.22f, 5.56f, 10.9f, 658146.56f};

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i != arr3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
    }

    public static void task3() {
        System.out.println("Задача 3 *******************************************************************");
        int[] arr1 = {1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        float[] arr3 = {1.22f, 5.56f, 10.9f, 658146.56f};

        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(arr3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
    }

    public static void task4() {
        System.out.println("Задача 4 *******************************************************************");
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
//            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
