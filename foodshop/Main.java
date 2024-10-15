public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.fillStock(new Dairy("milk", 360, 2));
        shop.fillStock(new Vegetable("tomato", 780));

        System.out.println(shop.showStock());

        shop.closeShop();
        System.out.println(shop.getStockValue());

        shop.sellItems(800, true);
        System.out.println(shop.showStock());
    }
}
