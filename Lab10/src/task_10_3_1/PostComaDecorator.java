package task_10_3_1;

public class PostComaDecorator extends Decorator {
    public PostComaDecorator(Component component) {
        super(component);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(", ");
    }
}
