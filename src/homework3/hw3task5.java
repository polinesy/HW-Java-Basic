package homework3;

import java.util.Scanner;

public class hw3task5 {

    public static void main(String[] args) {
        /*Написати програму, використовуючи тернарний оператор, де користувач вводить з клавіатури два числа і символ – + або % або / або *.
        На екран виводиться результат дії над двома введеними числами.
        Якщо користувач ввів щось окрім даних символів, необхідно вивести 0.*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введіть операцію (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);
        double result = operator == '+' ? num1 + num2 :
                operator == '-' ? num1 - num2 :
                        operator == '*' ? num1 * num2 :
                                operator == '/' ? num1 / num2 :
                                        operator == '%' ? num1 % num2 : 0;

        System.out.println("Результат: " + result);

        scanner.close();
        }






    }


