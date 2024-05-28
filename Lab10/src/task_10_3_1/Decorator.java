package task_10_3_1;

public abstract class Decorator implements Component {
    private final Component wrapper;

    public Decorator(Component component) {
        this.wrapper = component;
    }

    @Override
    public void print() {
        wrapper.print();
    }
}
