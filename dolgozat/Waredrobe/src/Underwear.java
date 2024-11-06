class Underwear extends Cloth {
    public Underwear(String color, int condition) {
        super("alsóruházat", color, condition);
    }

    @Override
    public boolean needsToBeWashed() {
        return daysWorn >= 1; // Az alsóruházatot egy használat után ki kell mosni
    }

    @Override
    public boolean needsToBeRepaired() {
        return condition < initialCondition / 2; // Javítani kell, ha az állapot az eredeti érték felére csökken
    }
}