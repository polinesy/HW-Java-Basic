package homework3;

import java.util.Scanner;

public class hw3task1 {
    /*Ви маєте рядок “Я тестую чудово. Що ще потрібно?”, яку потрібно ввести з клавіатури у консоль.
    Необхідно за допомогою тільки методу next() класу Scanner (не використовуємо метод nextLine()) присвоїти змінним типу String наступні значення:
    string1 = Я
    string2 = тестую
    string3 = чудово
    string4 = Що ще потрібно?
    Крім string1, string2, string3, string4 нових змінних створювати не можна.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть у консоль: \"Я тестую чудово. Що ще потрібно?\"");

        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next().replace(".", "");
        String string4 = scanner.next() + " " + scanner.next() + " " + scanner.next() + " ";


        System.out.println(string1 + " " + string2 + " " + string3 + ". " + string4);

        scanner.close();

    }

}
