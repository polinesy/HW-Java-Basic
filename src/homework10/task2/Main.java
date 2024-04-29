package homework10.task2;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        try {
            double result = Hw10task2.getElementDivision();
            System.out.println("Результат ділення: " + result);
        } catch (Hw10task2.InvalidIndexException | Hw10task2.InvalidArrayAccessException | InputMismatchException e) {
            System.out.println("Сталася помилка: " + e.getMessage());
        }

    }
}
