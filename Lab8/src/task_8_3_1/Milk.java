package task_8_3_1;

public class Milk implements BeverageInfo {
    private final int milkVolume;

    public Milk(int milkVolume) {
        this.milkVolume = milkVolume;
    }

    @Override
    public int cost() {
        return (int) (milkVolume / 20.0);
    }

    @Override
    public String getAdditive() {
        return "молоко";
    }

    @Override
    public int getVolume() {
        return milkVolume;
    }
}
