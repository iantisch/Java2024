package task_10_3_2;

public class WhippedCream extends Decorator {
    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return wrapper.description() + ", Whipped cream";
    }

    @Override
    public float cost() {
        return wrapper.cost() + 0.3f;
    }
}
