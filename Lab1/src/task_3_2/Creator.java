package task_3_2;

public class Creator {
    public Product CreateProduct() {
        Product product = null;
        int random = (int) (Math.random() * 2);
        if (random == 0) {
            product = new Product1();
        } else if (random == 1) {
            product = new Product2();
        }
        return product;
    }

    public void someOperation() {
        Product p = CreateProduct();
        p.doSomething();
    }
}
