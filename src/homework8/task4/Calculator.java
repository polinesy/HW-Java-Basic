package homework8.task4;

import java.util.Scanner;

public class Calculator {
    /*Створити клас калькулятор.
У ньому створити методи:
summ,
minus,
multiply,
division.
(Додавання, віднімання, множення та поділ відповідно.)
Кожен метод приймає як параметри два значення типу double. І виводить у консоль результат дії.
Також у класі є метод старт. Який виводить повідомлення в консоль, що калькулятор запущено. І пропонує ввести дію у вашій консолі.
Калькулятор повинен приймати лише такі типи дій:
2+4; - приклад синтаксису додавання;
5-6; - приклад синтаксису віднімання;
25*3; - Приклад синтаксису множення;
34/3; - Приклад синтаксису поділу;
Після введення на консоль виводиться відповідь цієї дії. І потім знову виводиться повідомлення про пропозицію ввести дію.
Програма закривається після введення Stop. Перед закриттям на консоль має виводитись повідомлення:
"Калькулятор закрито".*/
    private void multiply(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("Результат: " + result);
    }

    private void minus(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("Результат: " + result);
    }

    private void summ(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Результат: " + result);
    }

    private void division(double num1, double num2) {
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Результат: " + result);
        } else {
            System.out.println("Ділення на нуль неможливо.");
        }
    }

    private boolean isValidInput(String input) {
        String[] parts = input.split(" ");
        if (parts.length != 3){
            return false;}

        return true;
    }


    public void start() {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Калькулятор запущено.");
        System.out.println("Введіть дію у форматі \"число оператор число\", наприклад: 2 + 4 ");

        while (true) {
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Калькулятор закрито.");
                break;
            }

            if (isValidInput(input)) {
                String[] parts = input.split(" ");
                double num1 = Double.parseDouble(parts[0]);
                String operator = parts[1];
                double num2 = Double.parseDouble(parts[2]);

                switch (operator) {
                    case "+":
                        summ(num1, num2);
                        break;
                    case "-":
                        minus(num1, num2);
                        break;
                    case "*":
                        multiply(num1, num2);
                        break;
                    case "/":
                        division(num1, num2);
                        break;
                    default:
                        System.out.println("Введіть коректну дію.");
                        continue;
                }
            } else {
                System.out.println("Введіть коректну дію.");

            }
        }
        scanner.close();
    }



}





