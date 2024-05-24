package task_8_3_1;

public class Water implements BeverageInfo {
    private final int waterVolume;

    public Water(int waterVolume) {
        this.waterVolume = waterVolume;
    }

    @Override
    public int cost() {
        return 0;
    }

    @Override
    public String getAdditive() {
        return "гаряча вода";
    }

    @Override
    public int getVolume() {
        return waterVolume;
    }
}
