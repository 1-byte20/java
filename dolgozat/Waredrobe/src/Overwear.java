public class Overwear extends Cloth {
    public Overwear(String color, int condition) {
        super("felsőruházat", color, condition);
    }

    @Override
    public boolean needsToBeWashed() {
        return daysWorn >= 3; // A felsőruházatot három nap használat után kell mosni
    }

    @Override
    public boolean needsToBeRepaired() {
        return condition < initialCondition / 3; // Javítani kell, ha az állapot az eredeti érték harmadára csökken
    }
}