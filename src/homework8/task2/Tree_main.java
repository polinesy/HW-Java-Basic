package homework8.task2;

public class Tree_main {
    public static void main(String[] args) {

        Tree tree1 = new Tree("Дуб", 50);
        Tree tree2 = new Tree(200, 15, "Зелений");
        Tree tree3 = new Tree();
        Tree tree4 = new Tree("Береза");

        System.out.println("Дерево 1: тип - " + tree1.type + ", висота - "
                + tree1.height + ", кількість гілок - " + tree1.coutOfsticks + ", колір - " + tree1.colour);
        System.out.println("Дерево 2: тип - " + tree2.type + ", висота - "
                + tree2.height + ", кількість гілок - " + tree2.coutOfsticks + ", колір - " + tree2.colour);
        System.out.println("Дерево 3: тип - " + tree3.type + ", висота - "
                + tree3.height + ", кількість гілок - " + tree3.coutOfsticks + ", колір - " + tree3.colour);
        System.out.println("Дерево 4: тип - " + tree4.type + ", висота - "
                + tree4.height + ", кількість гілок - " + tree4.coutOfsticks + ", колір - " + tree4.colour);

    }
}
