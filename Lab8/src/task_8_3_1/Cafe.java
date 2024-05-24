package task_8_3_1;

public class Cafe {

    public static void main(String[] args) {
        Chocolate blackChocolate = new Chocolate(3, new Water(200), new Inside());
        Coffee blackCoffee = new Coffee(3, new Water(200), new Inside(), true);
        Tee blackTee = new Tee(0, new Water(300), new Inside());

        beverageInfo(blackChocolate);
        beverageInfo(blackCoffee);
        beverageInfo(blackTee);

        Chocolate milkChocolate = new Chocolate(3, new Milk(200), new Outside());
        Coffee coffeeWithMilk = new Coffee(3, new Milk(200), new Outside());
        Tee teeWithMilk = new Tee(2, new Milk(300), new Outside());

        beverageInfo(milkChocolate);
        beverageInfo(coffeeWithMilk);
        beverageInfo(teeWithMilk);
    }

    private static void beverageInfo(Beverage beverage) {

        System.out.println("=========================");

        beverage.prepare();
        System.out.printf("Ціна напою: %s грн\n",  beverage.cost());
        beverage.drink();
    }

}
