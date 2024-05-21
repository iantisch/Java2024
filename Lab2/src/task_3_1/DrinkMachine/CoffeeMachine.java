package task_3_1.DrinkMachine;

import task_3_1.Drinks.*;

public class CoffeeMachine extends DrinkMachine {
    @Override
    public HotDrink makeDrink(DrinkType drinkType, int sugar) {
        HotDrink drink;

        if (drinkType instanceof CoffeeType) {
            switch ((CoffeeType) drinkType) {
                case ESPRESSO -> {
                    drink = new Espresso(sugar);
                    System.out.println("Making 'espresso' with " + sugar + " sugar. Drink price: " + drink.getPrice());
                    return drink;
                }
                case AMERICANO -> {
                    drink = new Americano(sugar);
                    System.out.println("Making 'americano' with " + sugar + " sugar. Drink price: " + drink.getPrice());
                    return drink;
                }
                case CAPPUCCINO -> {
                    drink = new Cappuccino(sugar);
                    System.out.println("Making 'cappuccino' with " + sugar + " sugar. Drink price: " + drink.getPrice());
                    return drink;
                }
                case LATTE -> {
                    drink = new Latte(sugar);
                    System.out.println("Making 'latte' with " + sugar + " sugar. Drink price: " + drink.getPrice());
                    return drink;
                }
                default -> throw new IllegalArgumentException("Wrong drink type");
            }
        } else {
            throw new IllegalArgumentException("Wrong drink type");
        }
    }
}
