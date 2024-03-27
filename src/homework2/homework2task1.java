package homework2;

public class homework2task1 {

    public static void main(String[] args) {

        /*    1)
        Створити змінну string1 = "This line that i want to cut, cause it is too long".
                Створити рядок string2 у якому має бути розміщено значення рядка string1,
        Обрізане до "This line that i want to cut, cause".
                Створити рядок string3 на основі string2 який міститиме значення
        "This line that don't want to cut, cause it is perfect".
                Вивести на консоль кожне повідомлення та його довжину.*/

        String string1 = "This line that i want to cut, cause it is too long";
        String string2 = string1.substring(0, string1.length() -14);
        String string3 = string2.replace("want", "don't want").concat(" it is perfect");


        System.out.println(string1 + " \n--> Довжина цього рядка: "+string1.length()+" символів");
        System.out.println(string2 + " \n--> Довжина цього рядка: "+string2.length()+" символів");
        System.out.println(string3 + " \n--> Довжина цього рядка: "+string3.length()+" символів");


    }

}
