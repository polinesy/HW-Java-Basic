package homework10.task1;

public class Shop implements Purchase {

    private String shopName;
    private String sellerName;
    private String buyerName;
    private String productName;
    private int buyerAge;
    private double productCost;
    private boolean isAlcohol;
    private boolean isHonest;
    private boolean hasDiscountCard;

    public Shop(String shopName, String sellerName, String buyerName, String productName, int buyerAge, double productCost, boolean isAlcohol, boolean isHonest, boolean hasDiscountCard) {
        this.shopName = shopName;
        this.sellerName = sellerName;
        this.buyerName = buyerName;
        this.productName = productName;
        this.buyerAge = buyerAge;
        this.productCost = productCost;
        this.isAlcohol = isAlcohol;
        this.isHonest = isHonest;
        this.hasDiscountCard = hasDiscountCard;
    }

    @Override
    public void returnCost() {
        double finalCost = productCost;

        if (isAlcohol && isHonest && buyerAge < 18) {
            System.out.println("Вибачте, продаж алкоголю не дозволено для даного покупця.");
            return;
        }else{
            System.out.println("Шановний " + buyerName + ", продавець " + sellerName + " нашого магазину \"" + shopName +
                    "\", продасть вам цей товар \"" + productName + "\", у них є алкогольна продукція, а ваш вік " +
                    buyerAge + ". Вартість вашої покупки дорівнює " + finalCost + ".");
        }

        if (hasDiscountCard) {
            finalCost *= 0.9;
            System.out.println("Вам надається знижка 10%!");
        }


    }


}
