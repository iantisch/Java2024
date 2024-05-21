package task_3_1.DrinkMachine;

public enum IngredientType {
    MILK,
    COFFEEBEANS,
    FRUIT,
    SUGAR,
    WATER;

    private static double milkPrice = 10;
    private static double coffeeBeansPrice = 30;
    private static double fruitprice = 40;
    private static double sugarPrice = 5;
    private static double waterPrice = 5;

    public double getPrice(){
        return switch (this) {
            case MILK -> milkPrice;
            case COFFEEBEANS -> coffeeBeansPrice;
            case FRUIT -> fruitprice;
            case SUGAR -> sugarPrice;
            case WATER -> waterPrice;
        };
    }

    public static void setPrice(IngredientType ingredientType, int price) {
        switch (ingredientType) {
            case MILK -> milkPrice = price;
            case COFFEEBEANS -> coffeeBeansPrice = price;
            case FRUIT -> fruitprice = price;
            case SUGAR -> sugarPrice = price;
            case WATER -> waterPrice = price;
        }
    }
}
