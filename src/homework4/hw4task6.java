package homework4;

import java.util.Arrays;
import java.util.Random;

public class hw4task6 {
    /*Заполнить массив на 45 элементов случайными числами
от -50 до +50. Найти минимальный элемент и вывести его
на консоль. Найти максимальный элемент и вывести его на
консоль.*/

    public static void main(String[] args) {
        int[] array = new int[45];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101) - 50; // Генерация чисел от -50 до +50
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);

    }
}
