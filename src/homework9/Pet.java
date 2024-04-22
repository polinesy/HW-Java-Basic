package homework9;

import java.util.Arrays;

import java.util.Objects;

public class Pet {

    private String species;
    private String nickname;
    int age;
    private int trickLevel;
    private String[] habits;

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        setTrickLevel(trickLevel);
        this.habits = habits;
    }

    public Pet (String species, String nickname){
        this.species = species;
        this.nickname = nickname;

    }

    public Pet(){}

    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        if (trickLevel >= 0 && trickLevel <= 100) {
            this.trickLevel = trickLevel;
        } else {
            throw new IllegalArgumentException("Рівень хитрості має бути в межах від 0 до 100");
        }
    }

    public String[] getHabits() {
        return habits;
    }
    public void setHabits(String[] habits) {
        this.habits = habits;
    }


    public void eat() {
        System.out.println("Я їм!");
    }

    public void respond() {
        System.out.println("Привіт, хазяїн. Я - " + nickname + ". Я скучив!");
    }

    public void foul() {
        System.out.println("Потрібно добре замести сліди...");
    }

    public void greetOwner() {
        System.out.println("Привіт, хазяїн. Я - " + nickname + ".");
    }
    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && Objects.equals(species, pet.species) && Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, age);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }
}