package homework10.task3;

public class Main {
    public static void main(String[] args) {
        Father father = new Father("Орест", 150);
        Shopping shopping = new Shopping(father);

        try {
            shopping.buyProduct(new Product(ProductType.APPLE, 6), 3);
            shopping.buyProduct(new Product(ProductType.TOBACCO, 6), 6);
            shopping.printReceipt();
        } catch (UnpleasantSituationException e) {
            System.out.println("Сталася неприємна ситуація: " + e.getMessage());
        }
    }
}
