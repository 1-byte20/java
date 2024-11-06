public abstract class Cloth extends Wardrobe {
    String type;
    String color;
    int condition;
    int initialCondition;
    int daysWorn;

    public Cloth(String type, String color, int condition, int initialCondition, int daysWorn){
        this.type = type;
        this.color = color;
        this.condition = condition;
        this.initialCondition = initialCondition;
        this.daysWorn = 0;
    }

    public boolean needsToBeWhashed() {
        return false;
    }

    public boolean needsToBeRepaired(){
        return false;
    }

    public int wear(){
        daysWorn++;
        return daysWorn;
    }

    public int wash(){
        return daysWorn = 0;
    }

    public void repair(){
        this.condition = condition;
    }

    public String getInfo(){
        return "Szín: " + this.color + ", viselt: "+ daysWorn + " napok óta, még " + condition + " mosási ciklusok vannak hátra.";
    }



}
