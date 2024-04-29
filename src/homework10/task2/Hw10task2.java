package homework10.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hw10task2 {

    public static class InvalidIndexException extends Exception {
        public InvalidIndexException(String message) {
            super(message);
        }
    }

    public static class InvalidArrayAccessException extends Exception {
        public InvalidArrayAccessException(String message) {
            super(message);
        }
    }

    public static double getElementDivision() throws InvalidIndexException, InvalidArrayAccessException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array;
        array = new int[random.nextInt(30) + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(31);
        }
        System.out.print("Введіть індекс елементу масиву: ");
        int index = scanner.nextInt();
        if (index < 0 || index >= array.length) {
            throw new InvalidIndexException("Неправильний індекс: " + index);
        }
        if (array[0] == 0) {
            throw new InvalidArrayAccessException("Ділення на нуль неможливе");
        }
        return (double) array[index] / array[0];

    }
}
