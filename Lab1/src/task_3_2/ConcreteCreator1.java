package task_3_2;

public class ConcreteCreator1 extends Creator {
    public Product CreateProduct() {
        return new Product1();
    }
}