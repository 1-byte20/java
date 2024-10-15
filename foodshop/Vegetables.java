public class Vegetables extends ShopItem{
    public Vegetables(String name, double price, double preservativePercentage){
        this.name = name;
        this.price = price;
        this.preservativePercentage =  preservativePercentage;
        this.daysInTheShop= 0;
    }
    @Override
    public int calculateFreshness() {
        if (daysInTheShop > 3) {
            return 0;
        } else if (daysInTheShop > 1) {
            return 1;
        } else {
            return 2;
        }
    }
}
