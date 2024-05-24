package task_8_3_1;

public class Tee extends Beverage {
    public Tee(int sugar, BeverageInfo additive, BeverageType type) {
        super(sugar, additive, type);
    }

    @Override
    public void drink() {
        String str = "Вип'ю ";
        if (!additive.getAdditive().equals("гаряча вода")) {
            str += "чай з " + additive.getAdditive() + " ";
        }
        else {
            str += "чорний чай ";
        }
        System.out.println(str + type.getType() + "!");
    }

    @Override
    public void prepare() {
        System.out.println("Додаю трохи чайних листів...");
        System.out.println("Додаю трохи " + additive.getAdditive() + " : " + additive.getVolume() + " мл...");
        if (sugar > 0) System.out.printf("Додаю трохи цукру: %s кубиків ...%n", sugar);
    }

    @Override
    public int cost() {
        return 7 + additive.cost();
    }
}
