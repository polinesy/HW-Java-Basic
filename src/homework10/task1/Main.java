package homework10.task1;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("Магазин \"Алкоголь і не тільки\"", "Ігор", "Анна", "Вино",
                13, 150.0, true, false, true);
        shop.returnCost();

        System.out.println("===========================");

        Shop shop1 = new Shop("Магазин \"Алкоголь і не тільки\"", "Ігор", "Анна", "Пиво",
                13, 150.0, true, true, false);
        shop1.returnCost();
    }
}

