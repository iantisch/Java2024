package task_8_3_1;

public class Chocolate extends Beverage {
    public Chocolate(int sugar, BeverageInfo additive, BeverageType type) {
        super(sugar, additive, type);
    }

    @Override
    public void drink() {
        String str = "Вип'ю шоколадний напій ";
        if (!additive.getAdditive().equals("гаряча вода")) {
            str += "з " + additive.getAdditive() + " ";
        }
        System.out.println(str + type.getType() + "!");
    }

    @Override
    public void prepare() {
        System.out.println("Додаю шоколаду...");
        System.out.println("Додаю трохи " + additive.getAdditive() + " : " + additive.getVolume() + " мл...");
        if (sugar > 0) System.out.printf("Додаю трохи цукру: %s кубиків ...%n", sugar);
    }

    @Override
    public int cost() {
        return 15 + additive.cost();
    }
}
