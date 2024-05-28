package task_10_3_1;

public class Main {
    public static void main(String[] args) {

        Component hello;

        hello = new PrintableString("");
        hello = new PostComaDecorator(hello);
        hello = new PostWordDecorator(hello, "World");
        hello = new PreWordDecorator(hello, "Hello");
        hello = new PostExclaimDecorator(hello);
        hello = new PostEndlDecorator(hello);

        hello.print();
    }
}
