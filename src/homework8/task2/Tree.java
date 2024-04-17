package homework8.task2;

public class Tree {
    /*Створити клас Tree із перевантаженими конструкторами.
Необхідно створити одновимірний масив, що складається з максимальних значень
У класі є Tree є поля:
String type; int height, int coutOfsticks, String colour;
Конструктор1 приймає параметри String type; int height і присвоює значення полям coutOfsticks значення 13, колір "Зелений".
Конструктор2 приймає в параметри int height, int coutOfsticks,
String colour і присвоює значення полю type "ялиця".
Констуктор за замовчуванням 3, який надає height = 350, coutOfsticks = 29, сolour = "Жовтий".
Конструктор4 який приймає параметри String type, і викликає у собі конструктор 3.
Створити в окремому класі main 4 об'єкти класу Tree використовуючи 4 створені конструктори.*/

public String type;
public int height;
public int coutOfsticks;
public String colour;

    public Tree(String type, int height) {
        this.type = type;
        this.height = height;
        this.coutOfsticks = 13;
        this.colour = "Зелений";
    }

    public Tree(int height, int coutOfsticks, String colour) {
        this.type = "Ялиця";
        this.height = height;
        this.coutOfsticks = coutOfsticks;
        this.colour = colour;
    }

    public Tree() {
        this.height = 350;
        this.coutOfsticks = 29;
        this.colour = "Жовтий";
    }

    public Tree(String type){
        this(350, 29, "Жовтий");
    }

}
