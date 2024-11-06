import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Wardrobe {
    private List<Cloth> clothes;

    public Wardrobe() {
        this.clothes = new ArrayList<>();
    }

    public void addCloth(Cloth cloth) {
        clothes.add(cloth);
    }

    public void printInfo() {
        System.out.println("Ruhásszekrény tartalma:");
        for (Cloth cloth : clothes) {
            System.out.println(cloth.getInfo());
        }
    }

    public void washAllClothes() {
        System.out.println("Minden ruha mosása:");
        for (Cloth cloth : clothes) {
            cloth.wash();
        }
    }

    public void repairAllClothes() {
        System.out.println("Minden ruha javítása:");
        for (Cloth cloth : clothes) {
            cloth.repair();
        }
    }

    public List<Cloth> purge() {
        List<Cloth> removedClothes = new ArrayList<>();
        Iterator<Cloth> iterator = clothes.iterator();

        while (iterator.hasNext()) {
            Cloth cloth = iterator.next();
            if (cloth.getState() == 0) {
                removedClothes.add(cloth);
                iterator.remove();
            }
        }

        return removedClothes;
    }

    public int getState() {
        return 0;
    }
}