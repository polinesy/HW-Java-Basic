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

        int lengthWords = words.length;

        int o = words[0].length(), a = words[1].length(),
                b = words[2].length(), c = words[3].length(), d = words[4].length();

        if (o > a){




        }



        //boolean result = words[0].length() > words[1; 2;].length;


        System.out.println("The first word is \"" + words[0].replace(",", "")
                + "\" and it has " + words[0].length() + " symbols");
        System.out.println("The second word is \"" + words[1]
                + "\" and it has " + words[1].length() + " symbols");
        System.out.println();


    }
}
