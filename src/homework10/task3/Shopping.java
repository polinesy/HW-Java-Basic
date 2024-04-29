package homework10.task3;

import java.util.ArrayList;
import java.util.List;

public class Shopping {
    private Father father;
    private List<Product> products;

    public Shopping(Father father) {
        this.father = father;
        this.products = new ArrayList<>();
    }

    public void buyProduct(Product product, int quantity) throws UnpleasantSituationException {
        double totalPrice = product.getPrice() * quantity;
        if (totalPrice > father.getMoney()) {
            throw new UnpleasantSituationException("Загальна ціна перевищує батьківські гроші!");
        }
        if (product.getType() == ProductType.BEER || product.getType() == ProductType.TOBACCO) {
            throw new UnpleasantSituationException("Батько не може принести додому пиво чи тютюн!");
        }
        if (quantity % 3 != 0) {
            throw new UnpleasantSituationException("Кількість " + product.getType() + " має ділитися на 3!!!");
        }
        father.money -= totalPrice;
        products.add(new Product(product.getType(), quantity));
    }

    public void printReceipt() {
        double totalCost = 0;
        System.out.println("Dear " + father.getName() + ", the cost of your purchases is:");
        for (Product product : products) {
            double cost = product.getPrice() * product.getType().ordinal();
            totalCost += cost;
            System.out.println(product.getType() + " quantity: " + product.getType().ordinal() + ", cost: " + cost);
        }
        System.out.println("Total cost: " + totalCost);
    }
}
