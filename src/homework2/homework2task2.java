package homework2;

/*Створити рядок string = "Testing, is my favourite job".
Вивести на екран окремо кожне слово та довжину цього слова у вигляді:
Слово1 = (значення слова), Довжина цього слова = (значення довжини слів).
Слово2 = (значення слова), Довжина цього слова = (значення довжини слів).
і т.д.
Вивести на консоль true, якщо перше слово довше інших, в іншому випадку вивести false.*/

public class homework2task2 {
    public static void main(String[] args) {

        String text = "Testing, is my favourite job";

        String[] words = text.split("\\s+");

        //int lengthWords = words.length;

        System.out.println("The first word is \"" + words[0].replace(",", "")
                + "\" and it has " + words[0].length() + " symbols");
        System.out.println("The second word is \"" + words[1]
                + "\" and it has " + words[1].length() + " symbols");
        System.out.println();

        int w1 = words[0].length(), w2 = words[1].length(),
                w3 = words[2].length(), w4 = words[3].length(), w5 = words[4].length();

        if (w1 > w2 && w1 > w3 && w1 > w4 && w1 > w5)
        {System.out.println("The first word is longet than other and it is \nTRUE");
        } else {
            System.out.println("Saying the first word is longer than others is \nFALSE");


        }



    }
}
