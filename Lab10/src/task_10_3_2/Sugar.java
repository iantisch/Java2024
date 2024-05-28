package task_10_3_2;

public class Sugar extends Decorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return wrapper.description() + ", Sugar";
    }

    @Override
    public float cost() {
        return wrapper.cost() + 0.1f;
    }
}
