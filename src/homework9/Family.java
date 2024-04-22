package homework9;

import java.util.Arrays;
import java.util.Objects;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        mother.setFamily(this);
        this.pet = new Pet();
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
    public Human[] getChildren() {
        return children;
    }
    public void setChildren(Human[] children) {
        this.children = children;
    }
    public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }


    public void addChild(Human child) {
        if (children != null) {
            Human[] updatedChildren = Arrays.copyOf(children, children.length + 1);
            updatedChildren[children.length] = child;
            children = updatedChildren;
            child.setFamily(this);
        } else {
            children = new Human[]{child};
            child.setFamily(this);
        }
    }
    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.length) {
            return false;
        }

        Human[] updatedChildren = new Human[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != index) {
                updatedChildren[j++] = children[i];
            }
        }
        children = updatedChildren;
        return true;
    }

    public int countFamily() {
        return children.length + 2;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father)
                && Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

}
