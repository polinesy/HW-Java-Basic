package homework4;

import java.util.Scanner;

public class hw4task3 {

    /*Написать проограмму, условно для склада приема металла. Представим, что склад
может хранить определенный вес металла. Пользователь вводит с
клавиатуры вес, который может хранится на складе. Дальше пользователь вводит
с клавиатуры вес, который условно собирается сдать на склад пользователь.
Программа должна после каждой сдачи металла показывать сколько веса еще может принять
склад. Если пользователь хочет сдать металла больше чем осталось места на складе,
то программа не дает ему это сделать и уведомляет пользователя, о невозможности данной операции.
Если пользователь сдает металл весом меньше чем 5, программа тоже предупреждает
о невозможности приемки такого малого веса. Программа завершается, когда
место на складе закончилось.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите объем вашего склада в кг:");
        int maxWeight = scanner.nextInt();
        int currentWeight = 0;

        while (currentWeight < maxWeight){
            System.out.println("Сколько метала вы хотите сдать?");
            int metalPack = scanner.nextInt();

            if (metalPack < 5){
                System.out.println("Невозможно принять: слишком маленький вес.");
                System.out.println("Добавьте еще " + (5 - metalPack) + " кг и попробуйде снова.");
                continue;
            }

            if (currentWeight + metalPack > maxWeight){
                System.out.println("Невозможно принять: недостаточно места на складе.");
                System.out.println("У вас осталось только " + (maxWeight - currentWeight) + " кг свободного места.");
                continue;
            }

            currentWeight += metalPack;

            System.out.println("Ваш метал объемом " + metalPack + " кг принят на склад.");
            System.out.println("У вас осталось " + (maxWeight - currentWeight) + " кг свободного места на складе");

            if (currentWeight >= maxWeight) {
                System.out.println("Ура!!! Склад полностью заполнен!!!!!");
                break;
            }

        }
        scanner.close();
    }

}
