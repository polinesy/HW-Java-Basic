package homework6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hw6task1 {
    /*1) Користувач визначає розмірність двовимірного масиву з клавіатури.
Масив заповнюється випадковими числами від 0 до 1000.
Необхідно створити одновимірний масив, що складається з максимальних значень кожного окремого масиву, що входить у двовимірний.
Новий отриманий масив вивести на екран.*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введіть кількість рядків для масиву: ");
        int number1 = scanner.nextInt();
        System.out.println("Введіть кількість стовбців для масиву: ");
        int number2 = scanner.nextInt();

        int [] [] doubleArray = new int [number1] [number2];

        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++){
                doubleArray[i][j] = random.nextInt(0, 1000);
        }
        }

        int[] maxValuesArray = new int[number1];

        for (int i = 0; i < number1; i++) {
            int max = doubleArray[i][0];
            for (int j = 1; j < number2; j++) {
                if (doubleArray[i][j] > max) {
                    max = doubleArray[i][j];
                }
            }
            maxValuesArray[i] = max;
        }

        System.out.println(Arrays.toString(maxValuesArray));













    }
}
