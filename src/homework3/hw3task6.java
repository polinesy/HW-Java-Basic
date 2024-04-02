package homework3;

import java.util.Scanner;

public class hw3task6 {
    public static void main(String[] args) {
/*Використовуючи оператор switch написати програму, яка виводить на консоль посилання для завантаження програми.
З вибору програм взяти: IntelliJ IDEA, Git, Java.
З вибору ОС взяти: Linux, MacOS, Windows.
Програма повинна запитати користувача, яка програма йому цікава, також запитати яку ОС він використовує,
а після вивести в консоль необхідне посилання. Якщо програма з такою назвою не виводить повідомлення в консоль, про те,
що такої програми не існує. Якщо зазначеної користувачем ОС немає, виводиться повідомлення в консоль, що такої ОС немає.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Виберіть програму для завантаження: IntelliJ IDEA, Git, Java");
        String program = scanner.nextLine();

        System.out.println("Виберіть вашу операційну систему: Linux, MacOS, Windows");
        String OS = scanner.nextLine();

        switch (program) {
            case "IntelliJ IDEA":
                switch (OS) {
                    case "Linux":
                        System.out.println("Посилання для завантаження IntelliJ IDEA для Linux: https://www.jetbrains.com/idea/download/");
                        break;
                    case "MacOS":
                        System.out.println("Посилання для завантаження IntelliJ IDEA для MacOS: https://www.jetbrains.com/idea/download/");
                        break;
                    case "Windows":
                        System.out.println("Посилання для завантаження IntelliJ IDEA для Windows: https://www.jetbrains.com/idea/download/");
                        break;
                    default:
                        System.out.println("Такої ОС немає");
                }
                break;
            case "Git":
                switch (OS) {
                    case "Linux":
                        System.out.println("Посилання для завантаження Git для Linux: https://git-scm.com/download/linux");
                        break;
                    case "MacOS":
                        System.out.println("Посилання для завантаження Git для MacOS: https://git-scm.com/download/mac");
                        break;
                    case "Windows":
                        System.out.println("Посилання для завантаження Git для Windows: https://git-scm.com/download/win");
                        break;
                    default:
                        System.out.println("Такої ОС немає");
                }
                break;
            case "Java":
                switch (OS) {
                    case "Linux":
                        System.out.println("Посилання для завантаження Java для Linux: https://www.oracle.com/java/technologies/javase-jdk11-downloads.html");
                        break;
                    case "MacOS":
                        System.out.println("Посилання для завантаження Java для MacOS: https://www.oracle.com/java/technologies/javase-jdk11-downloads.html");
                        break;
                    case "Windows":
                        System.out.println("Посилання для завантаження Java для Windows: https://www.oracle.com/java/technologies/javase-jdk11-downloads.html");
                        break;
                    default:
                        System.out.println("Такої ОС немає");
                }
                break;
            default:
                System.out.println("Такої програми не існує");


                scanner.close();

        }

    }
    }
