package homework3;

import java.util.Scanner;

public class hw3task2 {

    public static void main(String[] args) {

/*Користувач вводить з клавіатури три цілі значення. На екран виводиться інформація,
чи можна з цих сторін побудувати трикутник. (Необхідно згадати правило побудови трикутника з трьох сторін). */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть довжини трьох сторін трикутника:");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            System.out.println("З цих сторін можна побудувати трикутник.");
        } else {
            System.out.println("З цих сторін не можна побудувати трикутник.");
        }

        scanner.close();
    }
}
