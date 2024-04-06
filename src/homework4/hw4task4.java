package homework4;

import java.util.Scanner;

public class hw4task4 {
    /*Первый будет состоять из следующих имен:
"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб".
Второй будет содержать следующие значения типа int:
10, 12, 14, 16, 18, 20.
Третий будет содержать следующие значения:
"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику".
Пользователь вводит три числа с клавиатуры, которые будут соответствовать
индексам каждого из элементов массивов.
Пример1. после ввода 3,2,1:
На экране должно вывестись следующее сообщение:
"Федя будет идти в магазин в 14:00"
Пример2. после ввода 1,2,3:
На экране должно вывестись следующее сообщение:
"Маша будет идти в тренажерный зал в 14:00"*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        String [] place = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};
        int[] time = {10, 12, 14, 16, 18, 20};

        System.out.println("Введите индексы через запятую: ");
        String userInput = scanner.nextLine();

        String[] inputArray = userInput.split(",");
        int nameIndex = Integer.parseInt(inputArray[0].trim());
        int placeIndex = Integer.parseInt(inputArray[1].trim());
        int timeIndex = Integer.parseInt(inputArray[2].trim());

        String name = names[nameIndex];
        String placeName = place[placeIndex];
        int timeValue = time[timeIndex];

        System.out.println(name + " будет идти в " + placeName + " в " + timeValue + ":00");

        scanner.close();

    }
}
