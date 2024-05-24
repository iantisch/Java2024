package task_8_3_1;

public class Coffee extends Beverage {
    final private boolean extra_coffee;

    public Coffee(int sugar, BeverageInfo additive, BeverageType type, boolean extra_coffee) {
        super(sugar, additive, type);
        this.extra_coffee = extra_coffee;
    }

    public Coffee(int sugar, BeverageInfo additive, BeverageType type) {
        this(sugar, additive, type, false);
    }

    @Override
    public void drink() {
        String str = "Вип'ю " + (extra_coffee ? "чьорну " : "") + "каву ";
        if (!additive.getAdditive().equals("гаряча вода")) {
            str += "з " + additive.getAdditive() + " ";
        }
        System.out.println(str + type.getType() + "!");
    }

    @Override
    public void prepare() {
        System.out.println("Додаю кавових зерен...");
        if (extra_coffee) System.out.println("Додадткові кавові зерна...");
        System.out.println("Додаю трохи " + additive.getAdditive() + " : " + additive.getVolume() + " мл...");
        if (sugar > 0) System.out.printf("Додаю трохи цукру: %s кубиків ...%n", sugar);
    }

    @Override
    public int cost() {
        return 10 + additive.cost();
    }
}
