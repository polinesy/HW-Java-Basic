package homework3;

import java.util.Scanner;

public class hw3task3 {

    public static void main(String[] args) {

        /*За допомогою тернарного оператора необхідно отримати різницю двох чисел, введених з клавіатури,
        і завжди віднімати від більшого менше.
        Вивести цю різницю в консоль.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перше число:");
        int number1 = scanner.nextInt();
        System.out.println("Введіть друге число:");
        int number2 = scanner.nextInt();

        int difference = number1 > number2 ? number1 - number2 : number2 - number1;

        System.out.println("Різниця між числами: " + difference);

        scanner.close();


    }
}
