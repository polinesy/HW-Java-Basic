package homework3;

import java.util.Scanner;

public class hw3task4 {

    public static void main(String[] args) {

        /*(Використовувати оператори if-else-if) Користувач вводить з клавіатури числа:
        Якщо число дорівнює 1, виведення на консоль “Понеділок”;
        Якщо число дорівнює 2, виведення на консоль “Вівторок”;
        Якщо число дорівнює 3, виведення на консоль “Середа”;
        Якщо число дорівнює 4, виведення на консоль “Четвер”;
        Якщо число дорівнює 5, виведення на консоль “П'ятниця”;
        Якщо число дорівнює 6, виведення на консоль “Субота”;
        Якщо число дорівнює 7, то виведення на консоль "Неділя";
        В іншому випадку виводимо текст: "Краще б сьогодні була п'ятниця".*/

        Scanner scannerForNumbers = new Scanner(System.in);

        System.out.println("Введіть ваше число: ");

        int numberFromScanner = scannerForNumbers.nextInt();
        if (numberFromScanner == 1) {
            System.out.println("Понеділок");
        } else if (numberFromScanner == 2) {
            System.out.println("Вівторок");
        } else if (numberFromScanner == 3) {
            System.out.println("Середа");
        } else if (numberFromScanner == 4) {
            System.out.println("Четвер");
        } else if (numberFromScanner == 5) {
            System.out.println("П'ятниця");
        } else if (numberFromScanner == 6) {
            System.out.println("Субота");
        } else if (numberFromScanner == 7) {
            System.out.println("Неділя");
        } else {
            System.out.println("Краще б сьогодні була п'ятниця...");

        }

            scannerForNumbers.close();




    }
}
