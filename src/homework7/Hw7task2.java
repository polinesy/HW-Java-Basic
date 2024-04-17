package homework7;

public class Hw7task2 {
    /*Написати перевантажений метод, який може:
• Не приймати жодних значень, тоді він виводитиме на консоль повідомлення типу: "Я порожній".
• Приймати як параметри String, тоді він виводитиме на консоль це повідомлення.
• Приймати як параметри масив рядків, тоді він виводитиме на консоль усі його значення через пробіл.
• Приймати як параметр масив чисел, тоді він виводитиме на консоль суму елементів масиву.
• Приймати як параметри число і рядок, тоді він буде виводити на консоль повідомлення типу:
"Ваше повідомлення - "%%%%%%%%", ваше число - $", де "%%%%%%%%%" і $ ваші введені рядок та число відповідно.*/

    //public void Method (String, String[], int,

    public static void main(String[] args) {
        Hw7task2 method = new Hw7task2();
        method.doSmth();
        method.doSmth("Hi, how are you?");
        method.doSmth(new String[] {"Hi", "how", "are", "you?"});
        method.doSmth(new int [] {10, 10, 10});
        method.doSmth("Hi", 7);


    }

    public void doSmth() {
        System.out.println("Я порожній.");
    }

    public void doSmth(String text) {
        System.out.println(text);
    }

    public void doSmth(String [] arr) {
        for (String str : arr){
            System.out.print(str + " ");

            }
        System.out.println();
    }

    public void doSmth (int [] arrayNumbers){
        int sum = 0;
        for (int num : arrayNumbers) {
            sum += num;
        }
        System.out.println("Сума елементів масиву: " + sum);
    }

    public void doSmth(String str, int num) {
        System.out.println("Ваше повідомлення - \"" + str + "\", ваше число - " + num);
    }


}
