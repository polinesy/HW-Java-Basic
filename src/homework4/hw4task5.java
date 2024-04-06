package homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hw4task5 {
    /*Есть одномерный массив из 10 элементов, заполнен-
ный случайными числами. Пользователь вводит с клавиатуры
число. Программа показывает есть ли такое число в созданном
до этого массиве.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.print("Введите число для поиска: ");
        int number = scanner.nextInt();

        boolean found = false;
        for (int num : array) {
            if (num == number) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число " + number + " найдено в массиве.");
        } else {
            System.out.println("Число " + number + " не найдено в массиве.");
        }

    }
}
