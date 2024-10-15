public abstract class ShopItem {
    public String name;
    public double price;
    public double preservativePercentage;
    public int daysInTheShop;



  public abstract int calculateFreshness();

  public void reducePrice(){
      int freshness = calculateFreshness();
      double oldPrice = price;

      if (freshness == 0) {
          price = Math.max(0, price * 0.5);
          System.out.println("Régi Ár: " + oldPrice + "A csökkentés értéke (-50%): " + price);
      } else if (freshness == 1) {
          price = Math.max(0, price*0.7);
          System.out.println("Régi Ár: " + oldPrice + "A csökkentés értéke (-30%): " + price);
      } else {
          System.out.println("Az árú értéke nem csökkentett: " + oldPrice);
      }

  }
    public String convertFreshnessToString() {
        int freshness = calculateFreshness();
        switch (freshness) {
            case 0: return "Rossz";
            case 1: return "Jó";
            case 2: return "Remek";
            default: throw new IllegalStateException("Nem várt frissességi érték: " + freshness);
        }
    }
     public void incrementDaysInTheShop(){
      daysInTheShop++;
     }

     @Override
    public String toString(){
      return String.format("Termék: " + name +" ,"+ price + " Forint, "+ convertFreshnessToString() + "Frissességű");
    }


}
