package task_10_3_1;

public class PostWordDecorator extends Decorator {
    private final String word;

    public PostWordDecorator(Component component, String word) {
        super(component);
        this.word = word;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(word);
    }
}
