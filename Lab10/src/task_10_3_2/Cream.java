package task_10_3_2;

public class Cream extends Decorator {
    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return wrapper.description() + ", Cream";
    }

    @Override
    public float cost() {
        return wrapper.cost() + 0.3f;
    }
}
