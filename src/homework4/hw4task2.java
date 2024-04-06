package homework4;

import java.util.Scanner;

public class hw4task2 {

    /*Написать программу в которой пользователь вводит с клавиатуры число,
а программа определяет, является она палиндромом или нет.
И выводит данную информацию на экран.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert any number: ");
        int intFromScanner = scanner.nextInt();
        String yourNumber = Integer.toString(intFromScanner);
        StringBuilder palindrom = new StringBuilder(yourNumber).reverse();

        if (yourNumber.equals(palindrom.toString())) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }

    scanner.close();

    }
}
