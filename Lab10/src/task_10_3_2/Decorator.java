package task_10_3_2;

abstract public class Decorator extends Beverage {

    final protected Beverage wrapper;

    public Decorator(Beverage beverage) {
        this.wrapper = beverage;
    }
}
