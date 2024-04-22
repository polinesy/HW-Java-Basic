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
            this.mother.setFamily(this);
            this.father.setFamily(this);
            this.children = new Human[0];
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
            Human[] newChildren = new Human[children.length + 1];
            for (int i = 0; i < children.length; i++) {
                newChildren[i] = children[i];
            }
            newChildren[newChildren.length - 1] = child;
            children = newChildren;
        }
    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.length) return false;
        Human[] newChildren = new Human[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != index) {
                newChildren[j++] = children[i];
            }
        }
        children = newChildren;
        return true;
    }

    public int countFamily() {
        return 2 + children.length;
    }

    @Override
    public String toString() {
        StringBuilder childrenString = new StringBuilder();
        if (children.length > 0) {
            childrenString.append("[").append(children[0].toString());
            for (int i = 1; i < children.length; i++) {
                childrenString.append(", ").append(children[i].toString());
            }
            childrenString.append("]");
        } else {
            childrenString.append("no children");
        }

        return "Family{" +
                "mother=" + (mother != null ? mother.toString() : "no mother") +
                ", father=" + (father != null ? father.toString() : "no father") +
                ", children=" + childrenString +
                ", pet=" + (pet != null ? pet.toString() : "no pet") +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) &&
                Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    }


