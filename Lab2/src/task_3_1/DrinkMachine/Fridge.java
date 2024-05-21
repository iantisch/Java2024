package task_3_1.DrinkMachine;

import task_3_1.Drinks.*;

public class Fridge extends DrinkMachine {
    @Override
    public HotDrink makeDrink(DrinkType drinkType, int sugar) {
        HotDrink drink;

        if (drinkType instanceof ColdDrinks) {
            switch ((ColdDrinks) drinkType) {
                case WATER -> {
                    drink = new Water();
                    System.out.println("A bottle of watter." + " Drink price: " + drink.getPrice());
                    return drink;
                }
                case JUICE -> {
                    drink = new Juice();
                    System.out.println("Making a glass of 'juice. ' " + " Drink price: " + drink.getPrice());
                    return drink;
                }
                default -> throw new IllegalArgumentException("Wrong drink type");
            }
        } else {
            throw new IllegalArgumentException("Wrong drink type");
        }
    }
}
