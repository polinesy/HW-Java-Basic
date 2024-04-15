package homework6;

import java.util.Random;
import java.util.Scanner;

public class hw6task2 {
    /*2) Написати програму “стрільба по цілі”.
Технічні вимоги:
• Даний квадрат 5х5, де програма випадковим чином ставить ціль.
• Перед початком гри на екран виводиться текст: All Set. Get ready to rumble!.
• Сам процес гри обробляється у нескінченному циклі.
• Гравцеві пропонується ввести лінію для стрільби; програма перевіряє, щоб було введено число, і введена лінія знаходиться в межах ігрового поля (1-5).
У випадку, якщо гравець помилився, пропонує ввести число ще раз.
• Гравцю пропонується ввести стовпчик для стрільби (має проходити аналогічну перевірку).
• Після кожного пострілу необхідно показувати оновлене ігрове поле у консолі. Клітинки, куди гравець вже стріляв, слід зазначити як *.
• Гра закінчується при попаданні в ціль. Наприкінці гри вивести в консоль фразу You have won!, а також ігрове поле.
• Уражену ціль відзначити як x.
• Завдання повинно бути виконане за допомогою масивів (НЕ використовуйте інтерфейси List, Set, Map).
Приклад виведення в консоль.
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[][] gameBoard = new char[5][5];
        int targetRow = random.nextInt(5);
        int targetCol = random.nextInt(5);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                gameBoard[i][j] = '-';
            }
        }

       // gameBoard[targetRow][targetCol] = 'x';

        System.out.println("All Set. Get ready to rumble!");

        while (true) {
            System.out.print("Enter row (1-5): ");
            int row = scanner.nextInt() - 1;
            System.out.print("Enter column (1-5): ");
            int col = scanner.nextInt() - 1;
            if ((row < 0 || row > 4) || (col < 0 || col > 4)) {
                System.out.println("Invalid input. Row and column must be between 1 and 5.");
                continue;
            }

            gameBoard[row][col] = '*';

            if (row == targetRow && col == targetCol) {
                System.out.println("You have won!");
                break;
            }

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(gameBoard[i][j] + " ");
                }
                System.out.println();
            }
        }

        scanner.close();


    }

}
