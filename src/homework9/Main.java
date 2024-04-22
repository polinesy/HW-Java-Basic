package homework9;

public class Main {
    /*public static void main(String[] args) {
        String[] catHabits = {"Любить спати на вікні", "Грає з м'ячиком"};
        Pet cat = new Pet("Кіт", "Вишенька", 3, 70, catHabits);
    }*/

    public static void main(String[] args) {

        Pet dog1 = new Pet("пес", "Максік", 1, 3, new String[]{"гризе", "бігає"});
        Pet cat1 = new Pet("кіт", "Тімоша", 11, 70, new String[]{"лінивий", "вимогливий", "розумний"});

        Human father1 = new Human("Ігор", "Смітко", 1975);
        Human mother1 = new Human("Анна", "Смітко", 1980);
        Family family = new Family(mother1, father1);

        Human child1 = new Human("Софія", "Смітко", 2000, mother1, father1);
        Human child2 = new Human("Марія", "Смітко", 2002, mother1, father1);
        family.addChild(child1);
        family.addChild(child2);

        family.setPet(dog1);

        System.out.println("Кількість членів сім'ї: " + family.countFamily());

        System.out.println(family);
        System.out.println();

        System.out.println(father1);
        System.out.println(mother1);
        System.out.println(child1);
        System.out.println(child2);

        System.out.println(dog1);
        System.out.println(cat1);

        child1.greetPet();
        child1.describePet();
        child1.feedPet();



    }

}
