package homework9;

public class Human {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private Family family;

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

    public Human (String name, String surname, int year){
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getIq() {
        return iq;
    }
    public void setIq(int iq) {
        if (iq >= 0 && iq <= 150) {
            this.iq = iq;
        } else {
            throw new IllegalArgumentException("Рівень IQ має бути в межах від 0 до 150");
        }
    }
    public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public Human getMother() {
        return mother;
    }
    public void setMother(Human mother) {
        this.mother = mother;
    }
    public Human getFather() {
        return father;
    }
    public void setFather(Human father) {
        this.father = father;
    }

    public void greetPet() {
        System.out.println("Привіт, " + pet.getNickname() + "!");
    }
    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }


    public void describePet() {
        String trickLevelDescription = (pet.getTrickLevel() > 50) ? "дуже хитрий" : "майже не хитрий";
        System.out.println("У мене є " + pet.getSpecies() + ", їй " +
                pet.getAge() + " років, він " + trickLevelDescription + ".");
    }

    public void feedPet() {
        System.out.println("Годую тварину.");
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother=" + mother.getName() + " " + mother.getSurname() +
                ", father=" + father.getName() + " " + father.getSurname() +
                ", pet=" + pet +
                '}';
    }
    
}

