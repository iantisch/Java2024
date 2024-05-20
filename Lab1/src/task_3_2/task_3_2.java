package task_3_2;

public class task_3_2 {
    public static void main(String[] args) {
        Creator creator1 = new ConcreteCreator1();
        creator1.someOperation();
        Creator creator2 = new ConcreteCreator2();
        creator2.someOperation();

        Creator creator3 = new Creator();
        creator3.someOperation();
    }
}
