package homework4;

import java.util.Scanner;

public class hw4task1 {
/*Написать программу, которая будет считывать введенные пользователем
слова с клавиатуры слова, и склеивать их в одно предложение до тех пор,
пока пользователь не введет с клавитуры слово STOP.
Все слова введенные до этого должны отобразится в консоли
одним предложением.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sentence = new StringBuilder();

        System.out.println("Введите слова для предложения. Введите STOP, чтобы закончить.");

        while (true) {
            String word = scanner.next();

            if (word.equalsIgnoreCase("STOP")) {
                break;
            }

            sentence.append(word).append(" ");
        }

        System.out.println("Предложение: " + sentence.toString().trim());
        scanner.close();






    }

}
