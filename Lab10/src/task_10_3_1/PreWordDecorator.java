package task_10_3_1;

public class PreWordDecorator extends Decorator {
    private final String word;

    public PreWordDecorator(Component component, String word) {
        super(component);
        this.word = word;
    }

    @Override
    public void print() {
        System.out.print(word);
        super.print();
    }
}
