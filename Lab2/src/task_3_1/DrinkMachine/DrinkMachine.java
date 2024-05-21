package task_3_1.DrinkMachine;

import task_3_1.Drinks.HotDrink;

public abstract class DrinkMachine {
    public abstract HotDrink makeDrink(DrinkType drinkType, int sugar);
}
