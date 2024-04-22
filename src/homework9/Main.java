package homework9;

public class Main {
    public static void main(String[] args) {

        //Перша сімʼя
        Pet dog = new Pet("пес", "Іриска", 5, 20, new String[]{"бігати", "гавкати", "просити їжу"});
        Human mother = new Human("Оля", "Швець", 1980);
        Human father = new Human("Віктор", "Швець", 1975);
        Human child = new Human("Міша", "Швець", 2003, 112, dog, mother, father);

        Family family = new Family(mother, father);
        family.setPet(dog);
        family.addChild(child);

        System.out.println();
        System.out.println("Сімʼя один:");
        System.out.println(mother);
        System.out.println(father);
        System.out.println(child);
        System.out.println(dog);

        //Друга сімʼя
        Pet rat = new Pet("пацюк", "Джері", 0, 80, new String[]{"красти сир", "ховатися"});
        Human mother2 = new Human("Марія", "Сивко", 1980);
        Human father2 = new Human("Ігор", "Сивко", 1975);
        Human child2 = new Human("Кирило", "Сивко", 2005, 90, rat, mother2, father2);

        Family family2 = new Family(mother2, father2);
        family2.setPet(rat);
        family2.addChild(child2);

        System.out.println();
        System.out.println("Сімʼя два");
        System.out.println(mother2);
        System.out.println(father2);
        System.out.println(child2);
        System.out.println(rat);


        //Додаємо дитину в другу сімʼю
        Pet cat = new Pet("кіт", "Чорний", 4, 80, new String[]{"бути милим", "стрибати", "моркотіти"});
        Human child4 = new Human("Соня", "Сивко", 2012, 120, cat, mother2, father2);
        family2.addChild(child4);

        System.out.println();
        System.out.println("Сімʼя два після додавання дитини");
        System.out.println(mother2);
        System.out.println(father2);
        System.out.println(child4);
        System.out.println(cat);

        //Взаємодія
        System.out.println();
        System.out.println("Взаємодія");
        child.describePet();
        child.greetPet();
        child.feedPet();
        cat.foul();
        rat.eat();
        dog.respond();








        }

}
