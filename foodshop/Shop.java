import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<ShopItem> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public Shop(List<ShopItem> stock) {
        this.stock = stock;
    }

    public void fillStock(ShopItem item) {
        stock.add(item);
    }

    public List<String> showStock() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < stock.size(); i++) {
            result.add((i + 1) + ". " + stock.get(i).toString());
        }
        return result;
    }

    public double getStockValue() {
        double total = 0;
        for (ShopItem item : stock) {
            total += item.price;
        }
        return total;
    }

    public void sellItems(double price, boolean superHealthy) {
        if (stock.isEmpty()) return;

        for (int i = 0; i < stock.size(); i++) {
            ShopItem item = stock.get(i);
            if ((superHealthy && item.calculateFreshness() == 2 && item.preservativePercentage < 2) || !superHealthy) {
                if (price >= item.price) {
                    price -= item.price;
                    stock.remove(i);
                    i--; // Adjust index after removal
                }
            }
        }
    }

    public void closeShop() {
        for (ShopItem item : stock) {
            item.incrementDaysInTheShop();
            item.reducePrice();
            System.out.println(item);
        }
    }
}
